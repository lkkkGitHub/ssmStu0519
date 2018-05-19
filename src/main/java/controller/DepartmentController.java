package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import service.DepartmentService;

@Controller
@RequestMapping("/Department")
public class DepartmentController {
    @Autowired
    DepartmentService departmentService;

}
