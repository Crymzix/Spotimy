package com.chrisli.spotimy.events;

import com.jakewharton.rxrelay2.BehaviorRelay;

import javax.inject.Inject;
import javax.inject.Singleton;

import io.reactivex.functions.Consumer;

/**
 * Created by Chris Li on 2017-07-27.
 */
@Singleton
public class EventBus {

    private BehaviorRelay<Object> relay = BehaviorRelay.create();

    @Inject
    public EventBus() {

    }

    public void publish(Object object) {
        relay.accept(object);
    }

    public void subscribe(Consumer<? super Object> observer) {
        relay.subscribe(observer);
    }

}
