import dao.VendedorPersistence;
import entity.Enderecos;
import entity.Vendedores;
import service.VendedorService;

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
        Vendedores vendedores = new Vendedores("123.987.654-87", "Jhony Mau");
        List<Enderecos> enderecosJhony = Arrays.asList(new Enderecos("09876-588","Rua da Liberdade", "Ap 23", 367, "SP", "Sao Paulo", vendedores));

        vendedores.setEndereco(enderecosJhony);

        vendedorService.salva(vendedores);

        //vendedorService.remove(vendedores);
    }
}
