package com.example.imperial2;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class ImperialCalculatorController {
    ImperialCalculator a = new ImperialCalculator();

    @RequestMapping("/gram")
    public double gram(@RequestParam double ounce){
        return a.gram(ounce);
    }
    @RequestMapping("/kilogram")
    public double kilogram(@RequestParam double stone){
        return a.kilogram(stone);
    }
}
