/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package B;

/**
 *
 * @author moatasem
 */
public class Main {
    
      public static void main(String[] args) {
 
        // Employee من الكلاس e هنا قمنا بإنشاء الكائن
        Employee e = new Employee();
 
        // Setter من خلال دوال الـ e هنا قمنا بوضع قيم لخصائص الكائن
        e.setName("Mohamad");
        e.setAge(21);
        e.setSalary(1500);
 
        // Getter من خلال دوال الـ e هنا قمنا بعرض قيم خصائص الكائن
        System.out.println("Name: "   +e.getName());
        System.out.println("Age: "    +e.getAge());
        System.out.println("Salary: " +e.getSalary());
 
    }
    
}
