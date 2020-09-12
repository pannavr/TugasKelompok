/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugaskelompok;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author NAME
 */
public class Employees {

    static Scanner in = new Scanner(System.in);
    static ArrayList<String> id = new ArrayList<>();
    static ArrayList<String> firstName = new ArrayList<String>();
    static ArrayList<String> lastName = new ArrayList<>();
    static ArrayList<String> usernameArr = new ArrayList<>();
    static ArrayList<String> passwordArr = new ArrayList<String>();

    public static String tambahemployee() {
        System.out.println("Pilihan(1-3) : 1");
        int a = id.size();
        int idbaru = 1 + a++;
        String addZero = String.format("%05d", idbaru);
        id.add(addZero);
        System.out.print("Nama Lengkap    : ");
        String namaAsli = in.nextLine();
        //            firsr name 
        String seprator = " ";
        int sepPos = namaAsli.lastIndexOf(seprator);
        String namaDepan = namaAsli.substring(0, sepPos);
        firstName.add(namaDepan);
        //   menambahkan nama belakang 
        String namaAkhir = namaAsli.substring(namaAsli.lastIndexOf(' '));
        lastName.add(namaAkhir);
        //   String  namaLengkap = in.nextLine();             
        System.out.print("Password        : ");
        String pas = in.nextLine();
        //   mendapat hashe password;
        String passHashe = pas;
        String getSalt = BCrypt.gensalt();
        String hashePass = BCrypt.hashpw(pas, getSalt);
        passwordArr.add(hashePass);
        //username
        String user = namaAkhir.substring(0, 3);
        String[] values = namaAsli.split(" ", 2);
        String f = values[0];
        String userFix = f + user;
        //menghilangkan space
        userFix = userFix.replaceAll("\\s", "");
        usernameArr.add(userFix);
        System.out.println("=====================");
        System.out.println("");
        return "";
    }

    public static void lihatemployee() {
        for (int i = 0; i < id.size(); i++) {
            System.out.println("ID = " + id.get(i));
            System.out.println("Nama depan = " + firstName.get(i));
            System.out.println("Nama Akhir = " + lastName.get(i));
            System.out.println("Username = " + usernameArr.get(i));
            System.out.println("Password : " + passwordArr.get(i));
        }
    }

    public static void login() {
        System.out.print("Username    : ");
        String username = in.nextLine();
        System.out.print("Password    : ");
        String password = in.nextLine();
        if (BCrypt.checkpw(password, passwordArr.get(usernameArr.indexOf(username)))) {
            System.out.println("Login Berhasil!!");
        }else{
            System.out.println("Login Gagal!!");
        }
    }

}
