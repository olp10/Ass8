package org.example;

import java.time.LocalDate;
import java.util.List;

public class LibrarySystem {
    public LibrarySystem() {
    }

    public void addBookWithTitleAndAuthorlist(String title, List<Author> authors) throws UserOrBookDoesNotExistException {

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

    public void borrowBook(User user, Book book) {

    }

    public void extendLending(FacultyMember facultyMember, Book book, LocalDate newDueDate) {

    }

    public void returnBook(User user, Book book) {

    }
}
