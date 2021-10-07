package service;

import dao.VendedorPersistence;
import entity.Vendedores;

public class VendedorService {

    private VendedorPersistence vendedorPersistence;

    public VendedorService(VendedorPersistence vendedorPersistence) {
        this.vendedorPersistence = vendedorPersistence;
    }

    public void salva(Vendedores vendedores){

        Vendedores vendedoresExistentes = vendedorPersistence.get(vendedores.getCodigo());

        if (!(vendedoresExistentes == null)){
            vendedoresExistentes.setCpf(vendedores.getCpf());
            vendedoresExistentes.setNome(vendedores.getNome());
            vendedoresExistentes.setEndereco(vendedores.getEndereco());
            vendedorPersistence.atualiza(vendedoresExistentes);
        } else {
            vendedorPersistence.insere(vendedores);
        }
    }
    public Vendedores busca(int id) {
        return vendedorPersistence.get(id);
    }
}
