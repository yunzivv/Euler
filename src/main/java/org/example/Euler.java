package org.example;

// project Euler 33
public class Euler {
    public static void main(String[] args) {

        long m = 1;
        long s = 1;

        for (int i = 20; i <= 99; i++) {
            for (int j = 10; j < i; j++) {

                int it = i / 10, io = i % 10;
                int jt = j / 10, jo = j % 10;

                boolean ok = false;

                if (io == jt && io != 0) ok |= (long)j * it == (long)i * jo;
                if (it == jo && it != 0) ok |= (long)j * io == (long)i * jt;
                if (io == jo && io != 0) ok |= (long)j * it == (long)i * jt;
                if (it == jt && it != 0) ok |= (long)j * io == (long)i * jo;

                if (ok) {
                    m *= i;
                    s *= j;
                }
            }
        }

        for(int i = 2; i <= m; i++){
            while(m % i == 0 && s % i == 0){
                m /= i;
                s /= i;
            }
        }

        System.out.println(m);
    }
}