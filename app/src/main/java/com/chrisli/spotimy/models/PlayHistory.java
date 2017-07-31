package com.chrisli.spotimy.models;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Chris Li on 2017-07-31.
 */

public class PlayHistory {

    private Track track;
    @SerializedName("played_at")
    private String playedAt;
    private Context context;

    public Track getTrack() {
        return track;
    }

    public void setTrack(Track track) {
        this.track = track;
    }

    public String getPlayedAt() {
        return playedAt;
    }

    public void setPlayedAt(String playedAt) {
        this.playedAt = playedAt;
    }

    public Context getContext() {
        return context;
    }

    public void setContext(Context context) {
        this.context = context;
    }
}
