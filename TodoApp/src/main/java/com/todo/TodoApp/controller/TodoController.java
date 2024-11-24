package com.todo.TodoApp.controller;

import com.todo.TodoApp.model.Todo;
import com.todo.TodoApp.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/todo")
public class TodoController {
     @Autowired
     private TodoService todoService;
     @PostMapping
     public ResponseEntity<Todo> createTodo(@RequestBody Todo todo) {
         Todo createdTodo = todoService.createTodo(todo);
         return new ResponseEntity<>(createdTodo, HttpStatus.CREATED); }

    @GetMapping
    public ResponseEntity<List<Todo>> getAllTodos() {
        List<Todo> todos = todoService.getAllTodos();
        return new ResponseEntity<>(todos, HttpStatus.OK);
    }




}
