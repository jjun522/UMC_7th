package umc.spring.repository.UserMissionRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import umc.spring.domain.UserMission;
import umc.spring.domain.emums.MissionStatus;

@Repository
public interface UerMissionRepository extends JpaRepository<UserMission ,Long> {
    boolean existsByMissionIdAndMissionStatus(Long missionId, MissionStatus missionStatus);
}
