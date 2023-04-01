package org.example.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/first")
public class Calculator {
    @GetMapping("/calculator")
    public String calculatorPage(@RequestParam(value = "a", required = false) String a, @RequestParam(value = "b", required = false) String b,
                                 @RequestParam(value = "action", required = false) String action,
                                 Model model){
        if (action == null || a == null || b == null) {
            model.addAttribute("message", "NO all detials");
        } else if (action.equals("multiplication")) {
            int a1 =  Integer.parseInt(a);
            int b1 = Integer.parseInt(b);
            a1 *= b1;
            model.addAttribute( "message", toString(a1));
        } else if (action.equals("addition")) {
            int a1 =  Integer.parseInt(a);
            int b1 = Integer.parseInt(b);
            a1 += b1;
            model.addAttribute( "message", toString(a1));
        } else if (action.equals("subtraction")) {
            int a1 =  Integer.parseInt(a);
            int b1 = Integer.parseInt(b);
            a1 -= b1;
            model.addAttribute( "message", toString(a1));
        } else if(action.equals("division")) {
            int a1 =  Integer.parseInt(a);
            int b1 = Integer.parseInt(b);
            a1 /= b1;
            model.addAttribute( "message", toString(a1));
        } else {
            model.addAttribute("message", "NO all detials");
        }

        return "/calculator/calculator";
    }

    private Object toString(int a) {
        return "answer " + a;
    }
}
