package com.pyramid.controller;


import com.pyramid.service.PyramidWordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class PyramidWordController {

    @Autowired
    private PyramidWordService pyramidWordService;

    @GetMapping("/pyramid/{word}")
    public boolean callIsPyramidWord(@PathVariable("word") String word) {
        return pyramidWordService.isPyramidWord(word);
    }

}
