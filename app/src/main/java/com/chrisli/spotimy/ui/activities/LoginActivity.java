package com.chrisli.spotimy.ui.activities;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.chrisli.spotimy.R;
import com.chrisli.spotimy.presenters.LoginPresenter;

import javax.inject.Inject;

/**
 * Created by Chris Li on 2017-07-31.
 */

public class LoginActivity extends BaseActivity {

    @Inject
    LoginPresenter mPresenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getActivityComponent().inject(this);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_login;
    }
}
