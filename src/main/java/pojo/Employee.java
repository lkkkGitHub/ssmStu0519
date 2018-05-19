package pojo;

public class Employee {
    private Integer empId;

    private String empName;

    private String empSex;

    private String email;

    private Integer deptId;

//  部门信息    多对一
    private Department department;

    public Employee(Integer empId, String empName, String empSex, String email, Integer deptId) {
        this.empId = empId;
        this.empName = empName;
        this.empSex = empSex;
        this.email = email;
        this.deptId = deptId;
    }

    public Employee() {
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName == null ? null : empName.trim();
    }

    public String getEmpSex() {
        return empSex;
    }

    public void setEmpSex(String empSex) {
        this.empSex = empSex == null ? null : empSex.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }
}