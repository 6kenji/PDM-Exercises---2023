package mz.co.aulas.Aulas;

import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import mz.co.aulas.Objects.RecyclerAdapter;
import mz.co.aulas.databinding.ActivityAula7RecyclerViewBinding;

import mz.co.aulas.R;
import mz.co.aulas.databinding.ActivityAula7RecyclerViewBinding;

public class Aula7_RecyclerView extends AppCompatActivity {

    private AppBarConfiguration appBarConfiguration;
    private ActivityAula7RecyclerViewBinding binding;

    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;
    private RecyclerView.Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityAula7RecyclerViewBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setSupportActionBar(binding.toolbar);

        layoutManager = new LinearLayoutManager(this);

        binding.aula7.recyclerView.setLayoutManager(layoutManager);

        adapter = new RecyclerAdapter();

        binding.aula7.recyclerView.setAdapter(adapter);
    }

}