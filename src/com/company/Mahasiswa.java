package com.company;

public class Mahasiswa {


    //private disini agar tidak bisa di akses dari luar
    private final String NIM;
    private final String Kelas;
    private final String Nama;

    public Mahasiswa (String NIM, String Kelas, String Nama ) {
        this.NIM = NIM;
        this.Kelas = Kelas;
        this.Nama = Nama;
    }

    public String getNIM() {
        return NIM;
    }

    //override hashCodenya
    @Override
    public int hashCode() {
        final int HASH_MULTIPLIER = 29;//gunakan bilangan primer sebagai pengali
        int h1 = NIM.hashCode();
        int h2 = Kelas.hashCode();
        int h3 = Nama.hashCode();
        //untuk mengkali variabel h = agar biar unik
        int h = HASH_MULTIPLIER * h1 + h2 + h3;
        return h;//key merupakan gabungan antara NIP dan nama sudah menjadi angka yang unik


    }
    // Equal objects must produce the same
    // hash code as long as they are equal
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (this.getClass() != obj.getClass()) {
            return false;
        }
        Mahasiswa other = (Mahasiswa) obj;
        //menggabungkan key nip dan nama
        return NIM.equals(other.NIM) && Kelas.equals(other.Kelas) && Nama.equals(other.Nama);
    }

    //memakai toString agar bisa ditampilkan
    @Override
    public String toString() {
        return "Mahasiswa{" +
                "NIM='" + NIM + '\'' +
                ", Kelas='" + Kelas + '\'' +
                ", Nama ='" + Nama + '\'' +
                '}';
    }

}