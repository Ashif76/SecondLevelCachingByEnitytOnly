package com.cache.secondlevel.entities;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.NaturalId;

import javax.persistence.*;
import java.util.List;

@Entity(name = "employee")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class Employee {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;

    @Column(name="employee_name",length=60)
    private String employeeName;
    
    @NaturalId
    @Column(name="user_name",length=60,nullable=false)
    private String username;
    
    @Column(name="password",nullable=false)
    private String password;
    
    @Column(name="accress_level")
    private int accessLevel;

	@OneToMany(cascade = {CascadeType.ALL},fetch = FetchType.LAZY)
	@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
	@JoinColumn(name = "empId")
	List<Organization> organizations ;

	public List<Organization> getOrganizations() {
		return organizations;
	}

	public void setOrganizations(final List<Organization> organizations) {
		this.organizations = organizations;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setAccessLevel(int accessLevel) {
		this.accessLevel = accessLevel;
	}
	
	public int getAccessLevel() {
		return accessLevel;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", employeeName=" + employeeName + ", username=" + username + ", password="
				+ password + ", accessLevel=" + accessLevel + "]";
	}
}