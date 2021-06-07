package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MahasiswaBeraksi {
    public static void main(String[] args) throws ParseException{

        String polaTanggal = "dd-MM-yyyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(polaTanggal);

        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.npm = "19710035";
        mahasiswa.nama = "Fathulloh";
        mahasiswa.tanggalLahir = simpleDateFormat.parse("26-09-1999");

        System.out.println("Nama \t\t\t : " + mahasiswa.nama);
        System.out.println("NPM \t\t\t : " + mahasiswa.npm);
        System.out.println("Tanggal Lahir \t : " + simpleDateFormat.format(mahasiswa.tanggalLahir));
        System.out.println();

        mahasiswa.tampilkanAtribut();
        System.out.println();
        mahasiswa.menyapa();
        System.out.println("Usiaku : " + mahasiswa.hitungUsia() + " tahun");
        System.out.println();

        Mahasiswa mahasiswa2 = new Mahasiswa("19710036","Nur Nela","26-12-2000");
        mahasiswa2.tampilkanAtribut();
    }
}