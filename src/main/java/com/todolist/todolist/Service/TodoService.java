package com.todolist.todolist.Service;

import com.todolist.todolist.Entity.Todo;
import com.todolist.todolist.Repository.TodoRepository;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {
    private TodoRepository todoRepository;

    public TodoService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public List<Todo> create(Todo todo) {
        todoRepository.save(todo);
        return  list();
    }
    public List<Todo> list() {
        Sort sort = Sort.by("prioridade").descending().and(Sort.by("nome").ascending()); // ordena por prioridade e nome
        return  todoRepository.findAll(sort);
    }
    public List<Todo> update(Todo todo) {
        todoRepository.save(todo);
        return  list();
    }
    public List<Todo> delete(Long id) {
        todoRepository.deleteById(id);
        return  list();
    }

}
