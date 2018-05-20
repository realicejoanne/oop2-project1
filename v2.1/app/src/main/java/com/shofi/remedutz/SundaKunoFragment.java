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
public class SundaKunoFragment extends Fragment {

    ArrayList<SundaKuno> sundaKuno;

    public SundaKunoFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_sunda_kuno, container, false);

        sundaKuno = new ArrayList<SundaKuno>();
        sundaKuno.add(new SundaKuno(R.mipmap.kuno));

        SundaKunoAdapter adapter = new SundaKunoAdapter(sundaKuno);
        RecyclerView rv = (RecyclerView) view.findViewById(R.id.recycler_view);
        rv.setHasFixedSize(true);
        rv.setAdapter(adapter);

        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        rv.setLayoutManager(llm);

        return view;
    }


}
