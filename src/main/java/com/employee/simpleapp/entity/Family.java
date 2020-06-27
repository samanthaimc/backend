package com.employee.simpleapp.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Family {
    @Id
    private String id;
    private String memberName;

    public Family() {
    }

    public Family(String id, String memberName) {
        this.id = id;
        this.memberName = memberName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }
}
