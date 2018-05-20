package com.shofi.remedutz;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.ArrayList;

public class SundaBakuAdapter extends RecyclerView.Adapter<SundaBakuAdapter.SundaViewHolder> {

    ArrayList<SundaBaku> sundaBakus;

    public SundaBakuAdapter(ArrayList<SundaBaku> sundaBakus) {
        this.sundaBakus = sundaBakus;
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
        SundaBaku sundaBaku = sundaBakus.get(position);
        holder.gambar.setImageResource(sundaBaku.getImage());

    }

    @Override
    public int getItemCount() {
        return sundaBakus.size();
    }

    public class SundaViewHolder extends RecyclerView.ViewHolder {

        ImageView gambar;

        public SundaViewHolder(View view) {
            super(view);
            gambar = (ImageView) view.findViewById(R.id.gambar);

        }
    }
}
