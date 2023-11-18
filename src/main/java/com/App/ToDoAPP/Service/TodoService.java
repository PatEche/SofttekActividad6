package com.App.ToDoAPP.Service;

import com.App.ToDoAPP.Model.TodoItem;
import org.springframework.data.repository.CrudRepository;

public interface TodoService extends CrudRepository<TodoItem,Integer > {







}
