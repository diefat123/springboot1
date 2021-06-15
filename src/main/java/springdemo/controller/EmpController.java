package springdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import springdemo.dao.DepartmentDao;
import springdemo.dao.EmployeeDao;
import springdemo.pojo.Department;
import springdemo.pojo.Employee;

import java.util.Collection;

@Controller
public class EmpController {
    @Autowired
    EmployeeDao employeeDao;
    @Autowired
    DepartmentDao departmentDao;

    @RequestMapping("/emps")
    public String emp(Model model){
        Collection<Employee> employees = employeeDao.GetEmployee();
        model.addAttribute("emp",employees);
        return "/emp/list";
    }
    @GetMapping("/toAdd")
    public String add(Model model){
        Collection<Department> departments = departmentDao.getDepartment();
        model.addAttribute("dept",departments);
        return "/emp/add";
    }
    @PostMapping("toAdd")
    public String addemp(Employee employee){
        employeeDao.add(employee);
        return "redirect:/emps";
    }
    @GetMapping("/emp/{id}")
    public String toupdate(@PathVariable("id") Integer id,Model model){
        Employee employee = employeeDao.GetEmployeebyid(id);
        model.addAttribute("emp",employee);
        Collection<Department> departments = departmentDao.getDepartment();
        model.addAttribute("department",departments);
        return "emp/update";
    }
    @RequestMapping("/updateemp")
    public String update(Employee employee){
        employeeDao.add(employee);

        return "redirect:/emps";
    }
    @RequestMapping("/delete/{id}")
    public String delete(@PathVariable("id") Integer id){
        employeeDao.delete(id);
        return "redirect:/emps";
    }


}
