package br.ufpi.es.busall.dados.repositorios;

import java.util.ArrayList;
import java.util.List;

import br.ufpi.es.busall.dados.Usuario;


public class RepositorioUsuarios implements IRepositorioUsuarios {
    List<Usuario> listaUsuarios = new ArrayList<Usuario>();
    @Override
    public void inserir(Usuario usuario) {
        // TODO Auto-generated method stub
        listaUsuarios.add(usuario);
    }

    @Override
    public void alterar(Usuario original, Usuario novo) {
        // TODO Auto-generated method stub
        for(Usuario u : listaUsuarios) {
            if(u.getEmail().equals(original.getEmail())) {
                if(novo.getEmail().isEmpty() == false)
                    u.setEmail(novo.getEmail());
                if(novo.getLogin().isEmpty() == false)
                    u.setLogin(novo.getLogin());
                if(novo.getSenha().isEmpty() == false)
                    u.setSenha(novo.getSenha());
                return;
            }
        }
    }

    @Override
    public void remover(Usuario usuario) {
        // TODO Auto-generated method stub
        for(Usuario u : listaUsuarios) {
            if(u.getLogin().equals(usuario.getLogin())) {
                listaUsuarios.remove(u);
                return;
            }
        }
    }

    @Override
    public Usuario buscarPorEmail(String email) {
        // TODO Auto-generated method stub
        for(Usuario u : listaUsuarios) {
            if(u.getEmail().equals(email)) {
                return u;
            }
        }
        return null;
    }

    @Override
    public Usuario buscarPorLogin(String login) {
        // TODO Auto-generated method stub
        for(Usuario u : listaUsuarios) {
            if(u.getLogin().equals(login)) {
                return u;
            }
        }
        return null;
    }

    @Override
    public Usuario buscar(String email, String senha) {
        // TODO Auto-generated method stub
        for(Usuario u : listaUsuarios) {
            if(u.getEmail().equals(email) && u.getSenha().equals(senha)) {
                return u;
            }
        }
        return null;
    }

    @Override
    public List<Usuario> listar() {
        // TODO Auto-generated method stub
        return this.listaUsuarios;
    }

    public void popularUsuarios() {
        Usuario u1 = new Usuario(1, "Leonard Euler", "euler", "euler@math.com", "euler");
        Usuario u2 = new Usuario(2, "Isaac Newton", "newton", "newton@math.com", "newton");
        Usuario u3 = new Usuario(3, "Carl Friedrich Gauss", "gauss", "gauss@math.com", "gauss");
        Usuario u4 = new Usuario(4, "Augustin-Louis Cauchy", "cauchy", "cauchy@math.com", "cauchy");
        Usuario u5 = new Usuario(5, "Gottfried Leibniz", "leibniz", "leibniz@math.com", "leibniz");

        this.listaUsuarios.add(u1);
        this.listaUsuarios.add(u2);
        this.listaUsuarios.add(u3);
        this.listaUsuarios.add(u4);
        this.listaUsuarios.add(u5);
    }
}
