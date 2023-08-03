package lk.ijse.gdse;

import lk.ijse.gdse.entity.Author;
import lk.ijse.gdse.entity.Book;
import lk.ijse.gdse.util.FactoryConfiguration;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        home();

    }

    public static void home(){
        Scanner input=new Scanner(System.in);
        System.out.println("One To Many Book Management");

        System.out.println("1 - Add a Book & Author");
        System.out.println("2 - Update Book & Author");
        System.out.println("3 - Remove Book & Author");
        System.out.println("4 - Search Book & Author");

        System.out.print("Select Option : ");
        String option = input.next();

        if (option.equals("1")){

            addBook();
        } else if (option.equals("2")) {

            updateBook();
        } else if (option.equals("3")) {

            removeBook();
        } else if (option.equals("4")) {

            searchBook();
        }
    }

    public static void addBook(){
        Book book = new Book();
        book.setId("L01");
        book.setTitle("Madol Duwa");

        Book book1 = new Book();
        book1.setId("L02");
        book1.setTitle("Hath Pana");

        Author author = new Author();
        author.setId("S01");
        author.setName("Sachitha");

        Author author1 = new Author();
        author1.setId("S02");
        author1.setName("Sachi");

        List<Book> books = new ArrayList<>();
        books.add(book);
        books.add(book1);

        List<Author> authors = new ArrayList<>();
        authors.add(author);
        authors.add(author1);

        book.setAuthors(authors);
        book1.setAuthors(authors);
        author.setBooks(books);
        author1.setBooks(books);


        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

        session.persist(author);
        session.persist(author1);
        session.persist(book);
        session.persist(book1);

        transaction.commit();
        session.close();

    }

    public static void updateBook(){
        Book book = new Book();
        book.setId("L01");
        book.setTitle("Madol");

        Book book1 = new Book();
        book1.setId("L02");
        book1.setTitle("Hath");

        Author author = new Author();
        author.setId("S01");
        author.setName("Sachi");

        Author author1 = new Author();
        author1.setId("S02");
        author1.setName("Sac");

        List<Book> books = new ArrayList<>();
        books.add(book);
        books.add(book1);

        List<Author> authors = new ArrayList<>();
        authors.add(author);
        authors.add(author1);

        book.setAuthors(authors);
        book1.setAuthors(authors);
        author.setBooks(books);
        author1.setBooks(books);


        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

        session.update(author);
        session.update(author1);
        session.update(book);
        session.update(book1);

        transaction.commit();
        session.close();
    }

    public static void removeBook(){
        Book book = new Book();
        book.setId("L01");

        Book book1 = new Book();
        book1.setId("L02");

        Author author = new Author();
        author.setId("S01");

        Author author1 = new Author();
        author1.setId("S02");

        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

        session.delete(author);
        session.delete(author1);
        session.delete(book);
        session.delete(book1);

        transaction.commit();
        session.close();
    }

    public static void searchBook(){
//        Scanner input = new Scanner(System.in);
//        Book book = new Book();
//        Book book1 = new Book();
//        System.out.println("-------------------");
//        System.out.println("Search Books   !!!!");
//        System.out.println("-------------------");
//
//        System.out.print("Input Book Id : ");
//        String id=input.next();
//
//        book.setId(id);
//
//        Session session = FactoryConfiguration.getInstance().getSession();
//        Transaction transaction = session.beginTransaction();
//
//
//        session
//
//        String bid=book1.getId();
//        String title = book1.getTitle();
//        String author = book1.getAuthor();
//
//        transaction.commit();
//        session.close();
//
//
//        System.out.println("Book Removed !!!");
//
//        System.out.println(bid);
//        System.out.println(title);
//        System.out.println(author);
//
//
//        System.out.print("Do you need to remove Another Book ? (Y/n) : ");
//        String x = input.next();
//
//        if (x.equals("Y")||x.equals("y")){
//
//            searchBook();
//        } else if (x.equals("N")||x.equals("n")) {
//
//            home();
//        }
    }
}
