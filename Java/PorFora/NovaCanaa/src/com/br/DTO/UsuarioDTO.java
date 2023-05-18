
package com.br.DTO;

public class UsuarioDTO {
    
    private int id_login, senha_login;
    private String usuario_login;

    public int getId_login() {
        return id_login;
    }

    public void setId_login(int id_login) {
        this.id_login = id_login;
    }

    public int getSenha_login() {
        return senha_login;
    }

    public void setSenha_login(int senha_login) {
        this.senha_login = senha_login;
    }

    public String getUsuario_login() {
        return usuario_login;
    }

    public void setUsuario_login(String usuario_login) {
        this.usuario_login = usuario_login;
    }
               
}
