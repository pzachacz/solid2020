package pl.zzpj2020.solid.srp.book.solution;

public class Printer {

    public void printAllPages(Book book) {

        book.getPages().forEach((number, content) -> {
            System.out.println(number + " " + content);
        });
    }

    public void printCurrentPage(Book book) {

        System.out.println(book.getCurrentPageContents());
    }
}
