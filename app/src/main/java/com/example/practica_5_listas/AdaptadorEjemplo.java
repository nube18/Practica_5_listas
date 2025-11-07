package com.example.practica_5_listas;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdaptadorEjemplo extends RecyclerView.Adapter<AdaptadorEjemplo.ViewHolder> {

    private Context context;
    private ArrayList<Films> lista;

    public AdaptadorEjemplo(Context context, ArrayList<Films> lista) {
        this.context = context;
        this.lista = lista;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_film, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Films film = lista.get(position);
        holder.textTitulo.setText(film.getTitulo());

        // Obtener id de drawable por nombre
        int idImagen = context.getResources().getIdentifier(film.getImagen(), "drawable", context.getPackageName());
        if (idImagen != 0) {
            holder.imageFilm.setImageResource(idImagen);
        } else {
            holder.imageFilm.setImageResource(R.drawable.ic_launcher_background);
        }
    }

    @Override
    public int getItemCount() {
        return lista.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageFilm;
        TextView textTitulo;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageFilm = itemView.findViewById(R.id.imageFilm);
            textTitulo = itemView.findViewById(R.id.textTitulo);
        }
    }
}
