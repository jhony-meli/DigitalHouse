package dao;

import entity.Anuncios;
import entity.Vendedores;
import util.JPAUtil;

import javax.persistence.EntityManager;

public class VendedorPersistence {

    private EntityManager em;

    public  VendedorPersistence() {
        em = JPAUtil.getEntityManager();
    }

    public void atualiza(Vendedores vendedoresExistentes){
        em.getTransaction().begin();
        Vendedores vendedorParaAtualizar = em.find(Vendedores.class, vendedoresExistentes.getCodigo());
        em.getTransaction().commit();
    }
    public Vendedores get(int id) {
        return em.find(Vendedores.class, id);
    }

    public void insere(Vendedores vendedores){
        try {
            em.getTransaction().begin();
            em.persist(vendedores);
            em.getTransaction().commit();
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
            em.getTransaction().rollback();
        }
    }

    public void deleta(Vendedores vendedores) {
        Vendedores vendedorParaAtualizar = em.find(Vendedores.class, vendedores.getCodigo());
        try {
            em.getTransaction().begin();
            em.remove(vendedorParaAtualizar);
            em.getTransaction().commit();
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
            em.getTransaction().rollback();
        }
    }
}
