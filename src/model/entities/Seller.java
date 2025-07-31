package model.entities;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;
import java.util.Objects;

public class Seller implements Serializable {
    private static final long serialVersionUID = 1L;
    private int id;
    private String name;
    private double baseSalary;
    private String email;
    private Date dateOfBirth;
    private Department department;




    public Seller() {

    }
    public Seller(int id, String name, double baseSalary, String email, Date dateOfBirth, Department department) {
        this.id = id;
        this.name = name;
        this.baseSalary = baseSalary;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
        this.department = department;

    }

    @Override
    public String toString() {
        return "Seller{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", baseSalary=" + baseSalary +
                ", email='" + email + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", department=" + department +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Seller seller = (Seller) o;
        return id == seller.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
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

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

}
