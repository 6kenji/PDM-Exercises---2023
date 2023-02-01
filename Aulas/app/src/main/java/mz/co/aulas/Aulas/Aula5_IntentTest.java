package mz.co.aulas.Aulas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import mz.co.aulas.databinding.ActivityAula5IntentTestBinding;


public class Aula5_IntentTest extends AppCompatActivity {

    private ActivityAula5IntentTestBinding responseBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        responseBinding = ActivityAula5IntentTestBinding.inflate(getLayoutInflater());
        View view = responseBinding.getRoot();
        setContentView(view);

        /// Intent extras1 = getIntent();

        Bundle extras = getIntent().getExtras();

        if(extras != null){
            responseBinding.idadeTv.setText(extras.getString("idade"));
            responseBinding.nomeTv.setText(extras.getString("nome"));

        }

    }

    @Override
    public void finish() {
        Intent data = new Intent();
        data.putExtra("resultado", "Eu sou mau a Android! xD");
        setResult(-1, data);
        super.finish();
    }


    public void openWeb(View view){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/khalidy6"));
        startActivity(intent);
    }

}