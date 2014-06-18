package uk.co.diffa.spotify;

import retrofit.RestAdapter;

public class SpotifyClient {

    private static final RestAdapter REST = getRestAdapter();
    private static final SpotifyService SPOTIFY = REST.create(SpotifyService.class);
    private static final String NOW_ARTIST_ID = "4tNxq9NGKTKaX8OkZBLgf0";

    public static void main(String[] args) {

        final Paged<Album[]> pagedAlbums = SPOTIFY.getAlbums(NOW_ARTIST_ID);

        for (Album album : pagedAlbums.getItems()) {
            System.out.println(album.getName());
        }
    }

    private static RestAdapter getRestAdapter() {
        return new RestAdapter.Builder()
                    .setEndpoint("https://api.spotify.com/v1")
                    .build();
    }
}
