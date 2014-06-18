retrofit-spotify
================

Basic example that uses the [retrofit](http://square.github.io/retrofit/) project to interact with the [spotify api](https://developer.spotify.com/web-api/) to get albums for a particular artist.

It demonstrates the following features:

* Automatic [de]serialisation
* Path variable binding
* Generic binding types (i.e. Paged<Album[]>)
* Immutable types (i.e. Paged, Album)
* API specifications as Java interfaces (i.e. SpotifyService)


Service interfaces are defined like so:

```
public interface SpotifyService {
    @GET("/artists/{id}/albums")
    Paged<Album[]> getAlbums(@Path("id") String artistId);
}
```

The client can call the interface through the rest adapter:

```
RestAdapter restAdapter = RestAdapter.Builder()
    .setEndpoint("https://api.spotify.com/v1")
    .build();

restAdapter.getAlbums("4tNxq9NGKTKaX8OkZBLgf0");
    
```






