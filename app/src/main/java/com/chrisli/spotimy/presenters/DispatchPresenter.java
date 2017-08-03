package com.chrisli.spotimy.presenters;

import com.chrisli.spotimy.events.EventBus;
import com.chrisli.spotimy.managers.PreferenceManager;
import com.chrisli.spotimy.managers.UserManager;
import com.chrisli.spotimy.ui.views.DispatchView;

import javax.inject.Inject;

import io.reactivex.annotations.NonNull;

/**
 * Created by Chris Li on 2017-08-02.
 */

public class DispatchPresenter extends BasePresenter<DispatchView> {

    @Inject
    public DispatchPresenter(EventBus eventBus, UserManager userManager, PreferenceManager preferenceManager) {
        super(eventBus, userManager, preferenceManager);
    }

    @Override
    protected void onAttach() {
        super.onAttach();
        if (mUserManager.getSpotifyAccessToken() == null) {
            mView.navigateToLoginActivity();
        } else {
            mView.navigateToMainActivity();
        }
    }
}
