package com.example.nameservice2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.apache.naming.SelectorContext.prefix;

@RestController
public class NameController {

    private NameMapper nameMapper;
    public NameController(NameMapper nameMapper){this.nameMapper =nameMapper;}
    @GetMapping("/names")
public List<Name> findByNames(@RequestParam String startsWith){

        return nameMapper.findByNameStartingWith(startsWith);
    }

}
