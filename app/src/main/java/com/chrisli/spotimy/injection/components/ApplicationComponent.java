package com.chrisli.spotimy.injection.components;

import android.content.Context;

import com.chrisli.spotimy.data.SpotifyRepository;
import com.chrisli.spotimy.events.EventBus;
import com.chrisli.spotimy.injection.modules.ApplicationModule;
import com.chrisli.spotimy.injection.modules.RepositoryModule;
import com.chrisli.spotimy.managers.PreferenceManager;
import com.chrisli.spotimy.managers.UserManager;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Chris Li on 2017-07-31.
 */
@Singleton
@Component(modules = {ApplicationModule.class, RepositoryModule.class})
public interface ApplicationComponent {

    Context getContext();

    EventBus getEventBus();

    UserManager getUserManager();

    PreferenceManager getPreferenceManager();

    SpotifyRepository getSpotifyRepository();

}
