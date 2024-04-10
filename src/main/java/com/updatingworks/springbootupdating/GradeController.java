package com.updatingworks.springbootupdating;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class GradeController {
    List<com.ltp.gradesubmission.Grade> studentGrades = Arrays.asList(
            new com.ltp.gradesubmission.Grade("Harry", "Potions", "C-"),
            new com.ltp.gradesubmission.Grade("Ron", "Arithmancy", "C-"),
            new com.ltp.gradesubmission.Grade("Hermione", "Potions", "A+")
    );
    @GetMapping("/")
    public String start(Model model){
        return "HELLO";
    }

    @GetMapping("/grades")
    public String getGrades(Model model) {

        model.addAttribute("grades", studentGrades);
        return "grades";
    }
}