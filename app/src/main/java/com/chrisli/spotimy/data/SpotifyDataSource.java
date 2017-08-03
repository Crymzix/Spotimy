package com.chrisli.spotimy.data;


import com.chrisli.spotimy.models.Album;

import io.reactivex.Observable;

/**
 * Created by Chris Li on 2017-07-27.
 */

public interface SpotifyDataSource {

    Observable<Album> getAlbum(String albumId);

}
