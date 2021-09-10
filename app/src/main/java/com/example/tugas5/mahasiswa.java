package com.example.tugas5;

public class mahasiswa {
    private String NPM;
    private String Nama;
    private String Kelas;

    public mahasiswa(String NPM, String nama, String kelas) {
        this.NPM = NPM;
        Nama = nama;
        Kelas = kelas;
    }

    public String getNPM() {
        return NPM;
    }

    public void setNPM(String NPM) {
        this.NPM = NPM;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String nama) {
        Nama = nama;
    }

    public String getKelas() {
        return Kelas;
    }

    public void setKelas(String kelas) {
        Kelas = kelas;
    }
}
