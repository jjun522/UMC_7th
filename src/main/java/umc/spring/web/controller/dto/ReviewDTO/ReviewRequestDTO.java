package umc.spring.web.controller.dto.ReviewDTO;

import lombok.Getter;
import lombok.Setter;

public class ReviewRequestDTO {

    @Getter
    @Setter
    //왜 dto에도 setter를 안넣는지 궁금
    public static class JoinReviewDTO {
        Long userId;
        Long storeId;
        Integer rating;
        String comment;
    }
}
