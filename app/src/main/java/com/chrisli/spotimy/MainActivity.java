package com.chrisli.spotimy;

import android.os.Bundle;

import com.chrisli.spotimy.presenters.MainPresenter;
import com.chrisli.spotimy.ui.activities.base.BaseActivity;
import com.chrisli.spotimy.ui.views.MainView;

import javax.inject.Inject;

public class MainActivity extends BaseActivity implements MainView {

    @Inject
    MainPresenter mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getActivityComponent().inject(this);
        mPresenter.setView(this);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }
}
