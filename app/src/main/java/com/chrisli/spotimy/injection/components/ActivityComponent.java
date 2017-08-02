package com.chrisli.spotimy.injection.components;

import com.chrisli.spotimy.ui.activities.ActivityScoped;
import com.chrisli.spotimy.ui.activities.LoginActivity;

import dagger.Component;

/**
 * Created by Chris Li on 2017-08-01.
 */
@ActivityScoped
@Component(dependencies = ApplicationComponent.class)
public interface ActivityComponent {
    void inject(LoginActivity loginActivity);
}
