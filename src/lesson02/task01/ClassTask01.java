package lesson02.task01;

import java.util.Scanner;

/**
 *
 */
public class ClassTask01 {
    public void Task01(){
        int a = 1;
        int m[] = {0,1,2};
        String hello = "Hello,world";


        System.out.print("Введите значение :");
        Scanner sc = new Scanner (System.in);

        try {
            a = sc.nextInt();
            m[a] = 4 / a;
            System.out.println(m[a]);

            hello = null;
            hello.toString();
            String TestParm;
            int num;

        }
        catch (ArithmeticException e){
            System.out.println("ArithmeticException ");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException ");
        }
        catch (NullPointerException e){
            System.out.println("NullPointerException ");
        }
        finally {
            System.out.println("finally! ");
        }

    }
}
