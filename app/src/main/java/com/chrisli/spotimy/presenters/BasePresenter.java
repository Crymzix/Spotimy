package com.chrisli.spotimy.presenters;

import com.chrisli.spotimy.data.SpotifyRepository;
import com.chrisli.spotimy.events.EventBus;
import com.chrisli.spotimy.managers.PreferenceManager;
import com.chrisli.spotimy.managers.UserManager;

/**
 * Created by Chris Li on 2017-07-27.
 */

public abstract class BasePresenter {

    protected final String TAG = this.getClass().getSimpleName();

    protected EventBus mEventBus;
    protected UserManager mUserManager;
    protected PreferenceManager mPreferenceManager;

    public BasePresenter(EventBus eventBus, UserManager userManager, PreferenceManager preferenceManager) {
        this.mEventBus = eventBus;
        this.mUserManager = userManager;
        this.mPreferenceManager = preferenceManager;
    }


}
