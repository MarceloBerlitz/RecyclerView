package dev.berlitz.recyclerview.adapter;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import dev.berlitz.recyclerview.R;

public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    TextView titulo;
    TextView ano;
    TextView genero;
    RecyclerClickHandler recyclerClickHandler;

    public MyViewHolder(@NonNull View itemView, RecyclerClickHandler recyclerClickHandler) {
        super(itemView);

        this.recyclerClickHandler = recyclerClickHandler;
        titulo = itemView.findViewById(R.id.textTitulo);
        ano = itemView.findViewById(R.id.textAno);
        genero = itemView.findViewById(R.id.textGenero);


        itemView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        recyclerClickHandler.onClick(getAdapterPosition());
    }
}
