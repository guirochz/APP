package com.example.app_busmap;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatEditText;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.snackbar.Snackbar;

public class Cadastro extends AppCompatActivity {

    private CadastroViewModel mViewModel;
    private AppCompatEditText edtNome;
    private AppCompatEditText edtEmail;
    private AppCompatEditText edtSenha;
    private AppCompatButton botaoCadastrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

        edtNome = findViewById(R.id.edit_nome);
        edtEmail = findViewById(R.id.edit_email);
        edtSenha = findViewById(R.id.edit_senha);
        botaoCadastrar = findViewById(R.id.btn_cadastrar);

        botaoCadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Chamar o método inserção
                Usuario usuario = new Usuario(
                        edtNome.getText().toString(),
                        edtEmail.getText().toString(),
                        edtSenha.getText().toString());

                int res = CadastroBanco.inserirCadastro(usuario, getBaseContext());
                if(res<=0){
                    Snackbar.make(botaoCadastrar, "Inserção não realizada!",
                            Snackbar.LENGTH_LONG).show();
                }else{
                    Snackbar.make(botaoCadastrar, "Colaborador Inserido com " +
                                    "Sucesso!",
                            Snackbar.LENGTH_LONG).show();

//                    Intent it = new Intent(Cadastro.this, Login.class);
//                    it.putExtra("nome", usuario.getNome());
//                    startActivity(it);
                }
            }
        });
    }


}