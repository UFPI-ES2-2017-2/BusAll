package br.ufpi.es.busall.dados;


public class Usuario {
    private int id;
    private String nome;
    private String login;
    private String email;
    private String senha;

    public Usuario(int _id, String _nome, String _login, String _email, String _senha ) {
        this.id = _id;
        this.nome = _nome;
        this.login = _login;
        this.email = _email;
        this.senha = _senha;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
