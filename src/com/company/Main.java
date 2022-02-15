package com.company;

public class Main {

    public static void main(String[] args) {
	 Father ObjectA = new Father(EyeColor.BLUE, "Аскат", 41, new Job("Бизнесмен"));
     Son ObjectB = new Son(EyeColor.BROWN, "Амир", 17, new Job("Продавец шаурмы"));
     Son ObjectC = new Son(EyeColor.GRAY, "Алинур", 20, new Job("Преподаватель английского языка"));

        ObjectA.getInfo();
        System.out.println("----------------");
        ObjectB.getInfo();
        System.out.println("----------------");
        ObjectC.getInfo();

    }
}
