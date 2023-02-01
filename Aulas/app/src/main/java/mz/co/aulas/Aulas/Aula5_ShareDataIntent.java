package mz.co.aulas.Aulas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import mz.co.aulas.R;

import mz.co.aulas.databinding.ActivityAula5ShareDataIntentBinding;

public class Aula5_ShareDataIntent extends AppCompatActivity {

    private ActivityAula5ShareDataIntentBinding aula5ShareDataIntentBinding;

    private static final  int REQUEST_CODE = 5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        aula5ShareDataIntentBinding = ActivityAula5ShareDataIntentBinding.inflate(getLayoutInflater());

        View view = aula5ShareDataIntentBinding.getRoot();

        setContentView(view);
    }

    public void setNameAndAge(View view){

        if(aula5ShareDataIntentBinding.nameED.getText().toString().isEmpty())
            Toast.makeText(this, "Preencha todos os campos", Toast.LENGTH_SHORT).show();
        else {
            aula5ShareDataIntentBinding.txtNomeRecebido.setText(getString(R.string.bv) + aula5ShareDataIntentBinding.nameED.getText().toString());
        }
    }

    public void secondActivity(View view){
        Intent intent = new Intent(this, Aula5_IntentTest.class);

        intent.putExtra("nome", aula5ShareDataIntentBinding.nameED.getText().toString());
        intent.putExtra("idade",  "21");

        /// startActivity(intent);

        startActivityForResult(intent, REQUEST_CODE);
    }


    protected void onActivityResult(int requestCode, int resultCode, Intent intent){
        super.onActivityResult(requestCode, resultCode, intent);
        if(requestCode == REQUEST_CODE && resultCode == RESULT_OK){
            if(intent.hasExtra("resultado")){
                aula5ShareDataIntentBinding.txtNomeRecebido.setText(intent.getStringExtra("resultado"));
            }
        }
    }

}