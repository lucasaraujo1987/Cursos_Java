package com.br.DTO;

import java.util.Date;

public class MembroDTO {

    private int id_membro;
    private String cpf_membro, nome_membro, sobrenome_membro, pai_membro, mae_membro;
    private Date nascimento_membro, batismo_membro;
    

    public int getId_membro() {
        return id_membro;
    }

    public void setId_membro(int id_membro) {
        this.id_membro = id_membro;
    }

    public String getCpf_membro() {
        return cpf_membro;
    }

    public void setCpf_membro(String cpf_membro) {
        this.cpf_membro = cpf_membro;
    }

    public String getNome_membro() {
        return nome_membro;
    }

    public void setNome_membro(String nome_membro) {
        this.nome_membro = nome_membro;
    }

    public String getSobrenome_membro() {
        return sobrenome_membro;
    }

    public void setSobrenome_membro(String sobrenome_membro) {
        this.sobrenome_membro = sobrenome_membro;
    }

    public String getPai_membro() {
        return pai_membro;
    }

    public void setPai_membro(String pai_membro) {
        this.pai_membro = pai_membro;
    }

    public String getMae_membro() {
        return mae_membro;
    }

    public void setMae_membro(String mae_membro) {
        this.mae_membro = mae_membro;
    }

    public Date getNascimento_membro() {
        return nascimento_membro;
    }

    public void setNascimento_membro(Date nascimento_membro) {
        this.nascimento_membro = nascimento_membro;
    }

    public Date getBatismo_membro() {
        return batismo_membro;
    }

    public void setBatismo_membro(Date batismo_membro) {
        this.batismo_membro = batismo_membro;
    }

    public Object getNascimento_membro(String format) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
