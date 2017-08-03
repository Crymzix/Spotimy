package com.chrisli.spotimy;

import android.support.multidex.MultiDexApplication;

import com.chrisli.spotimy.injection.components.ApplicationComponent;
import com.chrisli.spotimy.injection.components.DaggerApplicationComponent;
import com.chrisli.spotimy.injection.modules.ApplicationModule;
import com.chrisli.spotimy.injection.modules.RepositoryModule;

import io.realm.Realm;

/**
 * Created by Chris Li on 2017-07-27.
 */

public class MainApplication extends MultiDexApplication {

    private ApplicationComponent mApplicationComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        Realm.init(this);
        injection();
    }

    private void injection() {
        mApplicationComponent = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(getApplicationContext()))
                .repositoryModule(new RepositoryModule())
                .build();
    }

    public ApplicationComponent getApplicationComponent() {
        return mApplicationComponent;
    }

}
