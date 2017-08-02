package com.chrisli.spotimy.managers;


import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * Created by Chris Li on 2017-07-27.
 */
@Singleton
public class UserManager {

    private static final String TAG = UserManager.class.getSimpleName();

    private PreferenceManager mPreferenceManager;

    private String mSpotifyAccessToken = null;

    @Inject
    public UserManager(PreferenceManager preferenceManager) {
        this.mPreferenceManager = preferenceManager;
    }

    public void setSpotifyAccessToken(String accessToken) {
        this.mSpotifyAccessToken = accessToken;
        mPreferenceManager.put(PreferenceManager.SPOTIFY_ACCESS_TOKEN_KEY, accessToken);
    }

    public String getSpotifyAccessToken() {
        if (mSpotifyAccessToken == null) {
            mSpotifyAccessToken = mPreferenceManager.get(PreferenceManager.SPOTIFY_ACCESS_TOKEN_KEY, null);
        }
        return mSpotifyAccessToken;
    }

}
