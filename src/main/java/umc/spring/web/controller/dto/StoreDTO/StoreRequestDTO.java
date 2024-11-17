package umc.spring.web.controller.dto.StoreDTO;

import lombok.Getter;

public class StoreRequestDTO {

    @Getter
    public static class joinStoreDTO{
        String name;
        String address;
        Integer status;
        String description;
    }
}
