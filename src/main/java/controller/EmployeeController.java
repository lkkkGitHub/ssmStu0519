package controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import pojo.Employee;
import service.EmployeeService;

import java.util.List;

@Controller
@RequestMapping("/Employee")
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    /**
     * 查出所有员工信息以及所属部门
     * 利用分页插件进行分页查询
     * @return
     */
    @RequestMapping("/getAllEmpl")
    public ModelAndView getAllEmpl(@RequestParam(value ="pageNum",defaultValue = "1")Integer pageNum
            ,Model model){
        //先设置查看的第几页，以及每页的数据量   将会自动添加到之后的查询sql中
        PageHelper.startPage(pageNum,5);
        List<Employee> employeeList=employeeService.getAllEmpl();
//       将查询到的信息传入pageInfo中进行封装，方便页面读取
        PageInfo pageInfo=new PageInfo(employeeList);
        model.addAttribute("pageInfo",pageInfo);
        return new ModelAndView("employeeList");
    }
}
