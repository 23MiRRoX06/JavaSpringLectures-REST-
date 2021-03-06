package ua.lviv.iot.spring.first.rest.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "\"group\"")
public class Group {

  @Id
  @GeneratedValue(strategy = GenerationType.TABLE)
  private Integer id;

  private String name;

  private int enrollmentYear;

  @OneToMany(mappedBy = "group", fetch = FetchType.EAGER)
  @JsonIgnoreProperties("group")
  private Set<Student> students;

  public Set<Student> getStudents() {
    return students;
  }

  public void setStudents(Set<Student> students) {
    this.students = students;
  }

  public Group() {

  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getEnrollmentYear() {
    return enrollmentYear;
  }

  public void setEnrollmentYear(int enrollmentYear) {
    this.enrollmentYear = enrollmentYear;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

}
