import dao.AnuncioPersistence;
import entity.Anuncio;
import service.AnuncioService;
import util.BancoDeDados;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {

        AnuncioPersistence anuncioPersistence = new AnuncioPersistence();
        AnuncioService anuncioService = new AnuncioService(anuncioPersistence);
        Anuncio anuncio = new Anuncio("Moto",1,new BigDecimal(5000.00),Date.valueOf("2021-10-05"),20);

        anuncioService.salva(anuncio);

    }
}
