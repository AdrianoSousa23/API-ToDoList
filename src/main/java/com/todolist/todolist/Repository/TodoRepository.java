package com.todolist.todolist.Repository;

import com.todolist.todolist.Entity.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo, Long> {

}
