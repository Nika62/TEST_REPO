package com.example.TEST_REPO;

import org.springframework.stereotype.Component;
@Component
public class UserMapper {
    public UserDto convertUserToUserDto(User user) {

        if (user == null) {
            return null;
        }
        UserDto userDto = new UserDto();

        userDto.setId(user.getId());
        userDto.setName(user.getName());
        userDto.setEmail(user.getEmail());

        return userDto;
    }

    public User convertUserDtoToUser(UserDto userDto) {

        if (userDto == null) {
            return null;
        }
        User user = new User();
        user.setId(userDto.getId());
        user.setName(userDto.getName());
        user.setEmail(userDto.getEmail());
        return user;
    }

}
