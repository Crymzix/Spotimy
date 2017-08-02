package com.chrisli.spotimy.injection.modules;

import android.content.Context;

import com.chrisli.spotimy.data.SpotifyRepository;
import com.chrisli.spotimy.events.EventBus;
import com.chrisli.spotimy.managers.PreferenceManager;
import com.chrisli.spotimy.managers.UserManager;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Chris Li on 2017-07-31.
 */

@Module
public class ApplicationModule {

    private final Context mContext;

    public ApplicationModule(Context context) {
        mContext = context;
    }

    @Provides
    Context provideContext() {
        return mContext;
    }

    @Singleton
    @Provides
    EventBus provideEventBus() {
        return new EventBus();
    }

    @Singleton
    @Provides
    UserManager provideUserManager() {
        return new UserManager();
    }

    @Singleton
    @Provides
    PreferenceManager providePreferenceManager() {
        return new PreferenceManager();
    }

}
