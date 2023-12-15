package springStudy.springCommunity.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;
import springStudy.springCommunity.domain.Community;
import springStudy.springCommunity.repository.SpringDataJpaCommunityRepository;


import java.time.LocalDateTime;
import java.util.Optional;

import static java.time.LocalDateTime.now;
import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
@Transactional
class CommunityServiceTest {

    @Autowired SpringDataJpaCommunityRepository communityRepository;
    @Autowired CommunityService communityService;

    @Test
    public void addCommunityTest() throws Exception {
        // given
        Community community = new Community();
        community.setCommunityTitle("fighting");
        community.setCommunityContent("fighting spring boot");
        community.setCommunityWriter("youngJae Byun");
        community.setCommunityDate(LocalDateTime.now());

        // when
        Long savedId = communityService.addCommunity(community);
        Optional<Community> findCommunity = communityRepository.findByCommunityTitle("fighting");

        // then
        assertTrue(findCommunity.isPresent());
        assertEquals(savedId, findCommunity.get().getId());
    }
}