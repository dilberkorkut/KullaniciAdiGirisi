import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName, password, select, newPassword;

        Scanner input = new Scanner(System.in);


        System.out.print("Kullanici Adi: ");
        userName = input.nextLine();
        System.out.print("Sifrenizi Giriniz: ");
        password = input.nextLine();


        if (userName.equals("patika") && password.equals("java123")) {
            System.out.println("Giris Yapildi");
        } else if (userName.equals("patika") && (!password.equals("java123"))) {
            System.out.println("Hatali sifre.Sifrenizi sifirlamak ister misiniz? e/h ");
            System.out.print("Seciminiz? ");
            select = input.nextLine();

            if (select.equals("e") || (select.equals("E"))) {
                System.out.print(" Yeni sifre giriniz: ");
                newPassword = input.nextLine();

                if (!newPassword.equals("java123")) {
                    System.out.println("Yeni sifreniz basarili bir sekilde olusturuldu.");
                } else {
                    System.out.println("yeni sifre eskisiyle ayni olamaz.lutfen tekrar deneyiniz.");
                }


            } else if (select.equals("h") || (select.equals("H"))) {
                System.out.println("sayfadan cikiyorsunuz.");
            } else {
                System.out.println("lutfen sadece e veya h harfler'nden birine basiniz.");
            }
        }
    }
}

