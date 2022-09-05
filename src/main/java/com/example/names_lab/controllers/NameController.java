package com.example.names_lab.controllers;

import com.example.names_lab.models.Name;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping (value = "/greeting")
public class NameController {

   @GetMapping
    public String greeting(){
      Name name1 = new Name("Colin", "Evening");
       return "Good " + name1.getTimeOfDay() + ", " +  name1.getName() + "!";
   }


}
