/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugaskelompok;

import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author NAME
 */
public class Employees {
    int idEmployee;
    String namaDepan,namaBelakang;
       static   ArrayList<Integer> id = new ArrayList<Integer>();
         static     ArrayList<String> nameLengkap = new ArrayList<String>();
          static    ArrayList<String> lastName = new ArrayList<String>();
          static    ArrayList<String> username = new ArrayList<String>();
           static   ArrayList<String> password = new ArrayList<String>();
   
     public static String tambahemployee(){
          Scanner in = new Scanner(System.in);
       
          
       System.out.println("=====================");
      
                    System.out.println("Pilihan(1-3) : 1");
                    int a=0;
               
                    id.add(a++);
                    System.out.print("Nama Lengkap    : ");
                    String namaAsli = in.nextLine();
                    nameLengkap.add(namaAsli);
                    //menambahkan nama belakang 
                    String namaAkhir = namaAsli.substring(namaAsli.lastIndexOf(' '));
                    lastName.add(namaAkhir);
                    //   String  namaLengkap = in.nextLine();             
                    System.out.print("Password        : ");
                    String pas = in.nextLine();  
                    //   mendapat hashe password;
                    String passHashe = pas;
                    String getSalt = BCrypt.gensalt();
                    String hashePass = BCrypt.hashpw(pas, getSalt);
                    password.add(hashePass);  
                    //username
                    String user = namaAkhir.substring(0, 3);
                     String[] values = namaAsli.split(" ",2);
                      String f = values[0];
                      String userFix = f+user;
                      //menghilangkan space
                      userFix = userFix.replaceAll("\\s", "");
                      username.add(userFix);
                    
            
//           for (int i = 0; i <a; i++) {
//             System.out.println("ID = "+id.get(i));
//             System.out.println("Nama Lengkap = "+nameLengkap.get(i));
//             System.out.println("Nama Akhir = "+lastName.get(i));
//               System.out.println("Username = "+ username.get(i));
//             
//             System.out.println("Password : "+password.get(i));
//  
//         }
        
                     System.out.println("=====================");
                    System.out.println("");
    return "";}
     
     public static String showEmployee(){
         int a = 0;
        a++;
       for (int i = 0; i <=a; i++) {
             System.out.println("ID = "+id.get(i));
             System.out.println("Nama Lengkap = "+nameLengkap.get(i));
             System.out.println("Nama Akhir = "+lastName.get(i));
               System.out.println("Username = "+ username.get(i));
             
             System.out.println("Password : "+password.get(i));
  
         }
     return"";}
    
     
    public int getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(int idEmployee) {
        this.idEmployee = idEmployee;
    }

    public String getNamaDepan() {
        return namaDepan;
    }

    public void setNamaDepan(String namaDepan) {
        this.namaDepan = namaDepan;
    }

    public String getNamaBelakang() {
        return namaBelakang;
    }

    public void setNamaBelakang(String namaBelakang) {
        this.namaBelakang = namaBelakang;
    }

   
}
