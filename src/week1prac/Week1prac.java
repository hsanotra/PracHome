/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week1prac;

import java.util.Scanner;

/**
 *
 * @author HONEY
 */
public class Week1prac 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
          Scanner sc=new Scanner(System.in);
        System.out.println("Enter  the word :");
       String word=sc.next();
       char [] list=new char[word.length()];
       for(int i=0;i<word.length();i++)
       {
           list[i]=word.charAt(i);
       }
        for(int i=list.length-1;i>=0;i--)
        {
            System.out.print(list[i]);
        }

       
    }
    
}
