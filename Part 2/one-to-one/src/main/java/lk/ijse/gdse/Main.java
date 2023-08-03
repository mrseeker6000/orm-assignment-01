package lk.ijse.gdse;

import lk.ijse.gdse.entity.Author;
import lk.ijse.gdse.entity.Book;
import lk.ijse.gdse.util.FactoryConfiguration;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            home();

        }

        public static void home(){
            Scanner input=new Scanner(System.in);
            System.out.println("One To One Book Management");

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
            Scanner input = new Scanner(System.in);
            Book book = new Book();
            Author author = new Author();

            System.out.println("----------------------------");
            System.out.println("Add a New Book & Author !!!!");
            System.out.println("----------------------------");

            System.out.print("Input Book Id : ");
            String id=input.next();

            System.out.print("Input Book Title : ");
            String title =input.next();

            System.out.print("Input Author Id : ");
            String aid = input.next();

            System.out.print("Input Author Name : ");
            String name =input.next();


            book.setId(id);
            book.setTitle(title);

            author.setId(aid);
            author.setName(name);
            author.setBook(book);

            Session session = FactoryConfiguration.getInstance().getSession();
            Transaction transaction = session.beginTransaction();

            session.persist(book);
            session.persist(author);

            transaction.commit();
            session.close();


            System.out.println("Book & Author Added !!!");

            System.out.print("Do you need to add Another Book and Author ? (Y/n) : ");
            String x = input.next();

            if (x.equals("Y")||x.equals("y")){

                addBook();
            } else if (x.equals("N")||x.equals("n")) {

                home();
            }

        }

        public static void updateBook(){
            Scanner input = new Scanner(System.in);
            Book book = new Book();
            Author author = new Author();

            System.out.println("---------------------------");
            System.out.println("Update Book & Author   !!!!");
            System.out.println("---------------------------");

            System.out.print("Input Author Id : ");
            String aid = input.next();

            System.out.print("Input Author Name : ");
            String name =input.next();


            System.out.print("Input Book Id : ");
            String id=input.next();

            System.out.print("Input Book Title : ");
            String title =input.next();

            book.setId(id);
            book.setTitle(title);

            author.setId(aid);
            author.setName(name);
            author.setBook(book);

            Session session = FactoryConfiguration.getInstance().getSession();
            Transaction transaction = session.beginTransaction();

            session.update(book);
            session.update(author);

            transaction.commit();
            session.close();


            System.out.println("Book & Author Updated !!!");

            System.out.print("Do you need to update Another Book or Author ? (Y/n) : ");
            String x = input.next();

            if (x.equals("Y")||x.equals("y")){

                updateBook();
            } else if (x.equals("N")||x.equals("n")) {

                home();
            }
        }

        public static void removeBook(){
            Scanner input = new Scanner(System.in);
            Book book = new Book();
            Author author = new Author();

            System.out.println("---------------------------");
            System.out.println("Remove Book & Author   !!!!");
            System.out.println("---------------------------");

            System.out.print("Input Author Id : ");
            String aid=input.next();

            System.out.print("Input Book Id : ");
            String id=input.next();

            book.setId(id);
            author.setId(aid);

            Session session = FactoryConfiguration.getInstance().getSession();
            Transaction transaction = session.beginTransaction();

            session.delete(author);
            session.delete(book);

            transaction.commit();
            session.close();


            System.out.println("Book & Author Removed !!!");

            System.out.print("Do you need to remove Another Book & Author ? (Y/n) : ");
            String x = input.next();

            if (x.equals("Y")||x.equals("y")){

                removeBook();
            } else if (x.equals("N")||x.equals("n")) {

                home();
            }
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
