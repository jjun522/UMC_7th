package umc.spring.web.controller;


import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import umc.spring.apiPayload.ApiResponse;
import umc.spring.repository.ReviewRepository.ReviewRepository;
import umc.spring.service.ReviewService.ReviewQueryServiceImpl;
import umc.spring.service.StoreService.StoreQueryServiceImpl;
import umc.spring.web.controller.dto.ReviewDTO.ReviewRequestDTO;
import umc.spring.web.controller.dto.ReviewDTO.ReviewResponseDTO;
import umc.spring.web.controller.dto.StoreDTO.StoreRequestDTO;
import umc.spring.web.controller.dto.StoreDTO.StoreResponseDTO;

@RestController
@RequiredArgsConstructor
@RequestMapping("/stores")
public class StoreController {

    private final StoreQueryServiceImpl storeQueryService;


    @PostMapping("{regionId}")
    public ApiResponse<StoreResponseDTO.JoinResultDTO>
    join(
            @PathVariable Long regionId,
            @RequestBody @Valid StoreRequestDTO.joinStoreDTO request
    ) {
        StoreResponseDTO.JoinResultDTO result = storeQueryService.joinStore(regionId, request);
        return ApiResponse.onSuccess(storeQueryService.joinStore(regionId, request));
    }


}
