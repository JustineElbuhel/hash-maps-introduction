package Books;

public class Book {
    private String name;
    private String content;
    private int published;

    public Book(String name, String content, int published){
        this.name = name;
        this.content = content;
        this.published = published;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getContent(){
        return content;
    }

    public void setContent(String content){
        this.content = content;
    }

    public int getPublished(){
        return published;
    }

    public void setPublished(int published){
        this.published = published;
    }

    public String toString(){
        return String.format("Name: %s (%d) \nContent: %s", name, published, content);
    }

//    @Override
//    public boolean equals(Object comparedObject){
//        if(this == comparedObject){
//            return true;
//        }
//
//        if(!(comparedObject instanceof Book)){
//            return false;
//        }
//
//        Book comparedBook = (Book) comparedObject;
//
//        if(this.name.equals(comparedBook.name) &&
//        this.published == comparedBook.published &&
//        this.content.equals(comparedBook.content)){
//            return true;
//        }
//
//        return false;
//    }
}
