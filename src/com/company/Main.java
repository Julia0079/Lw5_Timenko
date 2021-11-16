package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.String;

public class Main {

    public static void main(String[] args) {
        int x,y,z,result;
        String str,strUrav;
        boolean UpRegister=false;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Введите число x: ");
            x = Integer.parseInt(reader.readLine());
            System.out.print("Введите число y: ");
            y = Integer.parseInt(reader.readLine());
            System.out.print("Введите число z: ");
            z = Integer.parseInt(reader.readLine());
            if(x>y && y>z && z>0){
                result = (int)(Math.pow(x,3)-y-Math.pow(z,2));
                strUrav = "x^3-y-z^2";
            }
            else if(y>x && x>=z){
                result = (int)(Math.pow(x,2)+y*z);
                strUrav = "x^2+y*z";
            }
            else if(z>=y && y>x){
                result = (int)(x*y+Math.pow(z,x));
                strUrav = "x*y+z^x";
            }
            else{
                result = -x-y-z;
                strUrav = "-x-y-z";
            }
            System.out.println("Уравнение за которым проводиться вычисление: "+strUrav);
            System.out.println("Результат вычисления: "+result);
            System.out.print("Введите строку, для проверки верхнего регистра: ");
            str = reader.readLine();
            for(byte i=0;i<str.length();i++){//перебираю каждый символ строки
                if(Character.isUpperCase(str.charAt(i))) UpRegister = true;//проверка условия для символа
            }
            if(UpRegister) System.out.println("Ответ: да, есть символы верхнего регистра");
            else System.out.print("Ответ: нет, нету символов верхнего регистра");

        }
        catch (Exception ex){
            System.out.print("Непрвильный формат ввода!");
        }
    }
}
