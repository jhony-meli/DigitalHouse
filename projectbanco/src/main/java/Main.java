import dao.AnuncioPersistence;
import dao.VendedorPersistence;
import entity.Anuncios;
import entity.Endereco;
import entity.Vendedores;
import service.AnuncioService;
import service.VendedorService;

import java.math.BigDecimal;
import java.sql.Array;
import java.sql.Date;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

//        AnuncioPersistence anuncioPersistence = new AnuncioPersistence();
//        AnuncioService anuncioService = new AnuncioService(anuncioPersistence);
//        Anuncios anuncios = new Anuncios(4,"Triciclo",1,new BigDecimal(2000), Date.valueOf("2021-10-05"),20);
//
//        anuncioService.salva(anuncio);
//
//        Anuncios anuncios = anuncioService.busca(1);
//        System.out.println(anuncios);
//
//        anuncioService.salva(anuncios);
//        System.out.println(anuncios);

        VendedorPersistence vendedorPersistence = new VendedorPersistence();
        VendedorService vendedorService = new VendedorService(vendedorPersistence);
        Vendedores vendedores = new Vendedores(6,"123.987.654-87", "Jhony Maravilhoso");
        List<Endereco> enderecoJhony = Arrays.asList(new Endereco("09876-588","Rua da Liberdade", "Ap 23", 367, "SP", "Sao Paulo", vendedores));

        vendedores.setEndereco(enderecoJhony);

        vendedorService.salva(vendedores);
    }
}
