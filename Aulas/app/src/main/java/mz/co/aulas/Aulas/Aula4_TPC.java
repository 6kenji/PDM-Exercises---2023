package mz.co.aulas.Aulas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import mz.co.aulas.R;

public class Aula4_TPC extends AppCompatActivity {

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aula4_tpc);

        Toast.makeText(this, "Activity criada! ", Toast.LENGTH_LONG).show();

        button = findViewById(R.id.btnLifeCycle);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Khalidy is the GOAT!", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    protected void onStart(){
        super.onStart();
        Toast.makeText(this, "Activity no start, tudo comeca aqui! ", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onRestart(){
        super.onRestart();
        Toast.makeText(this, "Activity no restart! ", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onResume(){
        super.onResume();
        Toast.makeText(this, "Activity resumida! ", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onPause(){
        super.onPause();
        Toast.makeText(this, "Activity pausada! ", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onStop(){
        super.onStop();
        Toast.makeText(this, "Activity parada! ", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        /// Toast.makeText(this, "Activity destruida, que pena! ", Toast.LENGTH_LONG).show();
        System.out.println( "Activity destruida, que pena! ");
    }

}