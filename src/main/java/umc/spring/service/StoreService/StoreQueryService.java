package umc.spring.service.StoreService;

import umc.spring.domain.Review;
import umc.spring.domain.Store;

import java.util.List;
import java.util.Optional;

public interface StoreQueryService {

    Optional<Store> findStore(Long id);
    Optional<Review> findReview(Long id);
    List<Store> findStoresByNameAndScore(String name, Integer rating);

}
