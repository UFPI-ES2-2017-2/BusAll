package br.ufpi.es.busall.visao;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import br.ufpi.es.busall.R;

public class CadastroUsuario extends AppCompatActivity {

    private EditText editTextNome, editTextEmail, editTextSenha, editTextConfirmacaoSenha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastrar);

        editTextNome = findViewById(R.id.editText);
        editTextEmail = findViewById(R.id.editText2);
        editTextSenha = findViewById(R.id.editText3);
        editTextConfirmacaoSenha = findViewById(R.id.editText4);
    }


    public void cadastar(View v){
        Toast toast = Toast.makeText(this, "Voce clicou no botao\nnome: "
                                        + editTextNome.getText().toString()
                                        + "\nsenha: " + editTextSenha.getText().toString()
                                        , Toast.LENGTH_SHORT);
        toast.show();
    }

}
