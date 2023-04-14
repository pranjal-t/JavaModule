package com.example.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Book
{
    String bookName;
    int year;
    String authorName;

    public Book(String bookName, int year, String authorName) {
        this.bookName = bookName;
        this.year = year;
        this.authorName = authorName;
    }
}

class BookYear implements Comparator<Book>
{

    @Override
    public int compare(Book o1, Book o2) {
        return o1.year - o2.year;
    }
}

class BookAuthor implements Comparator<Book>
{

    @Override
    public int compare(Book o1, Book o2) {
        return o1.authorName.compareTo(o2.authorName);

    }
}

public class ComparatorDemo {

    public static void main(String args[])
    {
        Book b1 = new Book("Alchemist", 1982, "Paulo Coelho");
        Book b2 = new Book("Psychology of Money", 1996, "Morgan Housel");
        Book b3 = new Book("Sapiens",1991, "Yuvah Noel Harari");

        List<Book> bookList = new ArrayList<>();
        bookList.add(b1);
        bookList.add(b2);
        bookList.add(b3);

        BookYear bookYear = new BookYear();
        Collections.sort(bookList, bookYear);

        System.out.println("Books sorted by year ");
        for(Book book: bookList)
        {
            System.out.println(book.bookName +" "+book.year+" "+book.authorName);
        }

        BookAuthor bookAuthor = new BookAuthor();
        Collections.sort(bookList, bookAuthor);

        System.out.println("Books sorted by bookAuthor");
        for(Book book: bookList)
        {
            System.out.println(book.bookName +" "+book.year+" "+book.authorName);
        }

    }

}
