package springdemo.dao;

import org.springframework.stereotype.Component;
import springdemo.pojo.Department;

import java.util.*;

@Component
public class DepartmentDao {
    private static Map<Integer, Department> departments = null;

    static{
        departments = new HashMap<Integer, Department>();
        departments.put(101,new Department(101,"看门部"));
        departments.put(102,new Department(102,"小卖部"));
        departments.put(103,new Department(103,"纸尿部"));
    }

    public Collection<Department> getDepartment(){
        return departments.values();
    }

    public Department getDepartmentbyid(Integer id){
        return departments.get(id);
    }

}
