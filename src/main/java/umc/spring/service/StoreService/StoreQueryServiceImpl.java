package umc.spring.service.StoreService;

import org.springframework.transaction.annotation.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import umc.spring.domain.Review;
import umc.spring.domain.Store;
import umc.spring.repository.ReviewRepository.ReviewRepository;
import umc.spring.repository.StoreRepository.StoreRepository;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class StoreQueryServiceImpl implements StoreQueryService {

    private final StoreRepository storeRepository;
    private final ReviewRepository reviewRepository;


    @Override
    public Optional<Store> findStore(Long id) {
        return storeRepository.findById(id);
    }

    @Override
    public Optional<Review> findReview(Long id) {
        return reviewRepository.findById(id);
    }



    @Override
    public List<Store> findStoresByNameAndScore(String name, Integer rating) {
        // StoreRepository에서 BooleanBuilder를 이용한 동적 쿼리로 필요한 데이터 필터링
        List<Store> filteredStores = storeRepository.dynamicQueryWithBooleanBuilder(name, rating);

        // Store 및 연결된 Review 데이터 출력
        filteredStores.forEach(store -> {
            System.out.println("Store: " + store);
            store.getStoreReviews().forEach(review -> System.out.println(" - Review: " + review));
        });
        return filteredStores;
    }


}
