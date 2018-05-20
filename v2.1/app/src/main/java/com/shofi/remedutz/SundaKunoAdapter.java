package com.shofi.remedutz;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.ArrayList;

public class SundaKunoAdapter extends RecyclerView.Adapter<SundaKunoAdapter.SundaViewHolder> {

    ArrayList<SundaKuno> sundaKunos;

    public SundaKunoAdapter(ArrayList<SundaKuno> sundaKunos) {
        this.sundaKunos = sundaKunos;
    }



    @Override
    public SundaViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.sunda_layout, parent, false);
        // set the view's size, margins, paddings and layout parameters
        return new SundaViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final SundaViewHolder holder, final int position) {
        SundaKuno sundaKuno = sundaKunos.get(position);
        holder.gambar.setImageResource(sundaKuno.getImage());

    }

    @Override
    public int getItemCount() {
        return sundaKunos.size();
    }

    public class SundaViewHolder extends RecyclerView.ViewHolder {

        ImageView gambar;

        public SundaViewHolder(View view) {
            super(view);
            gambar = (ImageView) view.findViewById(R.id.gambar);

        }
    }
}
