package main;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Book[] books = new Book[n];
        if (n == 0) {
            System.out.println("N/A");
        } else {
            for (int i = 0; i < n; i++) {
                String BookName = scanner.nextLine().trim();
                String AuthorName = scanner.nextLine().trim();
                String IsbnNumber = scanner.nextLine();
                books[i] = new Book(BookName, AuthorName, IsbnNumber);
            }

            for (int j = 0; j < n; j++) {
                System.out.println(books[j]);
            }
            scanner.close();
        }

    }
}

class Book {
    private String BookName;
    private String AuthorName;
    private String IsbnNumber;


    public Book(String BookName, String AuthorName, String IsbnNumber) {
        this.BookName = BookName;
        this.AuthorName = AuthorName;
        this.IsbnNumber = IsbnNumber;
    }

    @Override
    public String toString() {
        return "-----------------------------\n" + "Book Name:\t" + BookName + "\nAuthor Name:\t" + AuthorName + "\nISBN:\t" + IsbnNumber +
                "\n-----------------------------";

    }
}

