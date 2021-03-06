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
        sundaBaku.add(new SundaBaku("a", R.drawable.bambu_runcing ));
        sundaBaku.add(new SundaBaku("b", R.drawable.foto_soekarno ));
        sundaBaku.add(new SundaBaku("c", R.drawable.bambu_runcing ));
        sundaBaku.add(new SundaBaku("d", R.drawable.foto_soekarno ));
        sundaBaku.add(new SundaBaku("e", R.drawable.bambu_runcing ));

        SundaBakuAdapter adapter = new SundaBakuAdapter(sundaBaku);
        RecyclerView rv = (RecyclerView) view.findViewById(R.id.recycler_view);
        rv.setHasFixedSize(true);
        rv.setAdapter(adapter);

        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        rv.setLayoutManager(llm);

        return view;
    }

}
