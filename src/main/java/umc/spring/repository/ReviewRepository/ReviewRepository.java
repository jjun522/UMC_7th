package umc.spring.repository.ReviewRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import umc.spring.domain.Review;

import java.util.Optional;

public interface ReviewRepository extends JpaRepository<Review, Long> ,ReviewRepositoryCustom{
}
