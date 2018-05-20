package com.shofi.remedutz;

public class SoalPilihanGanda {

    //membuat array untuk pertanyaan
    public String pertanyaan[] = {
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
    };


    private String image[] = {
            "belanja",
            "beranda",
            "konverter",
            "sunda",
            "tentang",
            "unduh",
            "unicode",
            "panduan",
            "petasitus",
            "proyek",
    };

     private String pilihanJawaban[][] = {
            {"Benda","Belanja","Belanda"},
            {"Beranda","Besar","Bhinneka"},
            {"Koreksi","Konverter","Juara"},
            {"Sumatra","Suku","Sunda"},
            {"Tentang","tentangga","Tulang"},
            {"Ubah","Unduh","Usaha"},
            {"Unik","Unicode","Unta"},
            {"Pantauan","Paksaan","Panduan"},
            {"Peta dunia","Peta laut","Peta Situs"},
            {"Proyek","Proker","Projek"},
    };

    //membuat array untuk jawaban benar
    private String jawabanBenar[] = {
            "Belanja",
            "Beranda",
            "Konnverter",
            "Sunda",
            "Tentang",
            "Unduh",
            "Unicode",
            "Pantauan",
            "Peta Situs",
            "Proyek",
    };

    //membuat getter untuk mengambil pertanyaan
    public String getPertanyaan(int x){
        String soal = pertanyaan[x];
        return soal;
    }
    public String getStringGambar(int x){
        String gambar = image[x];
        return gambar;
    }
    //membuat getter untuk mengambil pilihan jawaban 1
    public String getPilihanJawaban1(int x){
        String jawaban1 = pilihanJawaban[x][0];
        return jawaban1;
    }


    //membuat getter untuk mengambil pilihan jawaban 2
    public String getPilihanJawaban2(int x){
        String jawaban2 = pilihanJawaban[x][1];
        return jawaban2;
    }

    //membuat getter untuk mengambil pilihan jawaban 3
    public String getPilihanJawaban3(int x){
        String jawaban3 = pilihanJawaban[x][2];
        return jawaban3;
    }

    //membuat getter untuk mengambil jawaban benar
    public String getJawabanBenar(int x){
        String jawaban = jawabanBenar[x];
        return jawaban;
    }
}

