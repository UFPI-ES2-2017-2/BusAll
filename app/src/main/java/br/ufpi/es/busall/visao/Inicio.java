package br.ufpi.es.busall.visao;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import br.ufpi.es.busall.R;

public class Inicio extends AppCompatActivity {

    private Toast toast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicial);
    }

    public void chamarCadastro(View v){
        toast = Toast.makeText(this, "Voce clicou no botao cadastrar", Toast.LENGTH_SHORT);
        toast.show();
        Intent intent = new Intent(this, CadastroUsuario.class);
        startActivity(intent);

    }

    public void chamarEntrar(View v){
        toast = Toast.makeText(this, "Voce clicou no botao entrar", Toast.LENGTH_SHORT);
        toast.show();
        Intent intent = new Intent(this, Login.class);
        startActivity(intent);
    }

}
