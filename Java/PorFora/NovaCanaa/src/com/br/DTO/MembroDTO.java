package com.br.DTO;

import java.util.Date;

public class MembroDTO {

    private int id_membro, idade_membro;
    private String cpf_membro, nome_membro, sobrenome_membro, pai_membro, mae_membro, nascimento_membro, batismo_membro, ano_nasc;  
    private Date ano_atual;

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

    public String getNascimento_membro() {
        return nascimento_membro;
    }

    public void setNascimento_membro(String nascimento_membro) {
        this.nascimento_membro = nascimento_membro;
    }

    public String getBatismo_membro() {
        return batismo_membro;
    }

    public void setBatismo_membro(String batismo_membro) {
        this.batismo_membro = batismo_membro;
    }

    public String getAno_nasc() {
        return ano_nasc;
    }

    public void setAno_nasc(String ano_nasc) {
        this.ano_nasc = ano_nasc;
    }

    public Date getAno_atual() {
        return ano_atual;
    }

    public void setAno_atual(Date ano_atual) {
        this.ano_atual = ano_atual;
    }

    public int getIdade_membro() {
        return idade_membro;
    }

    public void setIdade_membro(int idade_membro) {
        this.idade_membro = idade_membro;
    }

}
