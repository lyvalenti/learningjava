package com.company;

import com.somemalice.StringFun;

import java.util.Random;

public class OnlyVowels {
    public static void main(String args[]) {
        Random randy = new Random();
        int RANDYLENGTH = 200000;
        for (int j = 0; j < 4; j++) {
            StringBuffer sBuff = new StringBuffer(RANDYLENGTH);

            System.out.println("====== " + RANDYLENGTH + " =======");
            for (int i = 0; i < RANDYLENGTH ; i++) {
                int myInt = randy.nextInt(100);
                sBuff.append((char) myInt);
            }
            String finalString = sBuff.toString();
            for (int i = 0; i < 5; i++) {
                Long nowTime = System.currentTimeMillis();
                StringFun.reverseString(finalString);
                Long endTime = System.currentTimeMillis();
                System.out.println("Elapsed time " + (endTime - nowTime) + "ms");
            }

            //Now let's loop with it reduced by half
            RANDYLENGTH = RANDYLENGTH / 2;
        }



    }
}
