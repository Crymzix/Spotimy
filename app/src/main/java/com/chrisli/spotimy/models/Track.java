package com.chrisli.spotimy.models;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Chris Li on 2017-07-31.
 */

public class Track {

    private Album album;
    private List<Artist> artists = new ArrayList<>();
    @SerializedName("available_markets")
    private List<String> availableMarkets = new ArrayList<>();
    @SerializedName("disc_number")
    private int discNumber;
    @SerializedName("duration_ms")
    private long durationMs;
    private boolean explicit;
    @SerializedName("external_ids")
    private ExternalId externalIds;
    @SerializedName("external_urls")
    private ExternalUrl externalUrls;
    private String href;
    private String id;
    @SerializedName("is_playable")
    private boolean isPlayable;
    @SerializedName("linked_from")
    private TrackLink linkedFrom;
    private String name;
    private int popularity;
    @SerializedName("preview_url")
    private String previewUrl;
    @SerializedName("track_number")
    private int trackNumber;
    private String type;
    private String uri;

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }

    public List<Artist> getArtists() {
        return artists;
    }

    public void setArtists(List<Artist> artists) {
        this.artists = artists;
    }

    public List<String> getAvailableMarkets() {
        return availableMarkets;
    }

    public void setAvailableMarkets(List<String> availableMarkets) {
        this.availableMarkets = availableMarkets;
    }

    public int getDiscNumber() {
        return discNumber;
    }

    public void setDiscNumber(int discNumber) {
        this.discNumber = discNumber;
    }

    public long getDurationMs() {
        return durationMs;
    }

    public void setDurationMs(long durationMs) {
        this.durationMs = durationMs;
    }

    public boolean isExplicit() {
        return explicit;
    }

    public void setExplicit(boolean explicit) {
        this.explicit = explicit;
    }

    public ExternalId getExternalIds() {
        return externalIds;
    }

    public void setExternalIds(ExternalId externalIds) {
        this.externalIds = externalIds;
    }

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

    public boolean isPlayable() {
        return isPlayable;
    }

    public void setPlayable(boolean playable) {
        isPlayable = playable;
    }

    public TrackLink getLinkedFrom() {
        return linkedFrom;
    }

    public void setLinkedFrom(TrackLink linkedFrom) {
        this.linkedFrom = linkedFrom;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPopularity() {
        return popularity;
    }

    public void setPopularity(int popularity) {
        this.popularity = popularity;
    }

    public String getPreviewUrl() {
        return previewUrl;
    }

    public void setPreviewUrl(String previewUrl) {
        this.previewUrl = previewUrl;
    }

    public int getTrackNumber() {
        return trackNumber;
    }

    public void setTrackNumber(int trackNumber) {
        this.trackNumber = trackNumber;
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
