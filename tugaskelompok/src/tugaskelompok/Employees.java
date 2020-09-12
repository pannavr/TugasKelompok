package tugaskelompok;

import java.util.ArrayList;
import java.util.Scanner;
/**
 * 
 * @author panna & yogi
 */
public class Employees {

    static Scanner in = new Scanner(System.in);
    static ArrayList<String> id = new ArrayList<>();
    static ArrayList<String> firstName = new ArrayList<>();
    static ArrayList<String> lastName = new ArrayList<>();
    static ArrayList<String> usernameArr = new ArrayList<>();
    static ArrayList<String> passwordArr = new ArrayList<>();

    public static void tambahemployee() {
        int a = id.size();
        int idbaru = 1 + a++;
        String addZero = String.format("%05d", idbaru);
        id.add(addZero);
        System.out.print("Nama Lengkap    : ");
        String namaAsli = in.nextLine();
        //input password
         System.out.print("Password        : ");
        String pas = in.nextLine();
        //mendapat hashe password;
        String passHashe = pas;
        String getSalt = BCrypt.gensalt();
        String hashePass = BCrypt.hashpw(pas, getSalt);
        passwordArr.add(hashePass);
        try {  // untuk mendapatkan nama yang cuma satu kata
        // first name 
        String seprator = " ";
        int sepPos = namaAsli.lastIndexOf(seprator);
        String namaDepan = namaAsli.substring(0, sepPos);
        firstName.add(namaDepan);
        //menambahkan nama belakang 
        String namaAkhir = namaAsli.substring(namaAsli.lastIndexOf(' '));
        lastName.add(namaAkhir);
        //String  namaLengkap = in.nextLine();             
       
        //username input username
        String user = namaAkhir.substring(0, 3);
        String[] values = namaAsli.split(" ", 2);
        String satu = values[0];
        String dua = values[1];
        String userFix = satu + user;
        //menghilangkan space pada username
        userFix = userFix.replaceAll("\\s", "");
         boolean userInput = false;
          for (int i = 0; i <= id.size(); i++) {
              try {
                  
            if (usernameArr.get(i).equals(userFix)) {
                //jika memiliki nama user sama maka akan maka akan berubah
               String namaTengah = dua.substring(0, 3);
              String userBaru = satu + namaTengah;
                userBaru = userBaru.replaceAll("\\s", "");
              usernameArr.add(userBaru);
                 userInput = true;
                return;
        } } catch (Exception e) {
              }
        } usernameArr.add(userFix);
       } catch (Exception e) { 
           // untuk mendapatkan nama yang cuma satu kata
            // first name 

        firstName.add(namaAsli);
        //menambahkan nama belakang 
    
        lastName.add(namaAsli);        
       
        //username input username
          usernameArr.add(namaAsli);
        
        }
    }

        // menampilka employee
    public static void lihatemployee() {
        for (int i = 0; i < id.size(); i++) {
              System.out.println("=====================");
            System.out.println("ID = " + id.get(i));
            System.out.println("Nama depan = " + firstName.get(i));
            System.out.println("Nama Akhir = " + lastName.get(i));
            System.out.println("Username = " + usernameArr.get(i));
            System.out.println("Password : " + passwordArr.get(i));
              System.out.println("=====================");
        }
    }
    // fungsi login
    public static void login() {
        System.out.print("Username    : ");
        String username = in.nextLine();
        System.out.print("Password    : ");
        String password = in.nextLine();
        try {
            
       // fungsi cek variable
        if (BCrypt.checkpw(password, passwordArr.get(usernameArr.indexOf(username)))) {
            System.out.println("Login Berhasil!!");
        }else{
            System.out.println("Login Gagal!!");
        } } catch (Exception e) {
            System.out.println("Username tidak ada");
        }
    }

}
