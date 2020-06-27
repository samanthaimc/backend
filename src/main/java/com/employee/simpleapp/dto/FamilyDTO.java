package com.employee.simpleapp.dto;

public class FamilyDTO {

    private String id;
    private String memberName;

    public FamilyDTO() {
    }

    public FamilyDTO(String id, String memberName) {
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
