package br.ufpi.es.busall.dados.repositorios;


import java.util.List;

import br.ufpi.es.busall.dados.Usuario;

public interface IRepositorioUsuarios {
    public Usuario buscar(String email, String senha);
    public void inserir(Usuario usuario);
    public void alterar(Usuario original, Usuario novo);
    public void remover(Usuario usuario);
    public List<Usuario> listar();
    public Usuario buscarPorEmail(String email);
    public Usuario buscarPorLogin(String login);
}
