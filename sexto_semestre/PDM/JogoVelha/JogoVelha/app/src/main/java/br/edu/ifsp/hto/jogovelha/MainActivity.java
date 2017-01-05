package br.edu.ifsp.hto.jogovelha;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TableLayout;
import android.widget.TableRow;

public class MainActivity extends AppCompatActivity {
    private final int nLinhas = 3;
    private Button [][] matrizBotao = new Button[nLinhas][3];
    private int jogada=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TableLayout layout = (TableLayout)findViewById(R.id.layoutPrincipal);

        for(int i=0; i<nLinhas; i++){
            LayoutInflater inflater = LayoutInflater.from(this);
            TableRow linha = (TableRow) inflater.inflate(R.layout.linha,layout,false);
            for (int j=0; j<linha.getChildCount();j++){
                Button button = (Button) linha.getChildAt(j);
                /*button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        marque(v);
                    }
                });*/
                matrizBotao[i][j] = button;
            }
            layout.addView(linha);
        }
    }
    public void marque(View v){
        Button button = (Button)v;
        if (jogada % 2 == 0){
            button.setText("O");
        } else{
            button.setText("X");
        }
        jogada++;
    }

    private boolean verificarLinha(){
        for (int i=0; i<nLinhas; i++){
            for (int j=0; j<3; j++){

            }
        }
    }
}
