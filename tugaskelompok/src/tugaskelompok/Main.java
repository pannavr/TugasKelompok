package tugaskelompok;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String namaLengkap, password;
        int inputPilihan;
        boolean pilihan = true;

        while (pilihan) {
            System.out.println("=====================");
            System.out.println("1. Add");
            System.out.println("2. View");
            System.out.println("3. Login");
            System.out.println("4. Exit");
            System.out.println("=====================");
            System.out.print("Pilihan(1-4) : ");
            inputPilihan = Integer.parseInt(br.readLine());

            switch (inputPilihan) {
                case 1:
                    System.out.println("========================================");
                    System.out.println("Pilihan(1-4) : 1");
                    System.out.print("Nama Lengkap    : ");
                    namaLengkap = br.readLine();
                    System.out.print("Password        : ");
                    password = br.readLine();
                    Employees.AddEmployee(namaLengkap, password);
                    System.out.println("");
                    break;
                case 2:
                    System.out.println("========================================");
                    System.out.println("Pilihan(1-4) : 2");
                    System.out.println("Id Karyawan     : ");
                    System.out.println("Nama Depan      : ");
                    System.out.println("Nama Belakang   : ");
                    System.out.println("Username        : ");
                    System.out.println("========================================");
                    System.out.println("");
                    break;
                case 3:
                    System.out.println("========================================");
                    System.out.println("Pilihan(1-4) : 3");
                    System.out.println("Username    : ");
                    System.out.println("Password    : ");
                    System.out.println("========================================");
                    System.out.println("");
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Data tidak di temukan silahkan pilih 1-3");
            }
        }
    }

}
