package springStudy.springCommunity.repository;


import springStudy.springCommunity.domain.Community;

import java.util.Optional;

public interface CommunityRepository {
    Optional<Community> findByCommunityTitle(String communityTitle);
}
