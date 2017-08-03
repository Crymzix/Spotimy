package com.chrisli.spotimy.presenters;

import com.chrisli.spotimy.data.SpotifyRepository;
import com.chrisli.spotimy.events.EventBus;
import com.chrisli.spotimy.managers.PreferenceManager;
import com.chrisli.spotimy.managers.UserManager;
import com.chrisli.spotimy.ui.views.MainView;

import javax.inject.Inject;

/**
 * Created by Chris Li on 2017-08-02.
 */
public class MainPresenter extends BasePresenter<MainView> {

    private SpotifyRepository mSpotifyRepository;

    @Inject
    public MainPresenter(EventBus eventBus, UserManager userManager, PreferenceManager preferenceManager, SpotifyRepository spotifyRepository) {
        super(eventBus, userManager, preferenceManager);
        this.mSpotifyRepository = spotifyRepository;
    }

    @Override
    protected void onAttach() {
        super.onAttach();
    }
}
