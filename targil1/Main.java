package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        MobilePhone[] phones = new MobilePhone[3];
        phones[0] = new Android("blue", 2.3, 5.325f);
        phones[1] = new Iphone("black", 2.5, 14.023f);
        phones[2] = new Lumia("white", 2.4, 6.354f);
        for (int i = 0; i < phones.length; i++) {
            printPhoneData(phones[i]);
        }


    }

    public static void printPhoneData(MobilePhone m) {
        if (m instanceof Android) {
            Android android = (Android) m;
            System.out.println(android.getAndroidOs());
        } else if (m instanceof Iphone) {
            Iphone iphone = (Iphone) m;
            iphone.getIphoneOs();
        } else if (m instanceof Lumia) {
            Lumia lumia = (Lumia) m;
            lumia.getMsOs();
        }
        else
        {
            throw new ClassCastException("unknown class"); //we will learn later what that mean.
        }
    }
}