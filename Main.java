import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        //Değişkenin tanımlanması.

        int n;
        int total=0;

        //Sayının girilmesi ve d0-while döngüsü işlemi.

        Scanner scan=new Scanner(System.in);

        do {
            System.out.print("Sayı giriniz: ");
            n = scan.nextInt();
            if(n % 4 == 0){
                total +=n;
            }
        }while(n % 2 != 1);

        //Toplamın yazılması.

        System.out.println("Toplam: " +total);
    }
}
