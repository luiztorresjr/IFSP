package br.com.klon.bancodados.domain;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import java.util.List;

/**
 * Created by Luiz on 01/04/2016.
 */
public class DepartamentoDB extends SQLiteOpenHelper{

    private static final String TAG = "sql";
    private static final String NOME_BANCO = "empresa.sqlite";
    private static final int VERSAO_BANCO = 1;

    public DepartamentoDB(Context context){
        super(context, NOME_BANCO, null, VERSAO_BANCO);
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        Log.d(TAG, "Criando a Tabela dep");
        String sql="CREATE TABLE dep( _id integer primary key autoincrement, nome text, local text);";
        db.execSQL(sql);
        Log.d(TAG, "Tabela dep criada com sucesso.");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    public long save(Departamento departamento){
        long id = departamento.get_id();

        SQLiteDatabase database = getWritableDatabase();
        try {
            ContentValues values = new ContentValues();
            values.put("nome", departamento.getNome());
            values.put("local", departamento.getLocal());
            id = database.insert("dep", "", values);
            return id;
        }finally {
            database.close();
        }
    }

    public List<Departamento> listarDepartamento(){
        SQLiteDatabase database = getWritableDatabase();

        try {
            Cursor cursor = database.query("dep", null, null, null, null, null);
            return toList(c);
        }finally {
            database.close();
        }
    }
}
