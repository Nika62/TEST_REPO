package com.example.TEST_REPO;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final UserMapper userMapper;

    @Override
    public UserDto createUser(UserDto userDto) {
        User user;
        try {
            user = userRepository.save(userMapper.convertUserDtoToUser(userDto));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return userMapper.convertUserToUserDto(user);

    }
}
