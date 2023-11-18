package com.App.ToDoAPP.Model;

import jakarta.persistence.*;

@Entity //Establacemos que esta clase, es la entidad principal
@Table(name = "TodoItem")
public class TodoItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String descripcion;

    //Constructor vacio
    public TodoItem() {
    }

    //Constructor con parametros
    public TodoItem(int id, String descripcion) {
        this.id = id;
        this.descripcion = descripcion;
    }

    //Getters y Setters
    public int getId() {

        return id;
    }

    public void setId(int id) {

        this.id = id;
    }

    public String getDescripcion() {

        return descripcion;
    }

    public void setDescripcion(String descripcion) {

        this.descripcion = descripcion;
    }
}
