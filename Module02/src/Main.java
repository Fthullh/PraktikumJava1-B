import model.Mahasiswa;

public class Main {
    public static void main(String[] args) {
        Mahasiswa m1 = new Mahasiswa("19710037","Atia","05-12-2001");
        m1.tampilkanAtribut();
        System.out.println(m1.getNama());
    }
}
