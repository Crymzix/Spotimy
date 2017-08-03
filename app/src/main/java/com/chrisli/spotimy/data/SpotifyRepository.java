package com.chrisli.spotimy.data;

import com.chrisli.spotimy.data.local.Local;
import com.chrisli.spotimy.data.remote.Remote;
import com.chrisli.spotimy.models.Album;

import javax.inject.Inject;
import javax.inject.Singleton;

import io.reactivex.Observable;

/**
 * Created by Chris Li on 2017-07-31.
 */

@Singleton
public class SpotifyRepository implements SpotifyDataSource {

    private final SpotifyDataSource mSpotifyRemoteDataSource;
    private final SpotifyDataSource mSpotifyLocalDataSource;

    @Inject
    public SpotifyRepository(@Remote SpotifyDataSource remoteDataSource, @Local SpotifyDataSource localDataSource) {
        this.mSpotifyRemoteDataSource = remoteDataSource;
        this.mSpotifyLocalDataSource = localDataSource;
    }

    @Override
    public Observable<Album> getAlbum(String albumId) {
        return mSpotifyRemoteDataSource.getAlbum(albumId);
    }
}
