package dev.berlitz.recyclerview.adapter;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import dev.berlitz.recyclerview.R;

public class MyViewHolder extends RecyclerView.ViewHolder {

    TextView titulo;
    TextView ano;
    TextView genero;

    public MyViewHolder(@NonNull View itemView) {
        super(itemView);

        titulo = itemView.findViewById(R.id.textTitulo);
        ano = itemView.findViewById(R.id.textAno);
        genero = itemView.findViewById(R.id.textGenero);
    }
}
