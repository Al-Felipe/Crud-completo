package com.example.crud.controller;

import com.example.crud.model.BookEntity;
import com.example.crud.service.BookService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class BookController {

    //anotacao permite que o spring gerencie essa dependencia
    @Autowired
    BookService bookService;
                                   // RequestBody permite escrever o corpo da requisicao sem ela receberiamos null
    @PostMapping("/books")        // Valid ira chechar se os campos que definimos como NotBlank estão prenchidos
    public BookEntity insertBook(@RequestBody @Valid BookEntity bookEntity){
        return bookService.addBook(bookEntity);
    }

    @GetMapping("/books")
    public List<BookEntity> findAllBooks(){
        return bookService.getBooks();
    }

    @GetMapping("/books/{id}")
    public Optional<BookEntity> findBookById(@PathVariable String id){
        return bookService.findBookById(id);
    }

    @DeleteMapping("/books/{id}")
    public String deleteBookById(@PathVariable String id){
        return bookService.deleteBookById(id);
    }

    @PutMapping("/books/{id}")
    public Object updateBook(@PathVariable String id, @RequestBody @Valid BookEntity bookEntity){
        return bookService.updateById(id, bookEntity);
    }



}
