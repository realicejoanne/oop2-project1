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
        sundaKuno.add(new SundaKuno("", R.drawable.nol));
        sundaKuno.add(new SundaKuno("", R.drawable.satu));
        sundaKuno.add(new SundaKuno("", R.drawable.dua));
        sundaKuno.add(new SundaKuno("", R.drawable.tiga));
        sundaKuno.add(new SundaKuno("", R.drawable.empat));
        sundaKuno.add(new SundaKuno("", R.drawable.lima));
        sundaKuno.add(new SundaKuno("", R.drawable.enam));
        sundaKuno.add(new SundaKuno("", R.drawable.tujuh));
        sundaKuno.add(new SundaKuno("", R.drawable.delapan));
        sundaKuno.add(new SundaKuno("", R.drawable.sembilan));
        sundaKuno.add(new SundaKuno("", R.drawable.a));
        sundaKuno.add(new SundaKuno("", R.drawable.e));
        sundaKuno.add(new SundaKuno("", R.drawable.i));
        sundaKuno.add(new SundaKuno("", R.drawable.o));
        sundaKuno.add(new SundaKuno("", R.drawable.ba));
        sundaKuno.add(new SundaKuno("", R.drawable.ca));
        sundaKuno.add(new SundaKuno("", R.drawable.da));
        sundaKuno.add(new SundaKuno("", R.drawable.ga));
        sundaKuno.add(new SundaKuno("", R.drawable.ha));
        sundaKuno.add(new SundaKuno("", R.drawable.ja));
        sundaKuno.add(new SundaKuno("", R.drawable.ka));
        sundaKuno.add(new SundaKuno("", R.drawable.la));
        sundaKuno.add(new SundaKuno("", R.drawable.ma));
        sundaKuno.add(new SundaKuno("", R.drawable.na));
        sundaKuno.add(new SundaKuno("", R.drawable.nga));
        sundaKuno.add(new SundaKuno("", R.drawable.nya));
        sundaKuno.add(new SundaKuno("", R.drawable.pa));
        sundaKuno.add(new SundaKuno("", R.drawable.ra));
        sundaKuno.add(new SundaKuno("", R.drawable.sa));
        sundaKuno.add(new SundaKuno("", R.drawable.ta));
        sundaKuno.add(new SundaKuno("", R.drawable.wa));
        sundaKuno.add(new SundaKuno("", R.drawable.ya));
        sundaKuno.add(new SundaKuno("", R.drawable.foto_soekarno1 ));
        sundaKuno.add(new SundaKuno("", R.drawable.bambu_runcing ));
        sundaKuno.add(new SundaKuno("", R.drawable.foto_soekarno1 ));
        sundaKuno.add(new SundaKuno("", R.drawable.bambu_runcing ));

        SundaKunoAdapter adapter = new SundaKunoAdapter(sundaKuno);
        RecyclerView rv = (RecyclerView) view.findViewById(R.id.recycler_view);
        rv.setHasFixedSize(true);
        rv.setAdapter(adapter);

        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        rv.setLayoutManager(llm);

        return view;
    }


}
