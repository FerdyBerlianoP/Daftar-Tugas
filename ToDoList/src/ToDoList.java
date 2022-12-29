import java.util.ArrayList;
import java.util.Scanner;

public class ToDoList {
  ArrayList<String> listTugas = new ArrayList<>();
  Scanner input = new Scanner(System.in);

  public void tambahTugas(String tugas) {
    listTugas.add(tugas);
    System.out.println("Tugas berhasil ditambahkan.");
  }

  public void hapusTugas(int indeks) {
    listTugas.remove(indeks);
    System.out.println("Tugas berhasil dihapus.");
  }

  public void tampilkanTugas() {
    System.out.println("Daftar Tugas:");
    for (int i = 0; i < listTugas.size(); i++) {
      System.out.println((i + 1) + ". " + listTugas.get(i));
    }
  }

  public static void main(String[] args) {
    ToDoList todo = new ToDoList();
    Scanner input = new Scanner(System.in);
    int pilihan;

    do {
      System.out.println("Pilih menu yang diinginkan:");
      System.out.println("1. Tambah Tugas");
      System.out.println("2. Hapus Tugas");
      System.out.println("3. Tampilkan Tugas");
      System.out.println("4. Keluar");
      System.out.print("Masukkan pilihan Anda: ");
      pilihan = input.nextInt();

      switch (pilihan) {
        case 1:
          System.out.print("Masukkan tugas yang ingin ditambahkan: ");
          String tugasBaru = input.next();
          todo.tambahTugas(tugasBaru);
          break;
        case 2:
          todo.tampilkanTugas();
          System.out.print("Masukkan indeks tugas yang ingin dihapus: ");
          int indeksHapus = input.nextInt();
          todo.hapusTugas(indeksHapus - 1);
          break;
        case 3:
          todo.tampilkanTugas();
          break;
        case 4:
          System.out.println("Terima kasih telah menggunakan aplikasi ini.");
          break;
        default:
          System.out.println("Pilihan tidak valid. Silakan coba lagi.");
          break;
      }
    } while (pilihan != 4);
  }
}
