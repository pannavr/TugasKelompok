package tugaskelompok;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author panna 
 * @author yogi
 * Main berisi tampilan menu utama saat program ini di jalankan.
 */
public class Main {

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        String namaAsli, pas;
        int inputPilihan;
        boolean pilihan = true;
        boolean done = false;
        while (!done) {
            try {
                while (pilihan) {
                    System.out.println("=====================");
                    System.out.println("1. Add");
                    System.out.println("2. View");
                    System.out.println("3. Login");
                    System.out.println("4. Exit");
                    System.out.println("=====================");
                    System.out.print("Pilihan(1-4) : ");
                    inputPilihan = in.nextInt();
                    switch (inputPilihan) {
                        case 1:
                            System.out.println("=====================");
                            System.out.println("Pilihan(1-4) : 1");
                            in.nextLine();
                            //input nama lengkap
                            System.out.print("Nama Lengkap    : ");
                            namaAsli = in.nextLine();
                            //input password
                            System.out.print("Password        : ");
                            pas = in.nextLine();
                            Employees.tambahemployee(namaAsli, pas);
                            System.out.println("=====================");
                            System.out.println("");
                            break;
                        case 2:
                            System.out.println("=====================");
                            System.out.println("Pilihan(1-4) : 2");
                            Employees.lihatemployee();
                            System.out.println("");
                            break;
                        case 3:
                            System.out.println("=====================");
                            System.out.println("Pilihan(1-4) : 3");
                            in.nextLine();
                            System.out.print("Username    : ");
                            String username = in.nextLine();
                            System.out.print("Password    : ");
                            String password = in.nextLine();
                            Employees.login(username, password);
                            System.out.println("=====================");
                            System.out.println("");
                            break;
                        case 4:
                            System.exit(0);
                            break;
                        default:
                            System.out.println("Data tidak di temukan silahkan pilih 1-4");
                    }
                }
                done = true;
            } catch (Exception e) {
                System.out.println("Tolong input angka!!");
                in.next();
            }
        }
    }

}
