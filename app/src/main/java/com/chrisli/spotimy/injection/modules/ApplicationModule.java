package com.chrisli.spotimy.injection.modules;

import android.content.Context;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Chris Li on 2017-07-31.
 */

@Module
public class ApplicationModule {

    private final Context mContext;

    ApplicationModule(Context context) {
        mContext = context;
    }

    @Provides
    Context provideContext() {
        return mContext;
    }
}
