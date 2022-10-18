import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        int number = input.nextInt();
        System.out.println("Girilen sayı : " + number);
        int [] list = {15,12,788,1,-1,-778,2,0};

        int min = list[0];
        int max = list[0];

        Arrays.sort(list);
        for (int i : list){
            if (i<number){
                min = i;
            }
            if (i>number){
                max = i;
                break;
            }
        }
        System.out.println("Girilen sayıya en yakın büyük sayı : " + max);
        System.out.println("Girilen sayıya en yakın küçük sayı : " + min);
    }
}