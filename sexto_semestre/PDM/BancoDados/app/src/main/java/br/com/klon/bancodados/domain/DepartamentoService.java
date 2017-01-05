package br.com.klon.bancodados.domain;

import android.content.Context;
import android.util.Log;

/**
 * Created by Luiz on 01/04/2016.
 */
public class DepartamentoService {
    private static final String TAG = "service";

    public static void salvarDepartamento(Context context, Departamento departamento){
        DepartamentoDB db = new DepartamentoDB(context);
        try {
            Log.d(TAG, "Salvando departamento " + departamento.getNome());
            db.save(departamento);
        }finally {
            db.close();
        }
    }
}
