package Books;

import java.util.HashMap;


public class Library {
    private HashMap<String, Book> directory;

    public Library(){
        this.directory = new HashMap<>();
    }

    public void addBook(Book book){
        String name = santizedString(book.getName());

        if(this.directory.containsKey(name)){
            System.out.println("This book is already in the library");
        } else {
            directory.put(name, book);
        }
    }

    public Book getBook(String bookTitle){
        bookTitle = santizedString(bookTitle);
        return this.directory.get(bookTitle);
    }

    public void removeBook(String bookTitle){
        bookTitle = santizedString(bookTitle);

        if(directory.containsKey(bookTitle)){
            directory.remove(bookTitle);
        } else {
            System.out.println("Book was not found in the library.");
        }
    }

    public static String santizedString(String string){
        if(string == null){
            return "";
        }

        string = string.toLowerCase().trim();
        return string;
    }
}
