package com.chrisli.spotimy.ui.fragments.base;

import android.arch.lifecycle.LifecycleRegistry;
import android.arch.lifecycle.LifecycleRegistryOwner;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.chrisli.spotimy.MainApplication;
import com.chrisli.spotimy.injection.components.ApplicationComponent;
import com.chrisli.spotimy.injection.components.DaggerFragmentComponent;
import com.chrisli.spotimy.injection.components.FragmentComponent;

import butterknife.ButterKnife;

/**
 * Created by Chris Li on 2017-07-27.
 */

public abstract class BaseFragment extends Fragment implements LifecycleRegistryOwner {

    protected final String TAG = this.getClass().getSimpleName();

    private final LifecycleRegistry mLifecycleRegistry = new LifecycleRegistry(this);

    protected FragmentComponent mComponent;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        injection();
    }

    private void injection() {
        ApplicationComponent applicationComponent = ((MainApplication) getActivity().getApplication()).getApplicationComponent();
        mComponent = DaggerFragmentComponent.builder()
                .applicationComponent(applicationComponent)
                .build();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(getLayoutId(), container, false);
        ButterKnife.bind(this, view);
        return view;
    }

    protected FragmentComponent getFragmentComponent() {
        return mComponent;
    }

    protected abstract int getLayoutId();

    @Override
    public LifecycleRegistry getLifecycle() {
        return mLifecycleRegistry;
    }
}
