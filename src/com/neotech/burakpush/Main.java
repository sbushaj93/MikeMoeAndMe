import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kac adet sayi gireceksiniz : ");
      int n= scanner.nextInt();
        int min=0;
        int max=0;
        int number;
        int i;
      for (i=1; i<=n ; i++){
            System.out.println(i+ ". sayiyi giriniz. : ");
number = scanner.nextInt();
if(number<min || min==0){
    min=number;

}
if (number>max){
    max=number;

}
        }
        System.out.println("Girilen sayilar arasinda en kucuk sayi : "+min);
        System.out.println("Girilen sayilar arasinda en buyuk sayi:  "+max);
    }
}