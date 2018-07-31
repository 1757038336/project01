package com.atguigu.bean;

import java.util.Scanner;

/**
 * @author zzj
 * @create 2018-07-29 23:54
 * 张志军
 */
public class Hello {
    public static void main(String[] args){
        int zzj=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入：");

        int p=sc.nextInt();
        if(p>=zzj){
            System.out.println(">>==>>");


        }else{
            System.out.println("<<<<<<");
        }
    }
}
