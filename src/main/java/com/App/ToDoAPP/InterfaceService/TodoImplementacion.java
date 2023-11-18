package com.App.ToDoAPP.InterfaceService;

import com.App.ToDoAPP.Interface.TodoInterface;
import com.App.ToDoAPP.Model.TodoItem;
import com.App.ToDoAPP.Service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoImplementacion implements TodoInterface {

    @Autowired
    private TodoService tservice;

    @Override
    public List<TodoItem> listar() {
        return (List<TodoItem>) tservice.findAll();
    }

    @Override
    public int guardar(TodoItem t) {
        tservice.save(t);
        return 0;
    }

    @Override
    public void eliminar(int id) {
        tservice.delete(traer(id));
    }

    @Override
    public TodoItem traer(int id) {
        return tservice.findById(id).get();
    }
}
