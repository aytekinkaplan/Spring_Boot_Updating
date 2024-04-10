package com.updatingworks.springbootupdating;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class GradeController {
    List<Grade> studentGrade = Arrays.asList(
            new Grade("John", "Math", "A"),
            new Grade("Sara", "Science", "B"),
            new Grade("Mark", "History", "C"),
            new Grade("Mary", "English", "D"),
            new Grade("Jane", "Science", "F")
    );

    @GetMapping("/")
    public String gradeForm(Model model) {
        model.addAttribute("grade", new Grade("John", "Math", "A"));
        return "form";
    }


}
