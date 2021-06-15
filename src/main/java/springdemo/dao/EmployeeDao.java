package springdemo.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import springdemo.pojo.Department;
import springdemo.pojo.Employee;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
@Component
public class EmployeeDao {
    private static Map<Integer, Employee> employees = null;
    @Autowired
    private DepartmentDao departmentDao;

    static{
        employees = new HashMap<Integer, Employee>();
        employees.put(1,new Employee("sdf",1,"123@qq",new Department(101,"看门部")));
        employees.put(2,new Employee("sps",2,"135@qq",new Department(102,"小卖部")));
        employees.put(3,new Employee("sdp",3,"346@qq",new Department(103,"纸尿部")));
    }
    public static Integer initid = 104;

    public void add (Employee employee){
        if(employee.getId()==null){
            employee.setId(initid++);
        }

        employee.setDepartment(departmentDao.getDepartmentbyid(employee.getDepartment().getId()));
        employees.put(employee.getId(),employee);
    }

    public Collection<Employee> GetEmployee(){
        return employees.values();
    }
    public Employee GetEmployeebyid(Integer id){
        return employees.get(id);
    }
    public void  delete(Integer id){
        employees.remove(id);
    }


}
