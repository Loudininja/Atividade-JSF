package com.example.beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class ContatoBean {

    private String nome;
    private String sobrenome;
    private String fone;
    private String email;

    // Getters e Setters

    public void enviarMensagem() {
    	 FacesContext context = FacesContext.getCurrentInstance();
         context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Mensagem enviada!", null));
    }
}
