package com.manytomany;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Student {
  @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
  private int id;
  private String name;

  @ManyToMany (fetch = FetchType.EAGER, cascade = CascadeType.ALL)
  @JoinTable(name="Student_Dept", 
      joinColumns=@JoinColumn(name="Stut_ID"),
      inverseJoinColumns=@JoinColumn(name="DEPT_ID"))  
  private Collection<DepartmentMany> departments;
  public Student() {
    departments = new ArrayList<DepartmentMany>();
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

  public void setName(String name) {
    this.name = name;
  }
  


  public Collection<DepartmentMany> getDepartments() {
    return departments;
  }

  public void setDepartment(Collection<DepartmentMany> departments) {
    this.departments = departments;
  }

  public String toString() {
    return "\n\nID:" + id + "\nName:" + name ;
  }
}