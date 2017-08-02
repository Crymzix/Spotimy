package com.chrisli.spotimy.injection.components;

import com.chrisli.spotimy.ui.fragments.base.FragmentScoped;

import dagger.Component;

/**
 * Created by Chris Li on 2017-08-01.
 */
@FragmentScoped
@Component(dependencies = ApplicationComponent.class)
public interface FragmentComponent {

}
