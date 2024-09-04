package org.example.springbookmanagement.repository;

import org.example.springbookmanagement.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}