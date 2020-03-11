package pl.zzpj2020.solid.srp.book.solution;

import java.util.HashMap;
import java.util.Map;

public class Book {
    private int currentPage = 0;

    private Map<Integer, String> pages = new HashMap<>();

    private String title = "A Great Book";
    private String author = "John Doe";
    private String libraryRoomName;
    private String rowLocator;
    private int indexOnShelf;

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getCurrentPageContents() {
        return pages.get(currentPage);
    }

    public String getLibraryRoomNameLibraryRoomName() {
        return libraryRoomName;
    }

    public String getLocationRowLocator() {
        return rowLocator;
    }

    public int getIndexOnShelf() {
        return indexOnShelf;
    }

    public Map<Integer, String> getPages() {
        return pages;
    }
}
