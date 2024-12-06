package umc.spring.web.controller.dto.UserDTO;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import umc.spring.Vaildator.annotation.ExistCategories;
import umc.spring.domain.emums.Role;

import java.util.List;

public class UserRequestDTO {

    @Getter
    @Setter
    public static class JoinDto{
        @NotBlank
        String name;
        @NotNull
        Integer gender;
        @NotBlank
        @Email
        String email;
        @NotBlank
        String password;
        @NotNull
        Integer birthYear;
        @NotNull
        Integer birthMonth;
        @NotNull
        Integer birthDay;
        @Size(min = 5, max = 12)
        String address;
        @ExistCategories
        List<Long> preferCategory;
        @NotNull
        Role role;
    }
}
