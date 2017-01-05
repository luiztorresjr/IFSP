package br.edu.ifsp.hto.calculaimc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.text.NumberFormat;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	public void onClickbtLimpar(View v){
		EditText etPeso = (EditText) findViewById(R.id.etPeso);
		EditText etAltura = (EditText) findViewById(R.id.etAltura);
		TextView tvResultado = (TextView) findViewById(R.id.tvResultado);
		etPeso.setText("");
		etAltura.setText("");
		tvResultado.setText(getString(R.string.resultado));
	}

	public void onClickbtCalcular(View v){
		TextView tvResultado = (TextView) findViewById(R.id.tvResultado);

		EditText etPeso = (EditText) findViewById(R.id.etPeso);
		EditText etAltura = (EditText) findViewById(R.id.etAltura);

		try {
			String sAltura = etAltura.getText().toString();
			String sPeso = etPeso.getText().toString();

			sAltura = sAltura.replace(",", ".");
			sPeso = sPeso.replace(",", ".");

			float peso = Float.parseFloat(sPeso);
			float altura = Float.parseFloat(sAltura);
			float imc = peso / (altura * altura);

			String sIMC = Float.toString(imc);

			sIMC = sIMC.replace(".", ",");

			if (imc < 17)
				tvResultado.setText(getString(R.string.resultado) + " Muito abaixo do peso IMC=" + sIMC);
			else if (imc >= 17 && imc < 18.5)
				tvResultado.setText(getString(R.string.resultado) + " Abaixo do peso IMC=" + sIMC);
			else if (imc >= 18.5 && imc < 25)
				tvResultado.setText(getString(R.string.resultado) + " Peso normal IMC=" + sIMC);
			else if (imc >= 25 && imc < 30)
				tvResultado.setText(getString(R.string.resultado) + " Acima do peso IMC=" + sIMC);
			else if (imc >= 30 && imc < 35)
				tvResultado.setText(getString(R.string.resultado) + " Obesidade I IMC=" + sIMC);
			else if (imc >= 35 && imc < 40)
				tvResultado.setText(getString(R.string.resultado) + " Obesidade II (severa) IMC=" + sIMC);
			else
				tvResultado.setText(getString(R.string.resultado) + " Obesidade III (mórbida) IMC=" + sIMC);
		}catch (NumberFormatException e){
			tvResultado.setText(getString(R.string.resultado) + "Digite um valor válido");
		}
		}
}

