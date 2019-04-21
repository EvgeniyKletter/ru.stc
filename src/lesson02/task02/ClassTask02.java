package lesson02.task02;

import java.util.Random;

/**
 * создаю 30 рандомных чисел
 * получаю значение(k[i]) квадратного корня из полученых чисел(n[i])
 * получаю (q) значение квадрата целой части от k[i]
 * если квадрат целой части q числа равен k, то вывожу сообщение "Совпадение № z: q
 */
public class ClassTask02 {
    public void Task02(){
        int [] n ;
        n = new int[30];
        double [] k ;
        k = new double[30];
        int q;
        int z = 1;

        Random random = new Random();
        for (int i = 0; i < 30 ; i++) {

            n[i] = random.nextInt(100);
//           System.out.println("n"+ i +"=" + n[i] +  " : ");
            k[i] = Math.sqrt(n[i]);
            q = (int)Math.sqrt(k[i]) * (int)Math.sqrt(k[i]);
//            System.out.println("znach q =" + q );
            if (k[i] == q) {
                System.out.println("Совпадение №" + z +": " + q);
                z = z + 1;
            }
        }

        if (z == 1) {
            System.out.println("Совпадений нет =/ ");
        }
    }
}
