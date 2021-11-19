import java.util.Scanner;
public class Desen {
    static void decrease(int n,int copy){
        System.out.print(n+" ");
        if(n==0 || n<0){
            increase(n+5,copy);
        }
        else{
            decrease(n-5,copy);
        }
    }

    static void increase(int n,int copy) {
        System.out.print(n + " ");
        if (n == copy) {
            return;
        } else {

            increase(n + 5, copy);


            }
        }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("N sayısını girin:");
        int input = scn.nextInt();
        int copy=input;
        decrease(input,copy);
    }
    }