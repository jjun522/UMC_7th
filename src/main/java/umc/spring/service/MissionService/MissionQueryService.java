package umc.spring.service.MissionService;

import umc.spring.web.controller.dto.MissionChallenge.MissionChallengeRequestDTO;
import umc.spring.web.controller.dto.MissionChallenge.MissionChallengeResponseDTO;
import umc.spring.web.controller.dto.addMissionDTO.MissionRequestDTO;
import umc.spring.web.controller.dto.addMissionDTO.MissionResponseDTO;

public interface MissionQueryService {
    MissionResponseDTO.JoinResultDTO JoinDTO(MissionRequestDTO.JoinAddMissionDTO request);
    MissionChallengeResponseDTO.JoinChallengeResultDTO JoinChallengeDTD(MissionChallengeRequestDTO.JoinAddMissionChallengeDTO result , Long userId);

}
