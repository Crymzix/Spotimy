package com.chrisli.spotimy.network;

import com.chrisli.spotimy.models.Album;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by Chris Li on 2017-07-27.
 */

public interface SpotifyApiService {

    @GET("/v1/albums/{id}")
    Observable<Album> getAlbum(@Path("id") String albumId);
}
