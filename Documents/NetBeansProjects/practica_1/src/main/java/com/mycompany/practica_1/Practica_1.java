/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practica_1;
import java.util.Scanner;
import java.util.regex.MatchResult;
/**
 *
 * @author PC
 */
public class Practica_1 {

    public static void main(String[] args) {
      int num=0; 
   System.out.println("ingrese el numero");
   
   Scanner sc = new Scanner(System.in);
   num = sc.nextInt();
   
   System.out.println("el numero"+num +"es binario?");
   System.out.println(revisarnumbin(num));
    }
   static boolean revisarnumbin(int n){
      while(n!=0){ 
       if (n%10>1) {
           return false;
       }
       
       n = n/10;
       }
     return true;
     
   }    
    }

