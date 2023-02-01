package mz.co.aulas.Objects;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.snackbar.Snackbar;

import mz.co.aulas.R;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {

    private final String [] titles = {
            "Primeiro Titulo",
            "Segundo Titulo",
            "Terceiro Titulo",
            "Quarto Titulo",
            "Quinto Titulo",
            "Sexto Titulo",
    };

    private final String [] description = {
            "1 descricao",
            "2 descricao",
            "3 descricao",
            "4 descricao",
            "5 descricao",
            "6 descricao",
    };

    private final int [] images = {
            R.drawable.android1,
            R.drawable.android2,
            R.drawable.android3,
            R.drawable.android4,
            R.drawable.android5,
            R.drawable.android6,
    };

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_layout, parent, false);

        return new ViewHolder(v);

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.itemTitle.setText(titles[position]);
        holder.itemDetails.setText(description[position]);
        holder.itemImage.setImageResource(images[position]);

    }

    @Override
    public int getItemCount() {
        return titles.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        ImageView itemImage;
        TextView itemTitle;
        TextView itemDetails;

        public ViewHolder(@Nullable View itemView){
            super(itemView);

            itemImage = itemView.findViewById(R.id.itemImage);
            itemTitle = itemView.findViewById(R.id.itemTitle);
            itemDetails = itemView.findViewById(R.id.itemDetail);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int posicao = getAdapterPosition();

                    Snackbar.make(v, "Eu sou mau hehehehhe, o elemento clicado foi " +(posicao + 1), Snackbar.LENGTH_LONG).setAction("Action", null).show();
                }
            });
        }

    }
}



