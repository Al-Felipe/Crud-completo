package com.example.crud.service;

import com.example.crud.model.BookEntity;
import com.example.crud.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {
    @Autowired
    BookRepository bookRepository;

    public BookEntity addBook(BookEntity bookEntity) {
        return bookRepository.save(bookEntity);
    }

    public List<BookEntity> getBooks() {
        return bookRepository.findAll();
    }

    //Optinal container de um objeto que pode ou não ser nulo
    public Optional<BookEntity> findBookById(String id) {
        return bookRepository.findById(id);
    }

    public String deleteBookById(String id) {
        Optional<BookEntity> bookEntity = bookRepository.findById(id);
        if (bookEntity.isEmpty()) {
            return "Não foi possivel fazer a exclusão.";
        }
        bookRepository.deleteById(id);
        return "Livro excluido com sucesso";
    }

    public String updateById(String id, BookEntity bookEntity) {
        Optional<BookEntity> book = bookRepository.findById(id);
        if (book.isEmpty()){
            return "Não foi possível fazer a atualização dos dados.";
        }

        bookEntity.setName(bookEntity.getName());
        bookEntity.setAuthor(bookEntity.getAuthor());
        bookEntity.setGender(bookEntity.getGender());

        bookRepository.save(bookEntity);
        return "Dados atualizados com sucesso";

    }
}
