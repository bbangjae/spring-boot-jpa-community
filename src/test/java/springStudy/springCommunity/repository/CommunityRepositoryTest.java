package springStudy.springCommunity.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;
import springStudy.springCommunity.domain.Community;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


@SpringBootTest
@Transactional
public class CommunityRepositoryTest {


    @Autowired
    SpringDataJpaCommunityRepository communityRepository;
    @Test
    void H2ConnectTest() {

        Community community = new Community();
        community.setCommunityTitle("test");

        Community savedCommunity = communityRepository.save(community);

        Long savedId = savedCommunity.getId();
        Optional<Community> findCommunity = communityRepository.findById(savedId);

        assertTrue(findCommunity.isPresent());
        assertEquals(findCommunity.get().getId(), savedId);
    }
}