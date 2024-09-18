package com.petShop;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Saludar")
public class HolaMundoController {

    @GetMapping("/hola")
    public String saludar(){
        return "Hola mundo ADSO";
    }
}
