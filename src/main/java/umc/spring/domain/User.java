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

    @Column(nullable = false, length = 45)
    private String name;

    @Column(nullable = true)
    private LocalDate birthDay;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 10)
    private Gender gender;

    @Column(nullable = false, length = 100)
    private String address;

    @Column(length = 100)
    private String foodData;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 20)
    private SocialType loginMethod;
}
