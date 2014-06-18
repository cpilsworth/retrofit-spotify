package uk.co.diffa.twitter;

import retrofit.http.GET;
import retrofit.http.Path;

public interface SpotifyService {

    @GET("/artists/{id}/albums")
    Paged<Album[]> getAlbums(@Path("id") String artistId);

}
