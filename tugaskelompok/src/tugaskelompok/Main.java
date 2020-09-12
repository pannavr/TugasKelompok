package tugaskelompok;

import java.util.Scanner;


public class Main {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

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
                    inputPilihan = scan.nextInt();
                    switch (inputPilihan) {
                        case 1:
                            System.out.println("=====================");
                            System.out.println("Pilihan(1-4) : 1");
                            Employees.tambahemployee();
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
                            Employees.login();
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
                scan.next();
            }
        }
    }

}
