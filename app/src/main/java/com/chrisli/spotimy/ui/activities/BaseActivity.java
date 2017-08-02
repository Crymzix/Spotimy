package com.chrisli.spotimy.ui.activities;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.chrisli.spotimy.MainApplication;
import com.chrisli.spotimy.injection.components.ActivityComponent;
import com.chrisli.spotimy.injection.components.ApplicationComponent;
import com.chrisli.spotimy.injection.components.DaggerActivityComponent;

import butterknife.ButterKnife;

/**
 * Created by Chris Li on 2017-07-27.
 */

public abstract class BaseActivity extends AppCompatActivity {

    protected final String TAG = this.getClass().getSimpleName();

    protected ActivityComponent mComponent;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutId());
        ButterKnife.bind(this);
        injection();
    }

    private void injection() {
        ApplicationComponent applicationComponent = ((MainApplication) getApplication()).getApplicationComponent();
        mComponent = DaggerActivityComponent.builder()
                .applicationComponent(applicationComponent)
                .build();
    }

    protected abstract int getLayoutId();

    protected ActivityComponent getActivityComponent() {
        return mComponent;
    }
}
