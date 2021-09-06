package com.company;

public class Cliente implements UsuarioAut{

    private DadosAut dadosAut;

    public Cliente(String login, String senha){
        dadosAut = new DadosAut(login, senha);
    }

    @Override
    public boolean autentica(String login, String senha){
        if (login.equals(dadosAut.getLogin()) && senha.equals(dadosAut.getSenha())){
            return true;
        } else {
            return false;
        }
    }
}
