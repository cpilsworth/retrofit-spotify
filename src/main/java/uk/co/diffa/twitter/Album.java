package uk.co.diffa.twitter;

public class Album {
    private String id;
    private String name;
    private String uri;

    public Album(final String id, final String name, final String uri) {
        this.id = id;
        this.name = name;
        this.uri = uri;
    }

    public String getUri() {
        return uri;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }
}
