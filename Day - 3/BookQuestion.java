package Day_3_Solution;

public class BookQuestion {

    public static void main(String[] args) {

        Book book1 = new Book();

        System.out.println("Book 1:");
        book1.displayInfo();

        Book book2 = new Book("Java Programming", "Sakshi", 2024);

        System.out.println("Book 2:");
        book2.displayInfo();
    }
}

class Book {
    String title;
    String author;
    int year;

    Book() {
        title = "Not specified";
        author = "Unknown";
        year = 0;
    }
    Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Year: " + year);
        System.out.println();
    }
}