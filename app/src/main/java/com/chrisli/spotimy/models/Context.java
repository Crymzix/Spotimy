package com.chrisli.spotimy.models;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Chris Li on 2017-07-31.
 */

public class Context {

    public static final String ARTIST = "artist";
    public static final String PLAYLIST = "playlist";
    public static final String ALBUM = "album";

    private String type;
    private String href;
    @SerializedName("external_urls")
    private ExternalUrl externalUrls;
    private String uri;


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public ExternalUrl getExternalUrls() {
        return externalUrls;
    }

    public void setExternalUrls(ExternalUrl externalUrls) {
        this.externalUrls = externalUrls;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }
}
