/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Encapsulation;

import java.util.Scanner;

/**
 *
 * @author udiem
 */
public class sinhvien {

    //thuoc tinh(propeties)
    //4 pham vi truy cap
    private String name;
    private int age;
    private String diachi;
    private double mark;
    
    
    //chuot phai + insert code + get and set

    public sinhvien() {

    }

    public sinhvien(String name) {
        this.name = name;
    }

    public sinhvien(String name, int age, String diachi, double mark) {
        this.name = name;
        this.age = age;
        this.diachi = diachi;
        this.mark = mark;
    }

    //phuong thuc(method)
    public void an() {
        System.out.println("an com");
    }

    public void mota() {
        System.out.println(name + " - " + age + " - " + diachi + " - " + mark);
    }

    public void setMark(double mark) {
        if (mark >= 0 && mark <= 10) {
            this.mark = mark;
        }
    }

    public double getMark() {
        return this.mark;
    }

    public void input(Scanner sc) {
        System.out.println("Entername: ");
        this.name = sc.nextLine();
        System.out.println("Enter age: ");
        this.age = Integer.parseInt(sc.nextLine()); //truoc chuoi phai parse
        System.out.println("Enter diachi: ");
        this.diachi = sc.nextLine();
        System.out.println("Enter mark: ");
        this.mark = Double.parseDouble(sc.nextLine());
    }

    public void Output() {
        System.out.println(name + " - " + age + " - " + diachi + " - " + mark);
    }

}
//public double getArea