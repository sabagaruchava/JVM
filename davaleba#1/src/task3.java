import java.util.Scanner;

public class task3 {


    public static void main(String[] args) {
        int a,b;
        int[] array = new int[40];
        Scanner num = new Scanner(System.in);

        System.out.println("მინ.რიცხვი: ");
        a = num.nextInt();

        System.out.println("მახ.რიცხვი: ");
        b = num.nextInt();


        if(a>b){
            int z = a;
            a = b;
            b = z;
        }


        for(int i=0;i<40;i++) {
            int randoms = (int) (Math.random() * (b - a + 1) + a);
            array[i] = randoms;
        }


        int Even = 0;
        int Odd = 0;

        int Even_sum = 0;
        int Odd_sum = 0;

        for (int i : array) {
            if (i % 2 == 0) {
                Even++;
                Even_sum += i;
            } else {
                Odd++;
                Odd_sum += i;
            }
        }


        System.out.println("ლუწი რიცხვების რაოდენობა:" + Even);
        System.out.println("კენტი რიცხვების რაოდენობა:" + Odd);
        System.out.println("ლუწი რიცხვების ჯამი:" + Even_sum);
        System.out.println("კენტი რიცხვების ჯამი:" + Odd_sum);



    }

}