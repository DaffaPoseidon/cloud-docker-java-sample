import java.util.Scanner;

public class Aritmatika {

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        //System.out.println("Hello docker. :)");
    
        System.out.println("Dibajak oleh King Daffa Cahyo Alghifari");
        System.out.println("1941720104");
        System.out.println("05");

        System.out.print("Selamat datang di jumlah segitiga rusak! Berapa jumlahnya?: ");
        int jawab = sc.nextInt();

        for(int a = 0; a < jawab; a++){
            for(int i = 0; i < jawab; i++){
                System.out.println("");
                for(int j = 0; j < i; j++){
                    System.out.print("");
                }
                for(int k = 0; k < i; k++){
                    System.out.print("*");
                }
                for(int l = 0; l < i; l++){
                    System.out.print("*");
                }
            }
        }
    }
}
