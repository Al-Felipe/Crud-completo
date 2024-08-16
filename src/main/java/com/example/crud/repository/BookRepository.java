package com.example.crud.repository;

import com.example.crud.model.BookEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface BookRepository extends MongoRepository<BookEntity, Long> {
    Optional<BookEntity> findById(String id);

    Optional<BookEntity> deleteById(String id);
}
