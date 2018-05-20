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
        sundaBaku.add(new SundaBaku(R.mipmap.baku));


        SundaBakuAdapter adapter = new SundaBakuAdapter(sundaBaku);
        RecyclerView rv = (RecyclerView) view.findViewById(R.id.recycler_view);
        rv.setHasFixedSize(true);
        rv.setAdapter(adapter);

        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        rv.setLayoutManager(llm);

        return view;
    }

}
