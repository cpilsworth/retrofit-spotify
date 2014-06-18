package uk.co.diffa.twitter;

public class Paged<T> {

    private String href;

    private T items;

    private Paged(String href, T items) {

        this.href = href;
        this.items = items;
    }


    public String getHref() {
        return href;
    }

    public T getItems() {
        return items;
    }
}
