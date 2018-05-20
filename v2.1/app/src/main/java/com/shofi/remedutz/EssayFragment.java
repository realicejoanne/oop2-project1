package com.shofi.remedutz;


import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class EssayFragment extends Fragment {

    TextView mtvSkor2,mtvSoal2;
    ImageView mivGambar;
    EditText medtJawaban;
    Button mbtnSubmit2;
    int x=0;
    int arr;
    int skor;
    String jawaban;

    SoalEssay essay = new SoalEssay();

    public EssayFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_essay, container, false);
        ((MainActivity) getActivity()).getSupportActionBar().setTitle("Fragment Essay");
        ((MainActivity) getActivity()).getSupportActionBar().setSubtitle("(fragment_essay.xml)");
        ((MainActivity) getActivity()).getSupportActionBar().setDisplayHomeAsUpEnabled(false);

        mtvSkor2 = (TextView) view.findViewById(R.id.tvSkor2);
        mtvSoal2 = (TextView) view.findViewById(R.id.tvSoal2);
        mivGambar = (ImageView) view.findViewById(R.id.ivGambar);
        medtJawaban = (EditText) view.findViewById(R.id.edtJawaban);
        mbtnSubmit2 = (Button) view.findViewById(R.id.btnSubmit2);

        setKonten();

        mbtnSubmit2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cekJawaban();
            }
        });
        return view;
    }
    public void setKonten(){
        medtJawaban.setText(null);
        arr = essay.pertanyaan.length;
        if(x >= arr){ //jika nilai x melebihi nilai arr(panjang array) maka akan pindah activity (kuis selesai)
            String jumlahSkor = String.valueOf(skor);	//menjadikan skor menjadi string
            Intent i = new Intent(getActivity(), SkoringActivity.class);
            //waktu pindah activity, sekalian membawa nilai jumlahSkor yang ditampung dengan inisial skorAkhir2
            //singkatnya skorAkhir2 = jumlahSkor
            //jika masih belum jelas silahkan bertanya
            i.putExtra("skorAkhir2",jumlahSkor);
            i.putExtra("activity","Essay");
            getActivity().startActivity(i);
        }else{
            //setting text dengan mengambil text dari method getter di kelas SoalEssay
            mtvSoal2.setText(essay.getPertanyaan(x));
            ubahGambar();
            jawaban = essay.getJawabanBenar(x);
        }
        x++;
    }

    public void ubahGambar(){
        Resources res = getResources();
        String mPhoto = essay.getStringGambar(x);
        int resID = res.getIdentifier(mPhoto, "drawable", getActivity().getPackageName());
        Drawable drawable = res.getDrawable(resID);
        mivGambar.setImageDrawable(drawable);
    }

    public void cekJawaban(){
        if(!medtJawaban.getText().toString().toLowerCase().isEmpty()){ //jika edit text TIDAK kosong
            //jika text yang tertulis di edit text tsb = nilai dari var jawaban
            if(medtJawaban.getText().toString().toLowerCase().equalsIgnoreCase(jawaban)){
                skor = skor + 10;
                mtvSkor2.setText(""+skor);	//mtvSkor2 diset nilainya = var skor
                Toast.makeText(getActivity(), "Jawaban Benar", Toast.LENGTH_SHORT).show(); //keluar notifikasi "Jawaban Benar"
                setKonten(); //update next konten
            }else{
                mtvSkor2.setText(""+skor);
                Toast.makeText(getActivity(), "Jawaban Salah", Toast.LENGTH_SHORT).show();
                setKonten();
            }
        }else{
            Toast.makeText(getActivity(), "Silahkan isi jawaban dulu!", Toast.LENGTH_SHORT).show();
        }
    }

    //ini adalah method bawaan dari Android Studio
    //fungsi : memberi aksi ketika tombol back pada hp diklik
    public void callParent(){
        getActivity().onBackPressed();
    }
}
