package umc.spring.web.controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import umc.spring.apiPayload.ApiResponse;
import umc.spring.service.MissionService.MissionQueryService;
import umc.spring.web.controller.dto.addMissionDTO.MissionRequestDTO;
import umc.spring.web.controller.dto.addMissionDTO.MissionResponseDTO;

@RestController
@RequiredArgsConstructor
@RequestMapping("/mission")
public class MissionController {

    private final MissionQueryService missionService;

    @PostMapping("/add")
    public ApiResponse<MissionResponseDTO.JoinResultDTO> addMission(@RequestBody @Valid MissionRequestDTO.JoinAddMissionDTO request){
        return ApiResponse.onSuccess(missionService.JoinDTO(request));
    }

}
