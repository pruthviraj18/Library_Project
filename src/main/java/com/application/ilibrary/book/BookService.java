package com.application.ilibrary.book;

import lombok.RequiredArgsConstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.application.ilibrary.exception.BookNotFoundException;

import java.util.List;
import java.util.Optional;

/**
 * @author Samson Effes
 */

@Service
public class BookService implements IBookService {
	@Autowired
    private BookRepository bookRepository;

    @Override
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    @Override
    public Book add(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public Optional<Book> findById(Long bookId) {
        return Optional.ofNullable(bookRepository.findById(bookId)
                .orElseThrow(() -> new BookNotFoundException("No book found with the id : " + bookId)));
    }

    @Override
    public void delete(Long bookId) {
        Optional<Book> theBook = findById(bookId);
        theBook.ifPresent(book -> bookRepository.deleteById(book.getId()));
    }

    @Override
    public Book update(Book book) {
        return bookRepository.save(book);
    }
}
