package com.chrisli.spotimy.injection.modules;

import com.chrisli.spotimy.data.SpotifyDataSource;
import com.chrisli.spotimy.data.local.Local;
import com.chrisli.spotimy.data.local.SpotifyLocalDataSource;
import com.chrisli.spotimy.data.remote.Remote;
import com.chrisli.spotimy.data.remote.SpotifyRemoteDataSource;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Chris Li on 2017-08-01.
 */
@Module
public class RepositoryModule {

    @Singleton
    @Provides
    @Local
    SpotifyDataSource provideSpotifyLocalDataSource() {
        return new SpotifyLocalDataSource();
    }

    @Singleton
    @Provides
    @Remote
    SpotifyDataSource provideSpotifyRemoteDataSource() {
        return new SpotifyRemoteDataSource();
    }
}
