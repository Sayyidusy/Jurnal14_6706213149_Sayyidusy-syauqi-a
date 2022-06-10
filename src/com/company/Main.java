package com.company;

import java.lang.reflect.Array;
import java.util.*;


public class Main {

    public static void main(String[] args) {
        HashMap<Mahasiswa, Double> mapMahasiswa= new HashMap<>();
        Scanner input = new Scanner(System.in);
        int menu;

        do {
            System.out.println("Pilihan Menu Data Mahasiswa");
            System.out.println();
            System.out.println("1. Tambah Mahasiswa ");
            System.out.println("2. Hapus Data Mahasiswa ");
            System.out.println("3. Tampilkan Data Mahasiswa dan Rata-rata nilai Mahasiswa");
            System.out.println("4. Keluar");
            menu = input.nextInt();

            switch (menu){
                case 1 -> {
                    System.out.println("masukan Data Mahasiswa");
                    System.out.print("NIM = ");
                    String nim = input.next();
                    System.out.print("Kelas = ");
                    String kelas = input.next();
                    System.out.print("Nama = ");
                    String nama = input.next();
                    System.out.print("Nilai = ");
                    double nilai = input.nextDouble();

                    Mahasiswa mhs = new Mahasiswa(nim,kelas,nama);
                    mapMahasiswa.put (mhs, nilai);

                }
                case 2 ->{
                    System.out.println("Masukan Data Mahasiswa yang ingin dihapus");
                    System.out.print("NIM =");
                    String hapusMhs =input.next();
                    Iterator<Mahasiswa> iterator = mapMahasiswa.keySet().iterator();
                    while(iterator.hasNext()){
                        Mahasiswa currentMhs = iterator.next();
                        if(currentMhs.getNIM().equals(hapusMhs)){
                            iterator.remove();
                            System.out.printf("berhasil  %s di hapus", hapusMhs);
                        }
                    }
                }
                case 3 ->{
                    double  totalNilai = 0;
                    double totalMahasiswa = 0;
                    for (Map.Entry<Mahasiswa,Double> entry : mapMahasiswa.entrySet()){
                        System.out.println(entry.getKey() + "nilai = " + entry.getValue());
                        totalNilai += entry.getValue();
                        totalMahasiswa = mapMahasiswa.size();
                    }
                    System.out.printf("Rata - rata Nilai mahasiswa: %, .2f\n", totalNilai/totalMahasiswa);
                }
                default -> {}
            }
        }while (menu != 0);
        input.close();
    }

}
