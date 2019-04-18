import javax.xml.bind.SchemaOutputResolver;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a = 1;
        int m[] = {0,1,2};
        String hello = "Hello,world";
        System.out.println(hello);
        System.out.print("Введите значение :");
        Scanner sc = new Scanner (System.in);

        try {
            a = sc.nextInt();
            m[a] = 4 / a;
            System.out.println(m[a]);

            hello = null;
            hello.toString();
//            throw FactorialException();
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
//        catch (Exception e){
//            System.out.println("другая ошибка O_o ");
//        }
    }
}