package springStudy.springCommunity.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import springStudy.springCommunity.domain.Community;

@Repository
public class CommunityRepository {

    @PersistenceContext
    private  EntityManager em;

    public Long save(Community community) {
        em.persist(community);
        return community.getId();
    }

    public Community findById(Long id) {
        return em.find(Community.class, id);
    }
}
