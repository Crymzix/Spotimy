package com.chrisli.spotimy.presenters;

import com.chrisli.spotimy.events.EventBus;
import com.chrisli.spotimy.managers.PreferenceManager;
import com.chrisli.spotimy.managers.UserManager;

import javax.inject.Inject;

/**
 * Created by Chris Li on 2017-08-01.
 */
public class LoginPresenter extends BasePresenter {

    @Inject
    public LoginPresenter(EventBus eventBus, UserManager userManager, PreferenceManager preferenceManager) {
        super(eventBus, userManager, preferenceManager);

    }
}
