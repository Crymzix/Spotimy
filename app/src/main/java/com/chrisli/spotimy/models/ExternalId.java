package com.chrisli.spotimy.models;

/**
 * Created by Chris Li on 2017-07-31.
 */

public class ExternalId {

    private String isrc;
    private String ean;
    private String upc;

    public String getId() {
        if (isrc != null) {
            return isrc;
        } else if (ean != null) {
            return ean;
        } else {
            return upc;
        }
    }

    public String getIsrc() {
        return isrc;
    }

    public void setIsrc(String isrc) {
        this.isrc = isrc;
    }

    public String getEan() {
        return ean;
    }

    public void setEan(String ean) {
        this.ean = ean;
    }

    public String getUpc() {
        return upc;
    }

    public void setUpc(String upc) {
        this.upc = upc;
    }

}
