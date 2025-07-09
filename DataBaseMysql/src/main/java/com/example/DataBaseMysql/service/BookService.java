package com.example.DataBaseMysql.service;

import com.example.DataBaseMysql.model.NewBookModel;
import com.example.DataBaseMysql.repo.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
    @Autowired
    public BookRepository bookRepository;

    public NewBookModel insertBook(NewBookModel newBookModel){
        return bookRepository.save(newBookModel);
    }

    public NewBookModel getBookById(long id){
        NewBookModel book = bookRepository.findById(id).orElse(new NewBookModel());
        if (book.getYear() > 2020) {
            book.setStatus("OUTDATED");
        } else {
            book.setStatus("OK");
        }

        return book;

    }


}
