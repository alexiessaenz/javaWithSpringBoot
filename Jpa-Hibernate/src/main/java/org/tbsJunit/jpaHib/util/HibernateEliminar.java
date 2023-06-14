package org.tbsJunit.jpaHib.util;

import jakarta.persistence.EntityManager;
import org.hibernate.engine.spi.SessionDelegatorBaseImpl;
import org.tbsJunit.jpaHib.entity.Cliente;

import java.util.Scanner;

public class HibernateEliminar {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("ingrese el id del cliente a eliminar");
        Long id = s.nextLong();
        EntityManager em = JpaUtil.getEntityManager();

        try {
            Cliente cliente = em.find(Cliente.class, id);
            em.getTransaction().begin();
            em.remove(cliente);
            em.getTransaction().commit();
        } catch(Exception e){
            em.getTransaction().rollback();
            e.printStackTrace();
        } finally {
            em.close();
        }

    }
}
