package br.com.klon.bancodados;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    final Context context = this;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void OnclickBtCadastrarDep(View view) {
        Intent intent = new Intent(context, CadastrarDep.class);
        startActivity(intent);
    }

    public void OnclickBtListarDep(View view) {
        Intent intent = new Intent(context, ListarDep.class);
        startActivity(intent);
    }
}
