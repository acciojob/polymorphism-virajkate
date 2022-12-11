package com.driver;
import java.util.Scanner;
public class Main {
    public static class Product{
        public int product(int x,int y){
            return x*y;
        }
        public int product(int x,int y,int z){
            return x*y*z;
        }
        public static double product(double x,double y){
            return x*y;
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Product p=new Product();
        p.product(1,2);
        p.product(1,2,1);
        p.product(1.2,1.4);
    }
}