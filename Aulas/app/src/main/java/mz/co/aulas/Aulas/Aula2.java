package mz.co.aulas.Aulas;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import mz.co.aulas.R;

public class Aula2 extends AppCompatActivity {

    EditText txtIdade;
    EditText txtMassa;
    EditText txtAltura;

    Button btnCalcular;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aula2);

        txtIdade = findViewById(R.id.txtIdade);
        txtMassa = findViewById(R.id.txtPeso);
        txtAltura = findViewById(R.id.txtAltura);

        btnCalcular = findViewById(R.id.btnCalcularIMC);

        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imcCalc(v);
            }
        });
    }

    public void imcCalc(View view){
        String idade = txtIdade.getText().toString();
        String massa = txtMassa.getText().toString();
        String altura = txtAltura.getText().toString();

        if (idade.isEmpty() || massa.isEmpty() || altura.isEmpty()) {

            Toast.makeText(getApplicationContext(), "Por favor, preencha todos campos! ", Toast.LENGTH_SHORT).show();

        } else {

            int valorIdade = Integer.parseInt(idade);
            float valorMassa = Float.parseFloat(massa);
            float valorAltura = Float.parseFloat(altura);
            valorAltura = valorAltura / 100;

            //Proceso de calcular o IMC
            float imc = valorMassa / (float)Math.pow(valorAltura,2);

            //Converter o resultado
            String imc_Texto = String.format("%.1f", imc);

            if (imc < 18.5f)
                Toast.makeText(getApplicationContext(),  "O seu IMC e de: " + imc_Texto+", seu estado de saude e: Desnutricao", Toast.LENGTH_LONG).show(); // Desnutricao
            else if (imc < 25)
                Toast.makeText(getApplicationContext(),  "O seu IMC e de: " + imc_Texto+" seu estado de saude e: Normal", Toast.LENGTH_LONG).show(); // Normal
            else if (imc < 30)
                Toast.makeText(getApplicationContext(),  "O seu IMC e de: " + imc_Texto+" seu estado de saude e: Sobrepeso", Toast.LENGTH_LONG).show(); // Sobrepeso
            else if (imc < 35)
                Toast.makeText(getApplicationContext(),  "O seu IMC e de: " + imc_Texto+" seu estado de saude e: Obesidade grau 1", Toast.LENGTH_LONG).show(); // Obesidade grau 1
            else if (imc < 40)
                Toast.makeText(getApplicationContext(),  "O seu IMC e de: " + imc_Texto+" seu estado de saude e: Obesidade grau 2", Toast.LENGTH_LONG).show(); // Obesidade grau 2
            else
                Toast.makeText(getApplicationContext(),  "O seu IMC e de: " + imc_Texto+" seu estado de saude e: Obesidade grau 2", Toast.LENGTH_LONG).show(); // Obesidade grau 3

        }
    }
}