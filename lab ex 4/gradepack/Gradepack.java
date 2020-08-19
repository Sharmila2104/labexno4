/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gradepack;
import year1.year1marks;
import year2.year2mark;
import java.util.Scanner;
/**
 *
 * @author sharmila
 */
public class Gradepack {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the total number of students");
        int n=s.nextInt();
        int a[]=new int[n];
        for (int i = 1; i <= n; i++) 
        {
        System.out.println("\nenter the name of the student :"+i);
        String name=s.next();
        System.out.println("enter the roll no");
        int roll=s.nextInt();
        int sub1,sub2,sub3,sub4;
        System.out.println("enter the two subject marks of year1:");
        sub1=s.nextInt();
        sub2=s.nextInt();
        year1marks obj=new year1marks();
        obj.getmarks(sub1,sub2);
        System.out.println("\nenter the two subject marks of year2:");
        sub3=s.nextInt();
        sub4=s.nextInt();
        year2mark obj1=new year2mark();
        obj.getmarks(sub3,sub4);
        }
    }
    
}
class student
{
    int roll_no;
    String name;

}
