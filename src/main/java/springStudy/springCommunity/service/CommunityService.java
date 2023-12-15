package springStudy.springCommunity.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import springStudy.springCommunity.domain.Community;
import springStudy.springCommunity.repository.SpringDataJpaCommunityRepository;



@Service
@RequiredArgsConstructor
@Transactional
public class CommunityService {

    private final SpringDataJpaCommunityRepository springDataJpaCommunityRepository;

    public Long addCommunity(Community community) {
        return springDataJpaCommunityRepository.save(community).getId();
    }
}
