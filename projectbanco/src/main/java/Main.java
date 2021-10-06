import dao.AnuncioPersistence;
import entity.Anuncios;
import service.AnuncioService;

import java.math.BigDecimal;
import java.sql.Date;

public class Main {
    public static void main(String[] args) {

        AnuncioPersistence anuncioPersistence = new AnuncioPersistence();
        AnuncioService anuncioService = new AnuncioService(anuncioPersistence);
        Anuncios anuncios = new Anuncios(4,"Triciclo",1,new BigDecimal(2000), Date.valueOf("2021-10-05"),20);

        //anuncioService.salva(anuncio);

//        Anuncios anuncios = anuncioService.busca(1);
//        System.out.println(anuncios);

        anuncioService.salva(anuncios);
        System.out.println(anuncios);
    }
}
