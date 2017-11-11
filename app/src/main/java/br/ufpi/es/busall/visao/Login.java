package br.ufpi.es.busall.visao;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import br.ufpi.es.busall.R;

public class Login extends AppCompatActivity{

    private EditText editTextEmail, editTextSenha;
    private Toast toast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        editTextEmail = findViewById(R.id.editText5);
        editTextSenha = findViewById(R.id.editText6);
    }

    public void entrar(View v){
        toast = Toast.makeText(this, "Voce clicou no botao entrar", Toast.LENGTH_SHORT);
        toast.show();
    }
}
