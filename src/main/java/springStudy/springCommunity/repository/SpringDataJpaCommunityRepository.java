package springStudy.springCommunity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import springStudy.springCommunity.domain.Community;

import java.util.Optional;

public interface SpringDataJpaCommunityRepository extends JpaRepository<Community, Long>, CommunityRepository {
    @Override
    Optional<Community> findByTitle(String title);
}
