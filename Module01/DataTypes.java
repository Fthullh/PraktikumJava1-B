import javax.swing.JOptionPane;

public class DataTypes{
 public static void main(String[] args) {

 String namaDepan = "Fathulloh";
 String namaTengah = "Muhammad";
 String namaBelakang = "Idham";
 int usia = 21;
 int targetTahunKuliah = 4;
 double ipk = 3.89764512;
 char nilaiAbjad = 'A';
 boolean tampan = true;

 System.out.println("Nama depan : " + namaDepan);
 System.out.println("Nama tengah : " + namaTengah);
 System.out.println("Nama belakang: " + namaBelakang);
 System.out.println("Usia : " + usia);
 System.out.println("Target Kuliah : " + targetTahunKuliah + " tahun");
 System.out.println("IPK : " + ipk);
 System.out.println("Nilai PBO : " + nilaiAbjad);
 System.err.println("Tampan : " + tampan);

 JOptionPane.showMessageDialog(null,"Hai, " + namaDepan + namaTengah + namaBelakang);

 }
} 