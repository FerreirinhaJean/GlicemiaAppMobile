package com.app.glicemia.model.helper;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import androidx.annotation.Nullable;

public class Db extends SQLiteOpenHelper {

    public static int VERSAO = 1;
    public static String NOME_DB = "DB_GLICEMIA_APP";

    public static String TABELA_ALIMENTOS = "alimentos";
    public static String TABELA_GRUPO_ALIMENTO = "grupo_alimento";
    public static String TABELA_UNIDADE_MEDIDA = "unidade_medida";

    public Db(@Nullable Context context) {
        super(context, NOME_DB, null, VERSAO);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {


        String sql = "CREATE TABLE IF NOT EXISTS " + TABELA_GRUPO_ALIMENTO +
                " (id_grupo_alimento INTEGER PRIMARY KEY AUTOINCREMENT, descricao TEXT NOT NULL); ";

        sql += "CREATE TABLE IF NOT EXISTS " + TABELA_UNIDADE_MEDIDA +
                " (id_unidade_medida INTEGER PRIMARY KEY AUTOINCREMENT, descricao TEXT NOT NULL); ";

        sql += "CREATE TABLE IF NOT EXISTS " + TABELA_ALIMENTOS +
                " (id_alimento INTEGER PRIMARY KEY AUTOINCREMENT, descricao TEXT NOT NULL, qtd_unidade INTEGER NOT NULL, " +
                "peso REAL NOT NULL, kcal REAL NOT NULL, carboidratos REAL NOT NULL, id_grupo_alimento INTEGER, id_unidade_medida INTEGER, " +
                "FOREIGN KEY(id_grupo_alimento) REFERENCES grupo_alimento(id_grupo_alimento), " +
                "FOREIGN KEY(id_unidade_medida) REFERENCES unidade_medida(id_unidade_medida)); ";

        try {
            db.execSQL(sql);
        } catch (Exception e) {
            Log.i("INFO DB", "Erro ao criar a tabela " + e.getMessage());
        }
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
