package dev.berlitz.recyclerview.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

import dev.berlitz.recyclerview.R;
import dev.berlitz.recyclerview.adapter.Adapter;
import dev.berlitz.recyclerview.model.Movie;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;

    private List<Movie> lista = new ArrayList<Movie>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        this.createMovies();

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayout.VERTICAL));
        recyclerView.setAdapter(new Adapter(lista));
    }

    private void createMovies() {
        lista.add(new Movie("O Poderoso Chefão", "Gênero", "1972"));
        lista.add(new Movie("O Mágico de Oz", "Gênero", "1939"));
        lista.add(new Movie("Cidadão Kane", "Gênero", "1941"));
        lista.add(new Movie("Um Sonho de Liberdade", "Gênero", "1994"));
        lista.add(new Movie("Pulp Fiction – Tempo de Violência", "Gênero", "1994"));
        lista.add(new Movie("Casablanca", "Gênero", "1942"));
        lista.add(new Movie("O Poderoso Chefão 2", "Gênero", "1974"));
        lista.add(new Movie("E.T. – O Extraterrestre", "Gênero", "1982"));
        lista.add(new Movie("Uma Odisseia no Espaço", "Gênero", "1968"));
        lista.add(new Movie("A Lista de Schindler", "Gênero", "1993"));
        lista.add(new Movie("Guerra nas Estrelas", "Gênero", "1977"));
        lista.add(new Movie("De Volta para o Futuro", "Gênero", "1985"));
        lista.add(new Movie("Os Caçadores da Arca Perdida", "Gênero", "1981"));
        lista.add(new Movie("Forrest Gump – O Contador de Histórias", "Gênero", "1994"));
        lista.add(new Movie("E o Vento Levou...", "Gênero", "1939"));
        lista.add(new Movie("O Sol é para Todos", "Gênero", "1962"));
        lista.add(new Movie("Apocalypse Now", "Gênero", "1979"));
        lista.add(new Movie("Noivo Neurótico, Noiva Nervosa", "Gênero", "1977"));
        lista.add(new Movie("Os Bons Companheiros", "Gênero", "1990"));
        lista.add(new Movie("A Felicidade não se Compra", "Gênero", "1946"));
    }

}
