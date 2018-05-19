package mapper;

import org.junit.Test;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import pojo.Employee;
import until.SpringTest;

import java.util.List;
import java.util.UUID;


public class EmployeeMapperTest extends SpringTest {
    @Autowired
    EmployeeMapper employeeMapper;

    @Autowired
    SqlSessionTemplate sqlSessionTemplate;

    @Test
    public void selectByExampleWithDept() {
        List<Employee> employees = employeeMapper.selectByExampleWithDept();
    }

    @Test
    public void selectByPrimaryKeyWithDept() {
        Employee employee = employeeMapper.selectByPrimaryKeyWithDept(1);
    }

    @Test
    public void insert() {
//        插入单个员工
//        employeeMapper.insert(new Employee(null,"对方","A","96387454@qq.com",1));

//        利用可执行批量操作的sqlsessinoTemplate 批量插入员工信息
        EmployeeMapper employeeMapper1 = sqlSessionTemplate.getMapper(EmployeeMapper.class);
        for (int i = 0; i < 20; i++) {
            int k = (int) (Math.random() * 2) + 1;
            int j = (int) (Math.random() * 10) + 1;
            Employee employee = new Employee();
            String uuid = UUID.randomUUID().toString().substring(0, 5);
            employee.setEmpName(uuid + i);
            employee.setEmail(uuid + i + "@qq.com");
            employee.setDeptId(k);
            if (j >= 5) {
                employee.setEmpSex("A");
            } else {
                employee.setEmpSex("B");
            }
            employeeMapper1.insert(employee);
        }
    }
}