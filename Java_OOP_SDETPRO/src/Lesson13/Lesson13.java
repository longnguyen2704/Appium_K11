package Lesson13;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lesson13 {
    public static void main(String[] args) {
        List<Book> bookList = new ArrayList<>();
        boolean out = true;
        while (out) {
            System.out.println("\n===== Book Management Program (CRUD) =====");
            printMenuBook();
            int optional = enterBook();

            switch (optional) {
                case 1 -> newBook(bookList);
                case 2 -> findBook(bookList);
                case 3 -> updateBook(bookList);
                case 4 -> deleteBook(bookList);
                case 5 -> printBookList(bookList);
                case 6 -> {
                    out = false;
                    System.out.println("Exit!!!!!");
                }
                default -> System.out.println("Please choose number between 1 to 6. Try again!!!");
            }
        }
    }

    public static int enterBook() {
        System.out.printf("\nEnter your number: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static void printMenuBook() {
        System.out.println("1. Add new book");
        System.out.println("2. Find a book(ISBN)");
        System.out.println("3. Update a book");
        System.out.println("4. Delete a book");
        System.out.println("5. Print the book list");
        System.out.println("6. Exit");
        System.out.println("===> Please choose the menu");
    }

    public static void printBookList(List<Book> bookList) {
        checkNull(bookList);
        for (Book value : bookList) {
            System.out.println(value.toString() + "\n");
        }
    }

    public static boolean checkNull(List<Book> bookList) {
        if (bookList.isEmpty()) {
            System.out.println("List is empty, please try again!!!");
            return false;
        }
        return true;
    }

    public static void newBook(List<Book> bookList) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=====INPUT=====");
        System.out.printf("Please input ISBN: ");
        int ISBN = scanner.nextInt();
        scanner.nextLine();
        System.out.printf("Please input Title: ");
        String Title = scanner.nextLine();
        System.out.printf("Please input Author: ");
        String Author = scanner.nextLine();
        System.out.printf("Please input Year: ");
        int Year = scanner.nextInt();
        Book book = new Book(ISBN, Title, Author, Year);
        bookList.add(book);
        System.out.println("=====Add book successfully=====");
    }

    private static void deleteBook(List<Book> bookList) {
        checkNull(bookList);
        if (bookList.isEmpty()) {
        }
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Please input ISBN: ");
        int deleteBook = scanner.nextInt();
        for (int i = 0; i < bookList.size(); i++) {
            if (deleteBook == bookList.get(i).getISBN()) {
                bookList.remove(bookList.get(i));
                System.out.println("ISBN: " + deleteBook + " is deleted");
                return;
            }
        }
        System.out.println("ISBN: " + deleteBook + " is not found in your list book");
    }


    private static boolean updateBook(List<Book> bookList) {
        checkNull(bookList);
        if (bookList.isEmpty()) {
            return true;
        }
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Please input ISBN: ");
        int updateBook = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < bookList.size(); i++) {
            if (updateBook == bookList.get(i).getISBN()) {
                System.out.println("ISBN: " + updateBook + " is found your list book");

                System.out.printf("Please input new Title: ");
                String Title = scanner.nextLine();
                bookList.get(i).setTitle(Title);

                System.out.printf("Please input new Author: ");
                String Author = scanner.nextLine();
                bookList.get(i).setAuthor(Author);

                System.out.printf("Please input new Year: ");
                int Year = scanner.nextInt();
                bookList.get(i).setYear(Year);

                System.out.println("=====Update successfully====");
                return true;
            }
        }
        System.out.println("ISBN: " + updateBook + " is not found in your list book");
        return false;
    }

    private static boolean findBook(List<Book> bookList) {
        checkNull(bookList);
        if (bookList.isEmpty()) {
            return true;
        }
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Please input ISBN: ");
        int findBook = scanner.nextInt();
        if (bookList.isEmpty()) {
            System.out.println("Your list is empty, please try again");
        } else if (findBook < 0) {
            System.out.println("ISBN:" + findBook + " is not found in your list book");
        }
        for (int i = 0; i < bookList.size(); i++) {
            if (findBook == bookList.get(i).getISBN()) {
                System.out.println("ISBN: " + findBook + " is found your list book");
                return true;
            }
        }
        System.out.println("ISBN: " + findBook + " is not found in your list book");
        return false;
    }
}
