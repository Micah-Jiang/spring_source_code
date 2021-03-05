package com.micah.spring;

import java.util.Scanner;

/**
 * @Author m.kong
 * @Date 2021/3/2 下午10:46
 * @Version 1.0
 */
public class Ai {
    public static void main(String[] args) {
        System.out.print("问：");
        Scanner scanner = new Scanner(System.in);
        String str;
        while(true){
            str = scanner.next();
            str = str.replace("吗？","");
            str = str.replace("?","!");
            str = str.replace("?", "!");
            System.out.print("\n答:" + str + "\n问：");
        }
    }
}
