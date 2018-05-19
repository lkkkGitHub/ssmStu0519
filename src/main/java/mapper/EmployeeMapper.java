package mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pojo.Employee;
import pojo.EmployeeExample;

public interface EmployeeMapper {
    long countByExample(EmployeeExample example);

    int deleteByExample(EmployeeExample example);

    int deleteByPrimaryKey(Integer empId);

    int insert(Employee record);

    int insertSelective(Employee record);

    List<Employee> selectByExample(EmployeeExample example);

    Employee selectByPrimaryKey(Integer empId);

    int updateByExampleSelective(@Param("record") Employee record, @Param("example") EmployeeExample example);

    int updateByExample(@Param("record") Employee record, @Param("example") EmployeeExample example);

    int updateByPrimaryKeySelective(Employee record);

    int updateByPrimaryKey(Employee record);
//   查询员工的个人信息以及所在的部门
    List<Employee> selectByExampleWithDept();
//    根据主键查询员工个人信息以及所在的部门
    Employee selectByPrimaryKeyWithDept(int empId);
}