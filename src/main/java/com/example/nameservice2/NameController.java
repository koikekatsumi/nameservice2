package com.example.nameservice2;


import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class NameController {

    private NameService nameService;

    public NameController(NameService nameService) {
        this.nameService = nameService;
    }

    @GetMapping("/names")
    public List<Name> findByNames(@RequestParam String startsWith) {
        List<Name> names = nameService.findNamesStartingWith(startsWith);
        return names;
    }

    @GetMapping("/names/{id}")
    public Name getUser(@PathVariable("id") int id) {
        return nameService.findName(id);
    }

}
