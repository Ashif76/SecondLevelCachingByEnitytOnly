package com.cache.secondlevel.entities;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.springframework.cache.annotation.EnableCaching;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "organization")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class Organization  {

    @GeneratedValue(strategy = GenerationType.AUTO)
    int orgId;

    String orgName;

    @Id
    Integer empId;

    public int getOrgId() {
        return orgId;
    }

    public void setOrgId(final int orgId) {
        this.orgId = orgId;
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(final String orgName) {
        this.orgName = orgName;
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(final Integer empId) {
        this.empId = empId;
    }
}
