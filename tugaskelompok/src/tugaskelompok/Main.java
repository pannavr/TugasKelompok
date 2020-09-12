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
        Employees employees = new Employees();
        Scanner scan = new Scanner(System.in);
        
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
            inputPilihan = scan.nextInt();
            
            switch (inputPilihan) {
                case 1:
                    System.out.println("=====================");
                    Employees.tambahemployee();
                    System.out.println("");
                    break;
                case 2:
                    System.out.println("=====================");
                    System.out.println("Pilihan(1-4) : 2");
                    Employees.lihatemployee();
                    System.out.println("=====================");
                    System.out.println("");
                    break;
                case 3:
                    System.out.println("=====================");
                    System.out.println("Pilihan(1-4) : 3");
                    System.out.println("Username    : ");
                    System.out.println("Password    : ");
                    System.out.println("=====================");
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
