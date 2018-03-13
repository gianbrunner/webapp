package services;

import models.Book;

import java.util.List;

public class DefaultBookService implements BookService{
    List<Book> bookList;

    public List<Book> get() {
        return bookList;
    }

    public Book get(final Long id){
        Book localBook = null;
        for(Book book: bookList){
            if(book.getId() == id){
                localBook=book;
            }
        }
        return localBook;
    }

    public boolean delete(final Long id){
        for(Book book: bookList) {
            if (book.getId() == id) {
                bookList.remove(book);
                return true;
            }
        }
        return false;
    }
    public Book update(final Book updatedBook){
        Long id = updatedBook.getId();
        for(Book book: bookList) {
            if (book.getId() == id) {
                bookList.remove(book);
            }
        }
        bookList.add(updatedBook);
        return updatedBook;
    }

    public Book add(Book book) {
        bookList.add(book);
        return book;
    }
}
