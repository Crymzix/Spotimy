package com.chrisli.spotimy.injection.components;

import com.chrisli.spotimy.MainActivity;
import com.chrisli.spotimy.ui.activities.DispatchActivity;
import com.chrisli.spotimy.ui.activities.LoginActivity;
import com.chrisli.spotimy.ui.activities.base.ActivityScoped;

import dagger.Component;

/**
 * Created by Chris Li on 2017-08-01.
 */
@ActivityScoped
@Component(dependencies = ApplicationComponent.class)
public interface ActivityComponent {

    void inject(LoginActivity loginActivity);

    void inject(DispatchActivity dispatchActivity);

    void inject(MainActivity mainActivity);
}
