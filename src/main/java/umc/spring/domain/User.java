package umc.spring.domain;
import jakarta.persistence.*;
import lombok.*;
import umc.spring.domain.common.BaseEntity;
import umc.spring.domain.emums.Gender;
import umc.spring.domain.emums.SocialType;

import java.time.LocalDate;

@Entity
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class User extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    private String name;

    private LocalDate birthDay;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    private String address;

    private String foodData;

    @Enumerated(EnumType.STRING)
    private SocialType loginMethod;

}
