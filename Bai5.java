package javaClass.Bai5;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Bai5 {
    private static ArrayList<Integer> arrayListA = new ArrayList<>();
    private static ArrayList<Integer> arrayListB = new ArrayList<>();
    public Bai5(){
        arrayListA.add(2);
        arrayListA.add(1);
        arrayListA.add(3);
        arrayListA.add(4);
        arrayListB.add(1);
        arrayListB.add(2);
        arrayListB.add(3);
        arrayListB.add(4);
        arrayListB.add(5);
        arrayListB.add(6);
    }
    public void intersection(){
        for (Integer integer: arrayListA) {
            for (Integer integer1: arrayListB) {
                if (Objects.equals(integer, integer1)){
                    System.out.print(integer + " ");
                }
            }
        }
    }
    public void merge(){
        arrayListA.sort(((o1, o2) -> o1 - o2));
        arrayListB.sort(((o1, o2) -> o2 - o1));
        for (Integer i : arrayListA) {
            System.out.print(i + " ");
        }
        for (Integer a: arrayListB) {
            System.out.print(a + " ");
        }
    }
    public void menu(){
        System.out.println("1. intersection\n2. merge\n3. Exit");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bai5 bai5 = new Bai5();
        while (true){
            int chon = sc.nextInt();
            switch (chon){
                case 1:
                    bai5.intersection();
                    bai5.menu();
                    break;
                case 2:
                    bai5.merge();
                    bai5.menu();
                    break;
                case 3:
                    System.exit(0);
            }
        }
    }
}

