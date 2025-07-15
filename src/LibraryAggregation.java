public class LibraryAggregation {

    String name;
    int year;
    BooksAggregation[] books;

    LibraryAggregation(String name, int year, BooksAggregation[] books){
        this.name = name;
        this.year = year;
        this.books = books;
    }

     void displayInfo()
    {
        System.out.println("The " + this.year +" "+ this.name);
        System.out.println("books available: ");
        for(BooksAggregation book : books){
            System.out.println(book.displayInfo());
        }
    }
}
