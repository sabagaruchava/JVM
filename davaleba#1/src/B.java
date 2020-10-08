import java.util.Scanner;
/* დავალება 2 */
class B extends A {

    int y;

    public B(String phrase) {
        super(phrase);
    }

    /*მეთოდი 1*/
    public void b_method_first() {
        Scanner number = new Scanner(System.in);
        System.out.println("Y მნიშვნელობა: ");
        y = number.nextInt();
    }

    /*მეთოდი 2*/
    public void b_method_second() {
        System.out.println("X+Y=" + (x+y));
    }
}