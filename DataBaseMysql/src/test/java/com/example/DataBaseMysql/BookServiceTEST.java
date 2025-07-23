package com.example.DataBaseMysql;

import com.example.DataBaseMysql.model.NewBookModel;
import com.example.DataBaseMysql.repo.BookRepository;
import com.example.DataBaseMysql.service.BookService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class BookServiceTEST {
    @Mock
    private BookRepository bookRepository;
    @InjectMocks
    private BookService bookService;

    @Test
    public void insertBook(){
        // arrange
        NewBookModel newBookModel = new NewBookModel();
        newBookModel.setStatus("available");
        newBookModel.setAuthor("john doe");
        newBookModel.setYear(2023);
        newBookModel.setName("programming in c");

        when(bookRepository.save(any(NewBookModel.class))).thenReturn(newBookModel);

        //act
        NewBookModel result = bookService.insertBook(newBookModel);

        //assert
        assertNotNull(result);
        assertEquals("available",result.getStatus());
        assertEquals("john doe",result.getAuthor());
        assertEquals("2023",result.getYear());
        assertEquals("programming in c", result.getName());

        verify(bookRepository).save(any(NewBookModel.class));

    }

}
