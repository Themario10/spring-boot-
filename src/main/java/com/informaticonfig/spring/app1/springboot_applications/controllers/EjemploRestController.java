package com.informaticonfig.spring.app1.springboot_applications.controllers;

import java.util.HashMap;
import java.util.Map;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.informaticonfig.spring.app1.springboot_applications.controllers.models.Empleados;


@RestController
@RequestMapping("/api")


public class EjemploRestController {

    @GetMapping(path = "/detalles_info2")

        public Map<String, Object> detalles_info2(){
                Empleados empleado1 = new Empleados("Mario", "Valladares", "Calle agua blanca", "Developer JR", 
                                                    25, 621014281, 007 );



        Map<String, Object> respuesta = new HashMap<>();
        respuesta.put("Empleado", empleado1);
        
        return respuesta;
    }
}

