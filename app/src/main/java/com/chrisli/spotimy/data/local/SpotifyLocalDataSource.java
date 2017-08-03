package com.chrisli.spotimy.data.local;

import com.chrisli.spotimy.data.SpotifyDataSource;
import com.chrisli.spotimy.models.Album;

import javax.inject.Inject;
import javax.inject.Singleton;

import io.reactivex.Observable;

/**
 * Created by Chris Li on 2017-07-31.
 */
@Singleton
public class SpotifyLocalDataSource implements SpotifyDataSource {

    @Inject
    public SpotifyLocalDataSource() {

    }

    @Override
    public Observable<Album> getAlbum(String albumId) {
        return null;
    }
}
