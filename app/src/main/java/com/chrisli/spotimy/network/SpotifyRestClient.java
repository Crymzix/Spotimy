package com.chrisli.spotimy.network;

import com.chrisli.spotimy.BuildConfig;
import com.chrisli.spotimy.managers.UserManager;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.concurrent.TimeUnit;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Chris Li on 2017-07-31.
 */

public class SpotifyRestClient {

    public static final String SPOTIFY_WEB_API_ENDPOINT = "https://api.spotify.com/v1";

    private String mAccessToken = null;

    private static Gson mGson;

    public SpotifyRestClient(UserManager userManager) {
        mAccessToken = userManager.getSpotifyAccessToken();
        configureGson();
    }

    private void configureGson() {
        mGson = new GsonBuilder().create();
    }

    private OkHttpClient configureOkHttp() {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();

        Interceptor interceptor = chain -> {
            Request.Builder requestBuilder = chain.request().newBuilder();

            if (mAccessToken != null) {
                requestBuilder.addHeader("Authorization", "Bearer " + mAccessToken);
            }

            Request request = requestBuilder.build();
            return chain.proceed(request);
        };

        if (BuildConfig.DEBUG) {
            HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
            logging.setLevel(HttpLoggingInterceptor.Level.BODY);
            builder.addInterceptor(logging);
        }

        return builder.addInterceptor(interceptor)
                .connectTimeout(60, TimeUnit.SECONDS)
                .readTimeout(60, TimeUnit.SECONDS)
                .build();
    }

    public SpotifyApiService create() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(SPOTIFY_WEB_API_ENDPOINT)
                .addConverterFactory(GsonConverterFactory.create(mGson))
                .addCallAdapterFactory(RxJava2CallAdapterFactory.createAsync())
                .client(configureOkHttp())
                .build();
        return retrofit.create(SpotifyApiService.class);
    }
}
