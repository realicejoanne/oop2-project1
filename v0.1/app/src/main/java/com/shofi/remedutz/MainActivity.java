package com.shofi.remedutz;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager fragmentManager = getSupportFragmentManager();
       /* *getSupportFragmentManager = inisialisasi nilai FragmentManager untuk berinteraksi
            dengan Activity saat ini
         */
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        //memulai transaction fragment manager

        MainFragment mainFragment = new MainFragment();
        //membuat object fragmentPertama
        transaction.add(R.id.frame_content, mainFragment);
        //menambahkan fragment
        transaction.addToBackStack("mainFragment");
        //dapat menyimpan fragment ke dalam state ,ketika tombol back diklik
        transaction.commit();
        //mengeksekusi fragment transaction

    }
}
