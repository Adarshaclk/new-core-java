package com.java.exception.mail;

import com.java.exception.exceptions.EmailDomineException;
import com.java.exception.exceptions.InvaliedEmailFormateException;

import java.util.Scanner;

public class Email {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the valied email");
        String mail=scanner.nextLine();
        int day=100;
        try{
            if(mail.contains("@gmail.com")){
                System.out.println("your entered email is "+mail);
            }
            else{
                throw new InvaliedEmailFormateException("invalied email formate");
            }
            try {
                System.out.println("enter the present day ");
                int used=scanner.nextInt();
                if(used<100){
                    int rem=day-used;
                    System.out.println("your validity still remaining days "+rem);
                }
                else{
                    throw new EmailDomineException("your domine plan is completed ");
                }
            }
            catch (EmailDomineException e){
                System.out.println("error :"+e.getMessage());
            }
        }catch (InvaliedEmailFormateException e){
            System.out.println("error :"+e.getMessage());
        }
    }
}
