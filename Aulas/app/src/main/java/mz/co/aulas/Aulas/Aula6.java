package mz.co.aulas.Aulas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import mz.co.aulas.R;

import mz.co.aulas.databinding.ActivityAula6Binding;

public class Aula6 extends AppCompatActivity {

    private ActivityAula6Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityAula6Binding.inflate(getLayoutInflater());

        View view = binding.getRoot();

        setContentView(view);

        binding.btnClick.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.resultadoTv.setText("Eu sou mau! CLICKK");
            }
        });

        binding.btnClick.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                binding.resultadoTv.setText("Eu sou mau!  LONGGGG");
                return false;
            }
        });

    }

}