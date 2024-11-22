package umc.spring.converter;

import umc.spring.domain.Store;
import umc.spring.domain.mapping.Mission;
import umc.spring.web.controller.dto.addMissionDTO.MissionRequestDTO;
import umc.spring.web.controller.dto.addMissionDTO.MissionResponseDTO;

import java.time.LocalDateTime;

public class MissionConverter {


    public static MissionResponseDTO.JoinResultDTO ToMissionDTO(Mission mission) {
        return MissionResponseDTO.JoinResultDTO.builder()
                .missionId(mission.getId())
                .storeId(mission.getStore().getId())
                .missionTitle(mission.getTitle())
                .missionDescription(mission.getDescription())
                .points(mission.getPoint())
                .createdAt(LocalDateTime.now())
                .build();
    }

    public static Mission ToMission(MissionRequestDTO.JoinAddMissionDTO request, Store store){
        return Mission.builder()
                .store(store)
                .title(request.getMissionTitle())
                .description(request.getMissionDescription())
                .point(request.getPoint())
                .build();
    }
}
