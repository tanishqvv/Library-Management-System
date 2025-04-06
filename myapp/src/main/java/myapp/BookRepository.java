package myapp;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import myapp.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
}

