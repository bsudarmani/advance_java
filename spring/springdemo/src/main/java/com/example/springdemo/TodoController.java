package com.example.springdemo;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class TodoController
{
    //get mapping
    @GetMapping("/get")
    public String getTodo()
    {
        return "gettodo";
    }
    //path variable
    @GetMapping("/{id}")
    public String getTodoid(@PathVariable int id)
    {
        return "path variable id"+id;
    }

    //request param
    @GetMapping("")
    public String getTodoParam(@RequestParam("paramid") long id)
    {
        return "request param id"+id;
    }


}
