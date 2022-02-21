package com.library;

import com.library.usermanagement.enums.UserRolesEnum;

public class SampleCodes {
    public static void main(String[] args) {
        for(UserRolesEnum ue: UserRolesEnum.values()) {
            System.out.println(ue.name() + "    " + ue.getRoleType());
        }
    }
}
