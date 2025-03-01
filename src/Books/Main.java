package Books;

import java.util.HashMap;

public class Main {
    public static void main(String[] args){
        Book senseAndSensibility = new Book("Sense and Sensibility", "Senseless content" ,1811);
        Book prideAndPrejudice = new Book("Pride and Prejudice", "Prideful content" ,1813);

        Library library = new Library();
        library.addBook(senseAndSensibility);
        library.addBook(prideAndPrejudice);

        System.out.println(library.getBook("pride and prejudice"));
        System.out.println();

        System.out.println(library.getBook("PRIDE AND PREJUDICE"));
        System.out.println();

        System.out.println(library.getBook("SENSE"));
    }
}
