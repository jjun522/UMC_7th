package umc.spring.converter;

import umc.spring.domain.User;
import umc.spring.domain.emums.Gender;
import umc.spring.web.controller.dto.UserDTO.UserRequestDTO;
import umc.spring.web.controller.dto.UserDTO.UserResponseDTO;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class UserConverter {

    public static UserResponseDTO.JoinResultDTO toJoinResultDTO(User user) {
        return UserResponseDTO.JoinResultDTO.builder()
                .UserId(user.getId())
                .createdAt(LocalDateTime.now())
                .build();
    }

    public static User toUser(UserRequestDTO.JoinDto request) {

        Gender gender = null;

        switch (request.getGender()){
            case 1:
                gender = Gender.MALE;
                break;
            case 2:
                gender = Gender.FEMALE;
                break;
            case 3:
                gender = Gender.NONE;
                break;
        }

        return User.builder()
                .address(request.getAddress())
                .gender(gender)
                .name(request.getName())
                .userPrefers(new ArrayList<>())
                .build();

    }


}
