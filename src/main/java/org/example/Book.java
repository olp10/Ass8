/*******************************************************
 * Nafn: María Rós Kaldalóns
 * T-póstur: mrk9@hi.is
 *
 * Lýsing:
 *
 *
 *********************************************************/
package org.example;

import java.util.List;

public class Book {
    private List<Author> authors;
    private String title;

    public Book(String title, List<Author> authors) throws EmptyAuthorListException {
        this.title = title;
        this.authors = authors;
    }

    public void addAuthor(String authorName){
        authors.add(new Author(authorName));
    }

    public List<Author> getAuthors() throws EmptyAuthorListException{
        return authors;
    }
    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

}