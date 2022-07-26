package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.KafkaDemo;

@RestController

@RequestMapping(value = "/kafka-example/")


public class Likhi {
    @Autowired

    KafkaDemo likhitha;



    @GetMapping(value = "/produce")

    public String producer(@RequestParam("message") String message) {

        likhitha.send(message);



        return "Success";

    }



}

