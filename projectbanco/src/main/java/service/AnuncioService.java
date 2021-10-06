package service;

import dao.AnuncioPersistence;
import entity.Anuncios;

public class AnuncioService {

    private AnuncioPersistence anuncioPersistence;

    public AnuncioService(AnuncioPersistence anuncioPersistence) {
        this.anuncioPersistence = anuncioPersistence;
    }

    public void salva(Anuncios anuncios) {

            Anuncios anunciosExistente = anuncioPersistence.get(anuncios.getCodigo());

            if(!(anunciosExistente == null)){
                anunciosExistente.setTitulo(anuncios.getTitulo());
                anunciosExistente.setCodigo_vendedor(anuncios.getCodigo_vendedor());
                anunciosExistente.setPreco(anuncios.getPreco());
                anunciosExistente.setData_anuncio(anuncios.getData_anuncio());
                anunciosExistente.setNum_vendas(anuncios.getNum_vendas());
                anuncioPersistence.atualiza(anunciosExistente);
            } else {
                anuncioPersistence.insere(anuncios);
            }
    }

    public Anuncios busca(int id){
        return anuncioPersistence.get(id);
    }
}
