package com.shofi.remedutz;

public class SoalEssay {
    //membuat array untuk pertanyaan
    public String pertanyaan[] = {
            "Apa bacaan di atas ?",
            "",
            "Apa bacaan di atas ?",
            "Apa bacaan di atas ?",
            "Apa bacaan di atas ?",
            "Apa bacaan di atas ?",
            "Apa bacaan di atas ?",
            "Apa bacaan di atas ?",
            "",

    };

    //membuat array untuk set gambar (dari String diubah jadi ImageView)
    //pastikan yang tertulis disini sama dengan nama di drawable
    //lihat gambar penjelasan1
    private String image[] = {
            "indonesia",
            "soal2",
            "soal3",
            "soal4",
            "soal5",
            "soal6",
            "soal7",
            "soal8",
            "soal9",
    };

    //membuat array jawaban benar
    private String jawabanBenar[] = {
            "INDONESIA",
            "BANDUNG",
            "MOTOR TERBANG",
            "HIMATIF",
            "PEMROGRAMAN",
            "KUCING",
            "TUGU MONAS",
            "TASIKMALAYA",
            "APEL",
    };

    //membuat getter untuk mengambil pertanyaan
    public String getPertanyaan(int x){
        String soal = pertanyaan[x];
        return soal;
    }

    //membuat getter untuk mengambil jawaban benar
    public String getStringGambar(int x){
        String gambar = image[x];
        return gambar;
    }

    //membuat getter untuk mengambil jawaban benar
    public String getJawabanBenar(int x){
        String jawaban = jawabanBenar[x];
        return jawaban;
    }
}

