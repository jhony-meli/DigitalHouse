package service;

import dao.AnuncioPersistence;
import entity.Anuncio;

public class AnuncioService {

    private AnuncioPersistence anuncioPersistence;

    public AnuncioService(AnuncioPersistence anuncioPersistence) {
        this.anuncioPersistence = anuncioPersistence;
    }

    public void salva(Anuncio anuncio) {

            Anuncio anuncioExistente = anuncioPersistence.get(anuncio.getTitulo());


            if(!(anuncioExistente == null)){
                anuncioExistente.setTitulo(anuncio.getTitulo());
                anuncioExistente.setCodigo_vendedor(anuncio.getCodigo_vendedor());
                anuncioExistente.setPreco(anuncio.getPreco());
                anuncioExistente.setData_anuncio(anuncio.getData_anuncio());
                anuncioExistente.setNum_vendas(anuncio.getNum_vendas());
                anuncioPersistence.atualiza(anuncioExistente);
            } else {
                anuncioPersistence.insere(anuncio);
            }

        }
}
