package com.app.hausmasbd.mapper;

import com.app.hausmasbd.dto.UserDTO;
import com.app.hausmasbd.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface UserMapper {

    @Mapping(target = "id", ignore = true)

    User toEntity(UserDTO userDto);

    UserDTO toDTO(User user);

}
