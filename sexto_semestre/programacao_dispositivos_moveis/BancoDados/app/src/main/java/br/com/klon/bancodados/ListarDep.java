package br.com.klon.bancodados;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import br.com.klon.bancodados.domain.Departamento;

public class ListarDep extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listar_dep);

        mListView listView = (ListView) findViewById(R.id.listView);
        DepartamentoAdapter departamentoAdapter = new DepartamentoAdapter();
    }


}
