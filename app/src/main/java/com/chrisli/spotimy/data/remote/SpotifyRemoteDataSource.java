package com.chrisli.spotimy.data.remote;

import com.chrisli.spotimy.data.SpotifyDataSource;
import com.chrisli.spotimy.managers.UserManager;
import com.chrisli.spotimy.models.Album;
import com.chrisli.spotimy.network.SpotifyApiService;
import com.chrisli.spotimy.network.SpotifyRestClient;

import javax.inject.Inject;
import javax.inject.Singleton;

import io.reactivex.Observable;

/**
 * Created by Chris Li on 2017-07-31.
 */
@Singleton
public class SpotifyRemoteDataSource implements SpotifyDataSource {

    private SpotifyApiService mWebService;

    @Inject
    public SpotifyRemoteDataSource(UserManager userManager) {
        mWebService = new SpotifyRestClient(userManager).create();
    }

    @Override
    public Observable<Album> getAlbum(String albumId) {
        return mWebService.getAlbum(albumId);
    }
}
