package com.library.usermanagement.enums;

public enum UserRolesEnum {
    ADMIN("Administrator"),
    STUDENT("Student"),
    STAFF("Staff"),
    LIBRARIAN("Librarian");

    private String roleType;

    UserRolesEnum(String roleType) {
        this.roleType = roleType;
    }

    public void setRoleType(String roleType) {
        this.roleType = roleType;
    }

    public String getRoleType() {
        return this.roleType;
    }

}
