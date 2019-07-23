package com.example.contorller;

import com.example.bean.T_fl;
import com.example.service.TflSevrice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
    @Autowired
    TflSevrice tflSevrice;

    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }

    @RequestMapping("/getbyid")
    public T_fl Getbyid(String id){
        return tflSevrice.GetById(id);
    }

}
