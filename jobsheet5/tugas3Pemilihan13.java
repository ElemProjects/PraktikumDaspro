package jobsheet5;

import java.util.Scanner;

public class tugas3Pemilihan13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Kamu siapa (dosen/mahasiswa): ");
        String jenisPengguna = sc.nextLine();

        if (jenisPengguna.equals("dosen")) {
            System.out.println("Akses wifi diberikan");

        } else {
            System.out.println("Masukkan jumlah sks");
            int SKS = sc.nextInt();
            if (SKS >= 12) {
                System.out.println("Akses wifi diberikan");

            } else {
                System.out.println("Akses wifi ditolak");
            }

        }

    }
}