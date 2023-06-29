package org.aguzman.apiservlet.webapp.headers.util;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class JpaUtil {

        private  static final EntityManagerFactory entityManagerFactory =
                buildEntityManagerFactor();

        private static EntityManagerFactory buildEntityManagerFactor(){
            return Persistence.createEntityManagerFactory("ejemplo");
        }

        public static EntityManager getEntityManager(){
            return entityManagerFactory.createEntityManager();
        }
    }

