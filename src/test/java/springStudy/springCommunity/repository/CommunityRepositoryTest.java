package springStudy.springCommunity.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;
import springStudy.springCommunity.domain.Community;

import static org.junit.jupiter.api.Assertions.assertEquals;


@SpringBootTest
@Transactional
public class CommunityRepositoryTest {


    @Autowired CommunityRepository communityRepository;
    @Test
    void H2ConnectTest() {

        Community community = new Community();
        community.setTitle("test");

        Long saveId = communityRepository.save(community);
        Community findCommunity = communityRepository.findById(saveId);
        assertEquals(community, findCommunity);
    }


}