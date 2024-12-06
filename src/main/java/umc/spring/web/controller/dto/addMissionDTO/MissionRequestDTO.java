package umc.spring.web.controller.dto.addMissionDTO;

import lombok.Getter;
import lombok.Setter;

public class MissionRequestDTO {

    @Getter
    @Setter
    public static class JoinAddMissionDTO {
        Long storeId;
        String missionTitle;
        String missionDescription;
        Integer point;
    }
}
