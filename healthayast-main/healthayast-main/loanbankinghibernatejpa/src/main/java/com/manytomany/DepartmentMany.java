package com.manytomany;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="department_details")
public class DepartmentMany {
    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    private String name;

    @ManyToMany(mappedBy="departments")
    private Collection<Student> students;
    
    public DepartmentMany(){
      students = new ArrayList<Student>();
    }
    
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String deptName) {
        this.name = deptName;
    }
    public Collection<Student> getStudents() {
      return students;
    }

    public void setStudent(Collection<Student> students) {
      this.students = students;
    }

    public String toString() {
        return "Department id: " + getId() + 
               ", name: " + getName();
    }
}