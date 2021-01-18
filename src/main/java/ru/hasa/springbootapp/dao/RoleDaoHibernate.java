package ru.hasa.springbootapp.dao;

import org.springframework.stereotype.Repository;
import ru.hasa.springbootapp.model.Role;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class RoleDaoHibernate implements RoleDao{

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public Role findByRolename(String name) {
        return entityManager.createQuery("FROM ROLE r WHERE r.name = :name", Role.class).setParameter("name", name).getSingleResult();
    }
}
