package com.chrisli.spotimy.presenters;

import android.app.Activity;
import android.content.Intent;
import android.util.Log;

import com.chrisli.spotimy.R;
import com.chrisli.spotimy.events.EventBus;
import com.chrisli.spotimy.managers.PreferenceManager;
import com.chrisli.spotimy.managers.UserManager;
import com.chrisli.spotimy.ui.views.LoginView;
import com.spotify.sdk.android.authentication.AuthenticationClient;
import com.spotify.sdk.android.authentication.AuthenticationRequest;
import com.spotify.sdk.android.authentication.AuthenticationResponse;

import javax.inject.Inject;

/**
 * Created by Chris Li on 2017-08-01.
 */
public class LoginPresenter extends BasePresenter<LoginView> {

    private static final int AUTH_REQUEST_CODE = 101;
    private static final String REDIRECT_URI = "chrisli://spotimy";

    @Inject
    public LoginPresenter(EventBus eventBus, UserManager userManager, PreferenceManager preferenceManager) {
        super(eventBus, userManager, preferenceManager);
    }

    public void login(Activity activity) {
        AuthenticationRequest.Builder builder = new AuthenticationRequest.Builder(activity.getString(R.string.spotify_client_id), AuthenticationResponse.Type.TOKEN, REDIRECT_URI);
        builder.setScopes(new String[]{"streaming"});
        AuthenticationRequest request = builder.build();

        AuthenticationClient.openLoginActivity(activity, AUTH_REQUEST_CODE, request);
    }

    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == AUTH_REQUEST_CODE) {
            AuthenticationResponse response = AuthenticationClient.getResponse(resultCode, data);
            switch (response.getType()) {

                case TOKEN:
                    mUserManager.setSpotifyAccessToken(response.getAccessToken());
                    mView.navigateToMainActivity();
                    break;

                case ERROR:

                    break;

                default:

                    break;
            }
        }
    }
}
