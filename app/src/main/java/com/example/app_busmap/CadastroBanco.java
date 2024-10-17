package com.example.app_busmap;

import android.content.Context;

import java.sql.PreparedStatement;

public class CadastroBanco {

    public static int inserirCadastro(Usuario usuario, Context ctx){
        int resposta = 0;

        try{
            PreparedStatement pst = conexaoBanco.conectar(ctx).prepareStatement(
                    "Insert Into Usuario (nome, email, senha)"+
                            "values (?,?,?)"
            );
            pst.setString(1, usuario.getNome());
            pst.setString(2, usuario.getEmail());
            pst.setString(3, usuario.getSenha());

            resposta = pst.executeUpdate();

        }catch (Exception e){
            e.getMessage();
        }
        return resposta;
    }
}
