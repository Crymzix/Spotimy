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

}
