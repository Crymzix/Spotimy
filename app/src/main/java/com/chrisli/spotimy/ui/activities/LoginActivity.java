package com.chrisli.spotimy.ui.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.chrisli.spotimy.MainActivity;
import com.chrisli.spotimy.R;
import com.chrisli.spotimy.presenters.LoginPresenter;
import com.chrisli.spotimy.ui.activities.base.BaseActivity;
import com.chrisli.spotimy.ui.views.LoginView;

import javax.inject.Inject;

import butterknife.OnClick;

/**
 * Created by Chris Li on 2017-07-31.
 */

public class LoginActivity extends BaseActivity implements LoginView {

    @Inject
    LoginPresenter mPresenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getActivityComponent().inject(this);
        mPresenter.setView(this);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_login;
    }

    @OnClick(R.id.login_button)
    public void onLoginButtonClicked() {
        mPresenter.login(this);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        mPresenter.onActivityResult(requestCode, resultCode, data);
    }

    @Override
    public void navigateToMainActivity() {
        startActivity(new Intent(this, MainActivity.class));
        finish();
    }
}
