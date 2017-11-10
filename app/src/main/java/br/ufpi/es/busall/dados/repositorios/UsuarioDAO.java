package br.ufpi.es.busall.dados.repositorios;


import java.util.List;

import br.ufpi.es.busall.dados.Usuario;

public class UsuarioDAO {
    IRepositorioUsuarios repositorio;
    public UsuarioDAO(IRepositorioUsuarios tipo){
        repositorio = tipo;
    }
    public Usuario buscar(String email, String senha) {
        return repositorio.buscar(email, senha);
    }
    public void inserir(Usuario usuario) {
        repositorio.inserir(usuario);
    }
    public void alterar(Usuario original, Usuario novo) {
        repositorio.alterar(original, novo);
    }
    public void remover(Usuario usuario) {
        repositorio.remover(usuario);
    }
    public List<Usuario> listar() {
        return repositorio.listar();
    }
    public Usuario buscarPorEmail(String email) {
        return repositorio.buscarPorEmail(email);
    }
    public Usuario buscarPorLogin(String login) {
        return repositorio.buscarPorLogin(login);
    }
}
