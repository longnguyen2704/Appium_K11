package Lesson13;

public class Book {
    int ISBN;
    String Title;
    String Author;
    int Year;

    public Book(int ISBN, String Title, String Author, int Year) {
        this.ISBN = ISBN;
        this.Title = Title;
        this.Author = Author;
        this.Year = Year;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public void setYear(int year) {
        Year = year;
    }

    public int getISBN() {
        return ISBN;
    }

    public int getYear() {
        return Year;
    }

    public String getAuthor() {
        return Author;
    }

    public String getTitle() {
        return Title;
    }
    public String toString(){
        return "Book: " + Title +
                "\nISBN: " + ISBN +
                "\nAuthor: " + Author +
                "\nYear: " + Year;
    }
}
