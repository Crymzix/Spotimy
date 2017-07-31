package com.chrisli.spotimy.models;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Chris Li on 2017-07-31.
 */

public class Album {

    @SerializedName("album_type")
    private String albumType;
    private List<Artist> artists = new ArrayList<>();
    @SerializedName("available_markets")
    private List<String> availableMarkets = new ArrayList<>();
    private List<Copyright> copyrights = new ArrayList<>();
    @SerializedName("external_ids")
    private ExternalId externalIds;
    @SerializedName("external_urls")
    private ExternalUrl externalUrls;
    private List<String> genres = new ArrayList<>();
    private String href;
    private String id;
    private List<Image> images = new ArrayList<>();
    private String label;
    private String name;
    private int popularity;
    @SerializedName("release_date")
    private String releaseDate;
    @SerializedName("release_date_precision")
    private String releaseDatePrecision;
    private Paging<Track> tracks;
    private String type;
    private String uri;

    public String getAlbumType() {
        return albumType;
    }

    public void setAlbumType(String albumType) {
        this.albumType = albumType;
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

    public List<Copyright> getCopyrights() {
        return copyrights;
    }

    public void setCopyrights(List<Copyright> copyrights) {
        this.copyrights = copyrights;
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

    public List<String> getGenres() {
        return genres;
    }

    public void setGenres(List<String> genres) {
        this.genres = genres;
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

    public List<Image> getImages() {
        return images;
    }

    public void setImages(List<Image> images) {
        this.images = images;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
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

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getReleaseDatePrecision() {
        return releaseDatePrecision;
    }

    public void setReleaseDatePrecision(String releaseDatePrecision) {
        this.releaseDatePrecision = releaseDatePrecision;
    }

    public Paging<Track> getTracks() {
        return tracks;
    }

    public void setTracks(Paging<Track> tracks) {
        this.tracks = tracks;
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
