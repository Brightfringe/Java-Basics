public class Aggregation {
    public static void main(String[] args) {
        BooksAggregation book1 = new BooksAggregation("the fellow of ring",423);
        BooksAggregation book2 = new BooksAggregation("the fellow of ring",423);
        BooksAggregation book3 = new BooksAggregation("the fellow of ring",423);

        BooksAggregation[] books = {book1,book2,book3};

       // System.out.println(book1.displayInfo());

        //  for (BooksAggregation book:books) {
        //     System.out.println(book.displayInfo());
        // }

        LibraryAggregation library = new LibraryAggregation("nyc public library",1897,books);

        library.displayInfo();
    }
}
