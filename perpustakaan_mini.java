import java.util.Scanner;
import java.io.*;
public class perpustakaan_mini {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Array untuk menyimpan data buku, jurnal, dan skripsi
        String[] buku = new String[100];
        String[] jurnal = new String[100];
        String[] skripsi = new String[100];
        int jumlahBuku = 0, jumlahJurnal = 0, jumlahSkripsi = 0;

        boolean selesai = false;

        while (!selesai) {
            System.out.println("=== PERUSTAAAN ===");
            System.out.println("1. Admin");
            System.out.println("2. Pelanggan");
            System.out.print("Pilih sebagai (1/2): ");
            int pilihan = input.nextInt();
            input.nextLine(); // membersihkan buffer

            if (pilihan == 1) {
                // Admin
                System.out.print("Masukkan password admin: ");
                String pass = input.nextLine();
                if (pass.equals("admin123")) { // contoh password
                    boolean adminSelesai = false;
                    while (!adminSelesai) {
                        System.out.println("1. Tambahkan Buku");
                        System.out.println("2. Tambahkan Jurnal");
                        System.out.println("3. Tambahkan Judul Skripsi");
                        System.out.println("4. Keluar");
                        System.out.print("Pilih menu: ");
                        int menuAdmin = input.nextInt();
                        input.nextLine();

                        if (menuAdmin == 1) {
                            System.out.print("Masukkan judul buku: ");
                            buku[jumlahBuku] = input.nextLine();
                            jumlahBuku++;
                            System.out.println("Buku berhasil ditambahkan.");
                        } else if (menuAdmin == 2) {
                            System.out.print("Masukkan judul jurnal: ");
                            jurnal[jumlahJurnal] = input.nextLine();
                            jumlahJurnal++;
                            System.out.println("Jurnal berhasil ditambahkan.");
                        } else if (menuAdmin == 3) {
                            System.out.print("Masukkan judul skripsi: ");
                            skripsi[jumlahSkripsi] = input.nextLine();
                            jumlahSkripsi++;
                            System.out.println("Judul skripsi berhasil ditambahkan.");
                        } else if (menuAdmin == 4) {
                            System.out.println("Terima kasih, Admin!");
                            adminSelesai = true;
                        } else {
                            System.out.println("Menu tidak valid!");
                        }
                    }
                } else {
                    System.out.println("Password salah!");
                }
            } else if (pilihan == 2) {
                // Pelanggan
                boolean pelangganSelesai = false;
                while (!pelangganSelesai) {
                    System.out.println("Mau cari apa?");
                    System.out.println("1. Pinjam Buku");
                    System.out.println("2. Pinjam Jurnal");
                    System.out.println("3. Pinjam Skripsi");
                    System.out.println("4. Keluar");
                    System.out.print("Pilih menu: ");
                    int menuPelanggan = input.nextInt();
                    input.nextLine();

                    if (menuPelanggan == 1) {
                        if (jumlahBuku == 0) {
                            System.out.println("Belum ada buku tersedia.");
                        } else {
                            System.out.println("Daftar Buku:");
                            for (int i = 0; i < jumlahBuku; i++) {
                                System.out.println((i + 1) + ". " + buku[i]);
                            }
                            System.out.print("Pilih nomor buku yang ingin dipinjam: ");
                            int pilihBuku = input.nextInt();
                            input.nextLine();
                            if (pilihBuku >= 1 && pilihBuku <= jumlahBuku) {
                                System.out.println("Buku \"" + buku[pilihBuku - 1] + "\" berhasil dipinjam.");
                            } else {
                                System.out.println("Pilihan tidak valid.");
                            }
                        }
                        System.out.println("Terima kasih!");
                    } else if (menuPelanggan == 2) {
                        if (jumlahJurnal == 0) {
                            System.out.println("Belum ada jurnal tersedia.");
                        } else {
                            System.out.println("Daftar Jurnal:");
                            for (int i = 0; i < jumlahJurnal; i++) {
                                System.out.println((i + 1) + ". " + jurnal[i]);
                            }
                            System.out.print("Pilih nomor jurnal yang ingin dipinjam: ");
                            int pilihJurnal = input.nextInt();
                            input.nextLine();
                            if (pilihJurnal >= 1 && pilihJurnal <= jumlahJurnal) {
                                System.out.println("Jurnal \"" + jurnal[pilihJurnal - 1] + "\" berhasil dipinjam.");
                            } else {
                                System.out.println("Pilihan tidak valid.");
                            }
                        }
                        System.out.println("Terima kasih!");
                    } else if (menuPelanggan == 3) {
                        if (jumlahSkripsi == 0) {
                            System.out.println("Belum ada skripsi tersedia.");
                        } else {
                            System.out.println("Daftar Skripsi:");
                            for (int i = 0; i < jumlahSkripsi; i++) {
                                System.out.println((i + 1) + ". " + skripsi[i]);
                            }
                            System.out.print("Pilih nomor skripsi yang ingin dipinjam: ");
                            int pilihSkripsi = input.nextInt();
                            input.nextLine();
                            if (pilihSkripsi >= 1 && pilihSkripsi <= jumlahSkripsi) {
                                System.out.println("Skripsi \"" + skripsi[pilihSkripsi - 1] + "\" berhasil dipinjam.");
                            } else {
                                System.out.println("Pilihan tidak valid.");
                            }
                        }
                        System.out.println("Terima kasih!");
                    } else if (menuPelanggan == 4) {
                        pelangganSelesai = true;
                    } else {
                        System.out.println("Menu tidak valid!");
                    }
                }
            } else {
                System.out.println("Pilihan tidak valid!");
            }

            System.out.print("Apakah ingin keluar dari program? (y/n): ");
            String keluar = input.nextLine();
            if (keluar.equalsIgnoreCase("y")) {
                selesai = true;
            }
        }

        System.out.println("Program selesai.");
        input.close();
    }
}
