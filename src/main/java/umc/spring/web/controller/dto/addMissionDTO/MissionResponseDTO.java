package umc.spring.web.controller.dto.addMissionDTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

public class MissionResponseDTO {

    @Builder
    @Getter
    @AllArgsConstructor
    @NoArgsConstructor
    public static class JoinResultDTO {
        Long missionId;
        Long storeId;
        String missionTitle;
        String missionDescription;
        Integer points;
        LocalDateTime createdAt;
    }
}
