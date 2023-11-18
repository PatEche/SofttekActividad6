package com.App.ToDoAPP.Interface;

import com.App.ToDoAPP.Model.TodoItem;

import java.util.List;

public interface TodoInterface {

    public List<TodoItem> listar();

    public int guardar(TodoItem t);

    public void eliminar(int id);

    public TodoItem traer(int id);




}
