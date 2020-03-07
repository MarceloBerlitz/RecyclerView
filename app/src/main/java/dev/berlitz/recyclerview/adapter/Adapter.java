package dev.berlitz.recyclerview.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import dev.berlitz.recyclerview.R;
import dev.berlitz.recyclerview.model.Movie;

public class Adapter extends RecyclerView.Adapter<MyViewHolder> {

    private List<Movie> movies;

    public Adapter(List<Movie> movies) {
        this.movies = movies;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemLista = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.adapter_lista, parent, false);
        return new MyViewHolder(itemLista);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Movie movie = movies.get(position);
        holder.titulo.setText(movie.getTitulo());
        holder.genero.setText(movie.getGenero());
        holder.ano.setText(movie.getAno());
    }

    @Override
    public int getItemCount() {
        return movies.size();
    }
}
