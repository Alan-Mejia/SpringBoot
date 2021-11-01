package com.alan.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
//Esto es un controlador de tipo rest , es decir qu epuede interactuar con peticiones HTTP
@RestController
public class HelloController {
    //CON GET MAPPING SE INDICA EN QUE PARTE VA A RECIBIR LA PETICION
    @GetMapping("/")
    public String index() {
        return "Greetings from Spring Boot! Alan mejia";
    }
}
