package br.com.klon.bancodados;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import br.com.klon.bancodados.domain.Departamento;
import br.com.klon.bancodados.domain.DepartamentoService;

public class CadastrarDep extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastrar_dep);
    }

    public void OnclickbtGravar(View view) {
        Departamento departamento = new Departamento();
        String nome = ((EditText) findViewById(R.id.etNome)).getText().toString();
        String local = ((EditText) findViewById(R.id.etLocal)).getText().toString();

        departamento.setNome(nome);
        departamento.setLocal(local);

        DepartamentoService.salvarDepartamento(this, departamento);
    }
}
