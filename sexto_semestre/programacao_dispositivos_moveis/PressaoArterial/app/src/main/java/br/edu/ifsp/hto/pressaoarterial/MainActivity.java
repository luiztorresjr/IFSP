package br.edu.ifsp.hto.pressaoarterial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickbtLimpar(View view){
        EditText etMinima = (EditText) findViewById(R.id.etMinima);
        EditText etMaxima = (EditText) findViewById(R.id.etMaxima);
        TextView tvNascional = (TextView) findViewById(R.id.tvNascional);
        TextView tvInternascional = (TextView) findViewById(R.id.tvInternascional);
        etMinima.setText("");
        etMaxima.setText("");
        tvNascional.setText(getText(R.string.tvResultadoNascional));
        tvInternascional.setText(getText(R.string.tvResultadoInternacional));
    }
    public void onClickbtMedir(View view){

        EditText etMinima = (EditText) findViewById(R.id.etMinima);
        EditText etMaxima = (EditText) findViewById(R.id.etMaxima);


        TextView tvNascional = (TextView) findViewById(R.id.tvNascional);
        TextView tvInternascional = (TextView) findViewById(R.id.tvInternascional);

        try {
            String sMinima = etMinima.getText().toString();
            String sMaxima = etMaxima.getText().toString();

            int minima = Integer.parseInt(sMinima);
            int maxima = Integer.parseInt(sMaxima);

            if (minima < 80 && maxima < 120) {
                tvNascional.setText(getText(R.string.tvResultadoNascional) + "\nÓtima");
                tvInternascional.setText(getText(R.string.tvResultadoInternacional) + "\nNormal");
            } else if ((minima >= 80 && minima < 85) && (maxima >= 120 && maxima < 130)) {
                tvNascional.setText(getText(R.string.tvResultadoNascional) + "\nNormal");
                tvInternascional.setText(getText(R.string.tvResultadoInternacional) + "\nPré-hipertensão");
            } else if ((minima >= 85 && minima < 90) || (maxima >= 130 && maxima < 140)) {
                tvNascional.setText(getText(R.string.tvResultadoNascional) + "\nLimítrofe");
                tvInternascional.setText(getText(R.string.tvResultadoInternacional) + "\nPré-hipertensão");
            } else if ((minima >= 90 && minima < 100) || (maxima >= 140 && maxima < 160)) {
                tvNascional.setText(getText(R.string.tvResultadoNascional) + "\nEstágio 1");
                tvInternascional.setText(getText(R.string.tvResultadoInternacional) + "\nHipertensão estágio 1");
            } else if ((minima >= 100 && minima < 110) || (maxima >= 160 && maxima < 180)) {
                tvNascional.setText(getText(R.string.tvResultadoNascional) + "\nEstágio 2");
                tvInternascional.setText(getText(R.string.tvResultadoInternacional) + "\nHipertensão estágio 2");
            } else if (minima >= 110 || maxima >= 180) {
                tvNascional.setText(getText(R.string.tvResultadoNascional) + "\nEstágio 3");
                tvInternascional.setText(getText(R.string.tvResultadoInternacional) + "\nHipertensão estágio 2");
            } else {
                tvNascional.setText(getText(R.string.tvResultadoNascional) + "\nHipertensão sistólica isolada");
                tvInternascional.setText(getText(R.string.tvResultadoInternacional) + "\nHipertensão estágio 2");
            }
        }catch (NumberFormatException e){
            tvNascional.setText(getText(R.string.tvResultadoNascional) + "\nDigite um valor válido");
            tvInternascional.setText(getText(R.string.tvResultadoInternacional) + "\nDigite um valor válido");
        }
    }
}
