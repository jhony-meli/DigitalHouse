package dao;

import entity.Anuncios;
import util.JPAUtil;

import javax.persistence.EntityManager;

public class AnuncioPersistence {

    private EntityManager em;

    public AnuncioPersistence() {
        em = JPAUtil.getEntityManager();
    }

    public Anuncios get(int id) {
        return em.find(Anuncios.class, id);
    }

    public void atualiza(Anuncios anunciosExistente) {
        em.getTransaction().begin();
        Anuncios anuncioParaSerAtualizada = em.find(Anuncios.class, anunciosExistente.getCodigo());
        em.getTransaction().commit();
    }

    public void insere(Anuncios anuncios) {
        try {
            em.getTransaction().begin();
            em.persist(anuncios);
            em.getTransaction().commit();
        } catch (RuntimeException e) {
            em.getTransaction().rollback();
        }
    }
}
