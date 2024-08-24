// TodoRepository.java
package com.example.todoapp.repository;

import com.example.todoapp.model.Todo;
import com.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo, Long> {
}