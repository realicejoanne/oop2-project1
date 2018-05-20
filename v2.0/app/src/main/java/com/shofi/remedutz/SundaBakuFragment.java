package com.shofi.remedutz;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class SundaBakuFragment extends Fragment {

    ArrayList<SundaBaku> sundaBaku;

    public SundaBakuFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_sunda_baku, container, false);

        sundaBaku = new ArrayList<SundaBaku>();
        sundaBaku.add(new SundaBaku("", R.drawable.a1 ));
        sundaBaku.add(new SundaBaku("", R.drawable.e1 ));
        sundaBaku.add(new SundaBaku("", R.drawable.ee1 ));
        sundaBaku.add(new SundaBaku("", R.drawable.eu1 ));
        sundaBaku.add(new SundaBaku("", R.drawable.i1 ));
        sundaBaku.add(new SundaBaku("", R.drawable.o1 ));
        sundaBaku.add(new SundaBaku("", R.drawable.u1 ));
        sundaBaku.add(new SundaBaku("", R.drawable.foto_soekarno1));
        sundaBaku.add(new SundaBaku("", R.drawable.foto_soekarno2 ));
        sundaBaku.add(new SundaBaku("", R.drawable.foto_soekarno3 ));
        sundaBaku.add(new SundaBaku("", R.drawable.foto_soekarno4 ));
        sundaBaku.add(new SundaBaku("", R.drawable.foto_soekarno5 ));
        sundaBaku.add(new SundaBaku("", R.drawable.foto_soekarno6 ));
        sundaBaku.add(new SundaBaku("", R.drawable.foto_soekarno7 ));
        sundaBaku.add(new SundaBaku("", R.drawable.foto_soekarno8 ));
        sundaBaku.add(new SundaBaku("", R.drawable.foto_soekarno9 ));
        sundaBaku.add(new SundaBaku("", R.drawable.foto_soekarno10 ));
        sundaBaku.add(new SundaBaku("", R.drawable.foto_soekarno11 ));
        sundaBaku.add(new SundaBaku("", R.drawable.foto_soekarno12 ));
        sundaBaku.add(new SundaBaku("", R.drawable.foto_soekarno13 ));
        sundaBaku.add(new SundaBaku("", R.drawable.foto_soekarno14 ));
        sundaBaku.add(new SundaBaku("", R.drawable.foto_soekarno15 ));
        sundaBaku.add(new SundaBaku("", R.drawable.foto_soekarno16 ));
        sundaBaku.add(new SundaBaku("", R.drawable.foto_soekarno17 ));
        sundaBaku.add(new SundaBaku("", R.drawable.foto_soekarno18 ));
        sundaBaku.add(new SundaBaku("", R.drawable.foto_soekarno19 ));
        sundaBaku.add(new SundaBaku("", R.drawable.foto_soekarno20 ));
        sundaBaku.add(new SundaBaku("", R.drawable.foto_soekarno21 ));
        sundaBaku.add(new SundaBaku("", R.drawable.foto_soekarno22 ));
        sundaBaku.add(new SundaBaku("", R.drawable.foto_soekarno23 ));
        sundaBaku.add(new SundaBaku("", R.drawable.foto_soekarno24 ));
        sundaBaku.add(new SundaBaku("", R.drawable.foto_soekarno25 ));
        sundaBaku.add(new SundaBaku("", R.drawable.foto_soekarno26 ));
        sundaBaku.add(new SundaBaku("", R.drawable.foto_soekarno27 ));
        sundaBaku.add(new SundaBaku("", R.drawable.foto_soekarno28 ));
        sundaBaku.add(new SundaBaku("", R.drawable.foto_soekarno29 ));
        sundaBaku.add(new SundaBaku("", R.drawable.foto_soekarno30 ));
        sundaBaku.add(new SundaBaku("", R.drawable.foto_soekarno31 ));
        sundaBaku.add(new SundaBaku("", R.drawable.foto_soekarno32 ));
        sundaBaku.add(new SundaBaku("", R.drawable.foto_soekarno33 ));
        sundaBaku.add(new SundaBaku("", R.drawable.foto_soekarno34 ));
        sundaBaku.add(new SundaBaku("", R.drawable.foto_soekarno35 ));


        SundaBakuAdapter adapter = new SundaBakuAdapter(sundaBaku);
        RecyclerView rv = (RecyclerView) view.findViewById(R.id.recycler_view);
        rv.setHasFixedSize(true);
        rv.setAdapter(adapter);

        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        rv.setLayoutManager(llm);

        return view;
    }

}
