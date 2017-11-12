package br.ufpi.es.busall.controle;


import br.ufpi.es.busall.dados.Usuario;
import br.ufpi.es.busall.dados.repositorios.RepositorioUsuarios;

public class ControladorUsuarios {

    private RepositorioUsuarios usuarios;

    public ControladorUsuarios(){
        usuarios = new RepositorioUsuarios();
    }

    public Usuario carregarDadosUsuario(String email){
        Usuario usuario;

        //Recupera informacoes do repositorio ou servico de base de usuarios
        usuario = usuarios.buscarPorEmail(email);

        if (usuario != null){
            return usuario;
        }else {
            return null;
        }
    }

    public void excluir(String email){
        Usuario u = usuarios.buscarPorEmail(email);
        usuarios.remover(u);
    }

    public void cadastrar(int id, String nome, String login, String email, String senha){
        Usuario u = new Usuario(id,nome,login,email,senha);
        usuarios.inserir(u);

    }
    //apenas para fins de teste :]
    public void popular(){
        usuarios.popularUsuarios();
    }




}

