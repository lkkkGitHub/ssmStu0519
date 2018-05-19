package service;

import mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pojo.Employee;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    EmployeeMapper employeeMapper;

    /**
     * 查询所有员工信息以及所在的部门
     * @return
     */
    public List<Employee> getAllEmpl(){
        return employeeMapper.selectByExampleWithDept();
    }
}
