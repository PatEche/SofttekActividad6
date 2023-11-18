package com.App.ToDoAPP.Controller;

import com.App.ToDoAPP.Interface.TodoInterface;
import com.App.ToDoAPP.Model.TodoItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping
public class TodoController {

    @Autowired

    private TodoInterface todoInterface;

    @GetMapping("/")
    public String inicio(Model model){
        model.addAttribute("items",todoInterface.listar());
        model.addAttribute("itemUp", new TodoItem());

        return "index";
    }

    //Creamos el método para agregar new
    @PostMapping("/new")
    public String agregar(@ModelAttribute TodoItem itemA){
        todoInterface.guardar(itemA);
        return "redirect:/";
    }

    @GetMapping("/delete/{id}")
    public String eliminar(@PathVariable int id){
        todoInterface.eliminar(id);
        return "redirect:/";

    }

    @GetMapping("/update/{id}")
    public String modificar(@PathVariable int id, Model model ){
        TodoItem item = todoInterface.traer(id);
        model.addAttribute("itemUp",item);
        return "index";

    }
}
