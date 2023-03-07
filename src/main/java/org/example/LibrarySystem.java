package org.example;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class LibrarySystem {

    private List<Lending> lendings = new ArrayList<Lending>();
    private List<User> users = new ArrayList<User>();
    private List<Book> books = new ArrayList<Book>();
    public LibrarySystem() {
    }

    public void addBookWithTitleAndAuthorlist(String title, List<Author> authors) throws EmptyAuthorListException {
        Book book = new Book(title, authors);
    }

    public void addStudentUser(String name, boolean feePaid) {

    }
    public void addFacultyMemberUser(String name, String department) {

    }
    public Book findBookByTitle(String title) {
        return null;
    }

    public User findUserByName(String name) {
        return null;
    }

    public void borrowBook(User user, Book book) throws UserOrBookDoesNotExistException {

    }

    public void extendLending(FacultyMember facultyMember, Book book, LocalDate newDueDate) throws UserOrBookDoesNotExistException {

    }

    public void returnBook(User user, Book book) throws UserOrBookDoesNotExistException {

    }
}
