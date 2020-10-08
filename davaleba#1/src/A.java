import java.util.Scanner;
/* დავალება 2 */
public class A {

    int x;
    String hello;


    public A(String phrase) {
        hello = phrase;
    }

    public static void main(String[] args) {
        B constructor = new B("Hello");
        System.out.println(constructor.hello);

        constructor.method_first();
        constructor.method_second();
        constructor.method_third();
        constructor.b_method_first();
        constructor.b_method_second();
    }

    /*მეთოდი 1*/
    public void method_first() {
        Scanner number = new Scanner(System.in);
        System.out.println("X მნიშვნელობა: ");
        x = number.nextInt();
    }

    /*მეთოდი 2*/
    public void method_second() {
        System.out.println(x+12);
    }

    /*მეთოდი 3*/
    public void method_third() {
        if (x % 2 == 0) {
            System.out.println("X არის ლუწი");
        } else {
            System.out.println("X არის კენტი");
        }
    }
}