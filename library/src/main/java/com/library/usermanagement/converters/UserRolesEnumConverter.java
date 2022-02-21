package com.library.usermanagement.converters;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

import com.library.usermanagement.enums.UserRolesEnum;

@Converter(autoApply = true)
public class UserRolesEnumConverter implements AttributeConverter<UserRolesEnum, String> {

    @Override
    public String convertToDatabaseColumn(UserRolesEnum attribute) {
        if(null == attribute) {
            throw new IllegalArgumentException("Cannot pass null Role.");
        }
        return attribute.name();
    }

    @Override
    public UserRolesEnum convertToEntityAttribute(String dbData) {
        for(UserRolesEnum ue: UserRolesEnum.values()) {
            if(ue.name().equals(dbData)) {
                return ue;
            }
        }
        throw new IllegalArgumentException(dbData + " is not supported.");
    }
}
