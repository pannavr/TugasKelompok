package tugaskelompok;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author panna & yogi
 * 
 * Employees mengelola data employee
 */
public class Employees {

    static Scanner in = new Scanner(System.in);
    static ArrayList<String> id = new ArrayList<>();
    static ArrayList<String> firstName = new ArrayList<>();
    static ArrayList<String> lastName = new ArrayList<>();
    static ArrayList<String> usernameArr = new ArrayList<>();
    static ArrayList<String> passwordArr = new ArrayList<>();

    /**
     * menambahkan data employee dan generate id employee,<br />
     * nama depan,nama belakang, username dan hashed password.<br />
     * yang kemudian disimpan kedalam ArrayList;
     * 
     * @param namaAsli	nama lengkap employee <br />
     * (ex : Naufal Aji Widodo) 
     * @param pas	password yang akan digunakan untuk login
     * 
     */
    public static void tambahemployee(String namaAsli, String pas) {
        //manipulasi string idemployee
        int a = id.size();
        String addZero = String.format("%05d", 1 + a++);
        id.add(addZero);
        //mendapat hash password;
        String hashePass = BCrypt.hashpw(pas, BCrypt.gensalt());
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
                        String namaTengah = dua.substring(0, 2);
                        String userBaru = satu + namaTengah;
                        userBaru = userBaru.replaceAll("\\s", "");
                        usernameArr.add(userBaru);
                        userInput = true;
                        return;
                    }
                } catch (Exception e) {
                }
            }
            usernameArr.add(userFix);
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

    /**
     * menampilkan generate data employee yang telah di input<br />
     * pada Employees.tambahemployee secara berurutan sesuai <br />
     * dengan Id Employee.<br />
     * 
     * @serialData  Id Employee<br />
     * @serialData  Nama Depan<br />
     * @serialData  Nama Belakang<br />
     * @serialData  Username<br />
     * @serialData  Hashed Password<br />
     */
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

    /**
     * login dengan username dan password, pengecekan password<br />
     * menggunakan BCrypt.checkpw.<br />
     * jika login berhasil print Login Berhasil!!<br />
     * jika login gagal print Login Gagal!!<br />
     * 
     * @param username  bisa dilihat di Employees.lihatemployee<br />
     * @param password  diinput pada Employees.tambahemployee<br />
     * 
     * @exception Username tidak ada
     */
    public static void login(String username, String password) {
        try {

            // fungsi cek variable
            if (BCrypt.checkpw(password, passwordArr.get(usernameArr.indexOf(username)))) {
                System.out.println("Login Berhasil!!");
            } else {
                System.out.println("Login Gagal!!");
            }
        } catch (Exception e) {
            System.out.println("Username tidak ada");
        }
    }

}
