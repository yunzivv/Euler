package org.example;

import java.io.IOException;

// project Euler 44
public class Euler {
    public static void main(String[] args) throws IOException {

        long n = 40756;

        while(true){
            if(Util.getTriangularIndex(n) != -1
            && Util.getPentagonalIndex(n) != -1
            && Util.getHexagonalIndex(n) != -1){
                System.out.println(n);
                break;
            }

            n++;
        }

    }

}