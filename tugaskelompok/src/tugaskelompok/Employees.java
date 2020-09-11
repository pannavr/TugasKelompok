/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugaskelompok;

/**
 *
 * @author NAME
 */
public class Employees {
    public static void AddEmployee(String namaLengkap, String password){
        int idEmployee;
        String namaDepan,namaBelakang,hashedPass,username;
        namaDepan = namaLengkap.substring(0,namaLengkap.lastIndexOf(" "));
        namaBelakang = namaLengkap.substring(namaLengkap.lastIndexOf(" ")+1);
        String[] usenameSplit = namaDepan.split(" ");
        username = usenameSplit[0]+namaBelakang.substring(0,2);
        hashedPass = BCrypt.hashpw(password, BCrypt.gensalt());
        System.out.println("nama depan      : "+namaDepan);
        System.out.println("nama belakang   : "+namaBelakang);
        System.out.println("username        : "+username);
        System.out.println("password        : "+hashedPass);
    }
    public static void ShowEmployee(){
        
    }
}
