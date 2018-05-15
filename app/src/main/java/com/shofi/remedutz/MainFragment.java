package com.shofi.remedutz;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;


/**
 * A simple {@link Fragment} subclass.
 */
public class MainFragment extends Fragment {

    LinearLayout mlinePilGan, mLineEssay;	//variabel baru bertipe LinearLayout
    ImageButton bendera;

    public MainFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_main, container, false);

        if (view!=null) {

            mlinePilGan = (LinearLayout) view.findViewById(R.id.linePilGan);
            mLineEssay = (LinearLayout) view.findViewById(R.id.lineEssay);
            bendera = (ImageButton) view.findViewById(R.id.bendera);


            bendera.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    //hasil aksinya ditulis disini (dalam method onClick)
                    //pada kali ini hasil yang diinginkan adalah pindah activity, maka

                    //membuat objek baru dari kelas intent,
                    //dari MainActivity akan pindah ke KuisPilihaGanda
                    Intent i = new Intent(getActivity(), Main2Activity.class);
                    startActivity(i); //jalankan Intent

                }
            });



            //memberi aksi ketika diklik
                mlinePilGan.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        //hasil aksinya ditulis disini (dalam method onClick)
                        //pada kali ini hasil yang diinginkan adalah pindah activity, maka

                        //membuat objek baru dari kelas intent,
                        //dari MainActivity akan pindah ke KuisPilihaGanda
                        PilganFragment pilganFragment = new PilganFragment();
                        //buat object fragmentkedua

                        FragmentManager fragmentManager = getFragmentManager();
                        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                        fragmentTransaction.replace(R.id.frame_content, pilganFragment);
                        fragmentTransaction.commit();
                        //mengeksekusi fragment transaction

                    }
                });

                mLineEssay.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        //hasil aksinya ditulis disini (dalam method onClick)
                        //pada kali ini hasil yang diinginkan adalah pindah activity, maka

                        //membuat objek baru dari kelas intent,
                        //dari MainActivity akan pindah ke KuisEssay
                        EssayFragment essayFragment = new EssayFragment();
                        //buat object fragmentkedua

                        FragmentManager fragmentManager = getFragmentManager();
                        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                        fragmentTransaction.replace(R.id.frame_content, essayFragment);
                        fragmentTransaction.commit();
                        //mengeksekusi fragment transaction

                    }
                });

            }
        return view;
    }

}
