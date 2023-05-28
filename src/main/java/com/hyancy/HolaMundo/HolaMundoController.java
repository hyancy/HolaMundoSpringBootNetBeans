/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hyancy.HolaMundo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author yancy
 */
@Controller
public class HolaMundoController {
    
    @GetMapping("/")
    public String inicioSpring(){
        return "index";
    }
    
    @GetMapping("/hola-mundo")
    public String holaMundo(){
        return "hola-mundo";
    }
    
}
