package com.chrisli.spotimy.ui.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.chrisli.spotimy.MainActivity;
import com.chrisli.spotimy.presenters.DispatchPresenter;
import com.chrisli.spotimy.ui.activities.base.BaseActivity;
import com.chrisli.spotimy.ui.views.DispatchView;

import javax.inject.Inject;

/**
 * Created by Chris Li on 2017-08-02.
 */

public class DispatchActivity extends BaseActivity implements DispatchView {

    @Inject
    DispatchPresenter mPresenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getActivityComponent().inject(this);
        mPresenter.setView(this);
    }

    @Override
    protected int getLayoutId() {
        return 0;
    }

    @Override
    public void navigateToLoginActivity() {
        startActivity(new Intent(this, LoginActivity.class));
        finish();
    }

    @Override
    public void navigateToMainActivity() {
        startActivity(new Intent(this, MainActivity.class));
        finish();
    }
}
