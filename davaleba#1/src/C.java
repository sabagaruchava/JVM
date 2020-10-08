import java.util.Scanner;
/* დავალება 1 */
public class C {
    public static void main(String[] args){
        int a;
        int b;
        int c;
        Scanner number  = new Scanner(System.in);

    /* მეთოდი 1 */
        System.out.println("მეთოდი 1");
        System.out.println("A მნიშვნელობა:");
        a = number.nextInt();

        System.out.println("B მნიშვნელობა:");
        b = number.nextInt();

        System.out.println("C მნიშვნელობა:");
        c = number.nextInt();

    /* მეთოდი 2 */
        int method_second = a % 10;
        System.out.println("მეთოდი 2: " + method_second);

    /* მეთოდი 3 */
        int method_third = b;
        while (method_third > 9) {
            method_third /= 10;
        }
        System.out.println("მეთოდი 3: " + method_third);

    /* მეთოდი 4 */
        int method_fourth, nashti, sum = 0;
        method_fourth = c;
        if ((method_fourth / 10) == 0) {
            sum = c;
        } else {
            while (method_fourth > 0) {
                nashti = method_fourth%10;
                sum = sum+nashti;
                method_fourth = method_fourth/10;
            }
        }
        System.out.println("მეთოდი 4: " + sum);

    /* მეთოდი 5 */
        int method_five = method_second * method_third;
        System.out.println("მეთოდი 5: " + method_five);

    /* მეთოდი 6 */
        System.out.println("მეთოდი 6: " + method_third + method_five);
    }
}
