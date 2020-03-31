package ourbusinessproject;

import org.springframework.stereotype.Service;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.List;


@Service
@Transactional
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


    public List<Project> findAllProjects() {
        String query = "SELECT p FROM Project p JOIN FETCH p.enterprise e ORDER BY p.title";
        TypedQuery<Project> queryObj = entityManager.createQuery(query, Project.class);
        return queryObj.getResultList();
    }
}
