package com.example.springdemo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Todo
{
    @Id
    @GeneratedValue
    int id;
    String title;
    String desc;
    Boolean is_complete;
}
