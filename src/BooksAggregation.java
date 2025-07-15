public class BooksAggregation {

    String title;
    int pages;

    BooksAggregation(String title, int pages){
        this.title = title;
        this.pages = pages;

    }

    String displayInfo(){
        return this.title + " (" + this.pages + ") pages";
    }
}
