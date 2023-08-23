package com.Jocata.IDfy.DATA;


import com.Jocata.IDfy.DATAMODEL.IdfyEntity;
import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.*;
import org.springframework.data.jpa.provider.HibernateUtils;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;

@Repository
public class ProfileServiceLayerDaoImpl implements ProfileServiceLayerDao {

    public static final Logger logger = LoggerFactory.getLogger(ProfileServiceLayerDaoImpl.class);

    @Autowired
    private EntityManager entityManager;

    @Override
    public IdfyEntity saveResponse(IdfyEntity idfyEntity) {

        Transaction transaction = null;

        try (Session currentSession = entityManager.unwrap(Session.class)) {
            transaction = currentSession.beginTransaction();

            logger.info("ProfileServiceLayerDaoImpl , Session started ");

            currentSession.saveOrUpdate(idfyEntity);

            logger.info("ProfileServiceLayerDaoImpl , Data saved to database ");
            transaction.commit();

        }
        return idfyEntity;
    }

}



