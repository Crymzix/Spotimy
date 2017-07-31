package com.chrisli.spotimy.models;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Chris Li on 2017-07-31.
 */

public class TrackLink {

    @SerializedName("external_urls")
    private ExternalUrl externalUrls;
    private String href;
    private String id;
    private String type;
    private String uri;

    public ExternalUrl getExternalUrls() {
        return externalUrls;
    }

    public void setExternalUrls(ExternalUrl externalUrls) {
        this.externalUrls = externalUrls;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }
}
