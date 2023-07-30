package br.com.cadastrousuarios;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import java.util.ArrayList;
import java.util.List;

@Named
@RequestScoped
public class CadastroUsuariosBean {

    private String nome;
    
    private List<String> nomesCadastrados = new ArrayList<>();

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<String> getNomesCadastrados() {
        return nomesCadastrados;
    }

  
    public void cadastrar() {
        nomesCadastrados.add(nome);
        nome = null;
    }
}
