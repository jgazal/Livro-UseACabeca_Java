package Capitulo16;

/*class Book {
    String title;

    public Book(String t){
        title = t;
    }
}*/
class Book implements Comparable<Book> {
    String title;

    public Book(String t){
        title = t;
    }
    public int compareTo(Book b){
        return title.compareTo(b.title);
    }
    public String toString(){
        return title;
    }
}
