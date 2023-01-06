import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName,password,select, newPassword;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Kullanıcı Adınızı Giriniz : ");
        userName = scanner.nextLine();

        System.out.print("Şifrenizi Giriniz : ");
        password = scanner.nextLine();

        if(userName.equals("patika")) {
            if (password.equals("java123")){
                System.out.println("Giriş Yaptınız!");
            }
            else {
                System.out.println("Şifreniz yanlış!!!");

                System.out.print("Şifrenizi sıfırlamak istermisiniz ? (Evet yada Hayır) :");
                select = scanner.nextLine();

                if (select.equals("Evet")){
                    System.out.print("Yeni Şifrenizi Giriniz : ");
                    newPassword = scanner.nextLine();

                    System.out.println("Şifreniz Değiştirilmiştir!");
                    System.out.println("Yeni Şifreniz : " + newPassword);
                }
                else if(select.equals("Hayır")){
                    System.out.println("İyi Günler");
                }
                else {
                    System.out.println("Geçersiz İşlem");
                }


            }
        }else {
            System.out.println("Kullanıcı Adınız Yanlış!!!");
        }
    }
}
