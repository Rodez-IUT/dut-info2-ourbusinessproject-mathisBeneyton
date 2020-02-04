package ourbusinessproject;

import org.springframework.stereotype.Service;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


@Service
public class EnterpriseProjectService {
    @PersistenceContext
    private EntityManager entityManager;


    public Enterprise findEnterpriseById(Long anId) {
        return entityManager.find(Enterprise.class,anId);
    }

    public Project findProjectById(Long anId) {
        return entityManager.find(Project.class,anId);
    }



    public EntityManager getEntityManager() {
        return entityManager;
    }

    public void save(Object entity) {
        entityManager.persist(entity);
        entityManager.flush();
    }

    public void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
}
