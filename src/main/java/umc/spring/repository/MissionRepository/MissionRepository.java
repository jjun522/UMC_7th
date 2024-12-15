package umc.spring.repository.MissionRepository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import umc.spring.domain.Store;
import umc.spring.domain.mapping.Mission;

@Repository
public interface MissionRepository extends JpaRepository<Mission, Long> {
    Page<Mission> findByStore(Store store, Pageable pageable);
}
