package mz.co.aulas.Aulas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import mz.co.aulas.R;


public class Aula3 extends AppCompatActivity {

    Button btnSoma, btnSubtracao, btnDivisao, btnMultiplicacao, btnRaiz;
    EditText edtX, edtY;
    TextView txtValor;

    Float valor;

    float x, y;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aula3);

        txtValor = findViewById(R.id.resultado);

        txtValor.setText("0");

        edtX = findViewById(R.id.valorx);
        edtY = findViewById(R.id.valory);

        btnSoma = findViewById(R.id.btnSoma);
        btnSubtracao = findViewById(R.id.btnSubtracao);
        btnDivisao = findViewById(R.id.btnDivisao);
        btnMultiplicacao = findViewById(R.id.btnMultiplicacao);
        btnRaiz = findViewById(R.id.btnRaiz);

        try{
            btnSoma.setOnClickListener(v -> {

                if(verificaCampos() ){
                    x = Float.parseFloat(edtX.getText().toString());

                    y = Float.parseFloat(edtY.getText().toString());

                    valor = x + y;

                    txtValor.setText(valor.toString());
                }

            });

            btnSubtracao.setOnClickListener(v -> {

                if(verificaCampos() ){
                    x = Float.parseFloat(edtX.getText().toString());

                    y = Float.parseFloat(edtY.getText().toString());

                    valor = x - y;

                    txtValor.setText(valor.toString());
                }

            });

            btnDivisao.setOnClickListener(v -> {

                if(verificaCampos() ){
                    x = Float.parseFloat(edtX.getText().toString());

                    y = Float.parseFloat(edtY.getText().toString());

                    valor = x / y;

                    txtValor.setText(valor.toString());
                }

            });

            btnMultiplicacao.setOnClickListener(v -> {

                if(verificaCampos() ){
                    x = Float.parseFloat(edtX.getText().toString());

                    y = Float.parseFloat(edtY.getText().toString());

                    valor = x * y;

                    txtValor.setText(valor.toString());
                }

            });

            btnRaiz.setOnClickListener(v -> {

                if(verificaCampos() ){
                    double valor1 = Math.sqrt(x);
                    double valor2 = Math.sqrt(y);

                    txtValor.setText("Raiz de " + x + " = "+String.valueOf(valor1) + ", e de "+ y + " = " + String.valueOf(valor2));
                }

                });
        }catch (NumberFormatException ex){
            Toast.makeText(getApplicationContext(), ex.getMessage(), Toast.LENGTH_SHORT).show();
        }

    }

    private boolean verificaCampos(){
        if(edtX.getText().toString().isEmpty() || edtY.getText().toString().isEmpty()){
            Toast.makeText(this, "Por favor, preencher todos os campos!", Toast.LENGTH_SHORT).show();
            return false;
        } else {
            return true;
        }
    }
}