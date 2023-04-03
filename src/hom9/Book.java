package hom9;

import java.util.Objects;

public class Book {
    private String poem;
    private String author;

    private int publicationYear;

    @Override
    public String toString() {
        return
                poem + '\''
                        + author + '\'' +
                        +publicationYear;
    }

    public Book(String author, String poem, int publicationYear) {

        this.poem = poem;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public String getPoem() {

        return this.poem;
    }

    public String getAuthor() {

        return author;
    }

    public int getPublicationYear() {

        return this.publicationYear;
    }

    public void setPublicationYear(int publicationYear) { //применен метод сеттер

        this.publicationYear = publicationYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return poem.equals(book.poem) && author.equals(book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(poem, author);
    }

//    public String toString(){
//
//        return  this.author+" "+this.poem+" "+this.publicationYear+" год";
//
//    }

}