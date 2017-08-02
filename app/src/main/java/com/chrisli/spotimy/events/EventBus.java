package com.chrisli.spotimy.events;

import android.util.Log;

import com.jakewharton.rxrelay2.BehaviorRelay;


import javax.inject.Inject;
import javax.inject.Singleton;

import io.reactivex.functions.Consumer;

/**
 * Created by Chris Li on 2017-07-27.
 */
@Singleton
public class EventBus {

    private static final String TAG = EventBus.class.getSimpleName();

    private BehaviorRelay<Object> relay = BehaviorRelay.create();

    @Inject
    public EventBus() {

    }

    @SuppressWarnings("unchecked")
    public <T> void register(final Class<T> eventClass, Consumer<T> observer) {
        relay.filter(event -> event.getClass().equals(eventClass))
                .map(object -> (T) object)
                .subscribe(observer);
    }

    public void post(Object event) {
        relay.accept(event);
    }

}
