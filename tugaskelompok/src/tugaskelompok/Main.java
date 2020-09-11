/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugaskelompok;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int inputPilihan;
        boolean pilihan = true;

        while (pilihan) {
            System.out.println("=====================");
            System.out.println("1. Add");
            System.out.println("2. View");
            System.out.println("3. Login");
            System.out.println("=====================");
            System.out.print("Pilihan(1-3) : ");
            inputPilihan = scan.nextInt();

            switch (inputPilihan) {
                case 1:
                    System.out.println("========================================"); 
                    System.out.println("Pilihan(1-3) : 1");
                    System.out.println("Nama Lengkap    : ");
                    System.out.println("Password        :");
                    System.out.println("========================================");
                    System.out.println("");
                    break;
                case 2:
                    System.out.println("========================================");
                    System.out.println("Pilihan(1-3) : 2");
                    System.out.println("Id Karyawan     : ");
                    System.out.println("Nama Depan      : ");
                    System.out.println("Nama Belakang   : ");
                    System.out.println("Username        : ");
                    System.out.println("========================================");
                    System.out.println("");
                    break;
                case 3:
                    System.out.println("========================================");
                    System.out.println("Pilihan(1-3) : 3");
                    System.out.println("Username    : ");
                    System.out.println("Password    : ");
                    System.out.println("========================================");
                    System.out.println("");
                    break;
                default:
                    System.out.println("Data tidak di temukan silahkan pilih 1-3");
            }
        }
    }

}
