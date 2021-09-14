package model.service;

import model.entity.Medico;
import model.entity.Paciente;
import model.entity.Proprietario;
import util.PacienteDAO;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PacienteService {

    private Paciente paciente;
    private List<Paciente> listaPaciente = new ArrayList<>();

    public List<Paciente> getListaPaciente() {
        return listaPaciente;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void cadastarPaciente(String especie, String raca, String cor, LocalDate dataNascimento
            , String nome, Proprietario proprietario, String tipoAnimal) {
        paciente = new Paciente(listaPaciente.size(), especie, raca, cor, dataNascimento, nome, proprietario, tipoAnimal);
        PacienteDAO pacienteDAO = new PacienteDAO("paciente.txt");
        //pacienteDAO.salva(paciente);
        //pacienteDAO.fechar();
    }

    public void listarPacienteProprietarios(List<Paciente> listaPaciente) {
        listaPaciente.sort((Paciente p1, Paciente p2) -> p1.getProprietario().getNome().compareTo(p2.getProprietario().getNome()));
    }

    public void adicionarListaPaciente(Paciente paciente) {
            listaPaciente.add(paciente);
    }

    public void carregarPacienteArquivo() {
        PacienteDAO pacienteDAO = new PacienteDAO("paciente.txt");
        List<String> lista = pacienteDAO.carregarArquivo();
        System.out.println(lista);

        String paciente = null;
        for (String s:lista) {
            paciente = ""+s.toString();
            System.out.println(paciente);
        }
    }
}
