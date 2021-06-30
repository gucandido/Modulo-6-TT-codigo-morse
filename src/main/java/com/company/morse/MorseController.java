package com.company.morse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/morse")
public class MorseController {

    @GetMapping("/encode/{s}")
    public String encode(@PathVariable String s){
        return MorseUtils.string2morse(s);
    }

    @GetMapping("/decode/{s}")
    public String decode(@PathVariable String s){
        return MorseUtils.morse2string(s);
    }


}
