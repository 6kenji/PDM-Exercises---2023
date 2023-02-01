package mz.co.aulas.Aulas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import mz.co.aulas.R;

public class Aula1 extends AppCompatActivity {

    Button btnConverter;
    EditText valor_converter;
    TextView resultado_convertido;

    RadioButton rbRand, rbYen, rbDollar, rbEuro, rbLibra, rbReal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aula1);

        resultado_convertido = findViewById(R.id.txtValores);
        valor_converter = findViewById(R.id.edtMeterValor);

        rbRand = findViewById(R.id.rbRand);
        rbYen = findViewById(R.id.rbYen);
        rbDollar = findViewById(R.id.rbDollar);
        rbEuro = findViewById(R.id.rbEuro);
        rbLibra = findViewById(R.id.rbLibra);
        rbReal = findViewById(R.id.rbReal);


        btnConverter = findViewById(R.id.btnCambio);

        btnConverter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                converter(v);
            }
        });
    }


    public void converter(View view){

        float valor, resultado_final = 0;
        valor = Float.parseFloat(valor_converter.getText().toString());


        if(!valor_converter.getText().toString().isEmpty()){
            if(rbYen.isSelected())
                resultado_final = valor * 2.01F;
            else if(rbRand.isSelected())
                resultado_final = valor * 3.7F;
            else if(rbEuro.isSelected())
                resultado_final = valor * 69.14F;
            else if(rbLibra.isSelected())
                resultado_final = valor * 78.99F;
            else if(rbDollar.isSelected())
                resultado_final = valor * 63.83F;
            else if(rbReal.isSelected())
                resultado_final = valor * 12.33F;

        } else {
            Toast.makeText(this, "Insira um valor!", Toast.LENGTH_SHORT).show();
        }

        resultado_convertido.setText(String.valueOf(resultado_final));
    }
}