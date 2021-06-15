package springdemo.pojo;

import java.util.Date;

public class Employee {
    private String name;
    private Integer id;
    private String emali;
    private Date birth;
    private Department department;

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", emali='" + emali + '\'' +
                ", birth=" + birth +
                ", department=" + department +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmali() {
        return emali;
    }

    public void setEmali(String emali) {
        this.emali = emali;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Employee(String name, Integer id, String emali, Department department) {
        this.name = name;
        this.id = id;
        this.emali = emali;
        this.birth = new Date();
        this.department = department;
    }

    public Employee() {
    }
}
