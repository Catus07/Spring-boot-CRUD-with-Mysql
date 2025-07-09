package com.example.DataBaseMysql.controller;

import com.example.DataBaseMysql.model.NewBookModel;
import com.example.DataBaseMysql.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/book/")
public class BookController {
    @Autowired
    public BookService bookService;

    @PostMapping("/postBook")
    public NewBookModel postModel(@RequestBody NewBookModel newBookModel){
        return bookService.insertBook(newBookModel);
    }

    @GetMapping("/{id}")
    public NewBookModel getBook(@PathVariable Long id){
        return bookService.getBookById(id);

    }
    @GetMapping("/Date/{id}")
    public ResponseEntity<NewBookModel> getBook2(@PathVariable Long id){
        return ResponseEntity.ok(bookService.getBookById(id));
    }
}
