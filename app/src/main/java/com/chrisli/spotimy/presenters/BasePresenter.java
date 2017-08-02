package com.chrisli.spotimy.presenters;

import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.OnLifecycleEvent;

import com.chrisli.spotimy.events.EventBus;
import com.chrisli.spotimy.managers.PreferenceManager;
import com.chrisli.spotimy.managers.UserManager;
import com.chrisli.spotimy.ui.views.BaseView;

/**
 * Created by Chris Li on 2017-07-27.
 */

public abstract class BasePresenter<V extends BaseView> implements LifecycleObserver {

    protected final String TAG = this.getClass().getSimpleName();

    protected EventBus mEventBus;
    protected UserManager mUserManager;
    protected PreferenceManager mPreferenceManager;

    protected V mView;

    public BasePresenter(EventBus eventBus, UserManager userManager, PreferenceManager preferenceManager) {
        this.mEventBus = eventBus;
        this.mUserManager = userManager;
        this.mPreferenceManager = preferenceManager;
    }

    public void setView(V view) {
        this.mView = view;
        if (mView instanceof LifecycleOwner) {
            ((LifecycleOwner) mView).getLifecycle().addObserver(this);
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    protected void onAttach() {

    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    protected void onDetach() {

    }

}
