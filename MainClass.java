/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mainclass;

/**
 *
 * @author Student
 */
import java.util.Scanner;

public class MainClass {
    
    public static void SignUp(){
    }
    public static void SignIn(){
    }
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        String firstname ;
        String lastname ;
        String username ;
        String password ;
        String phonenumber ;
        
        //Promt and Receiving user input
        System.out.print("\n-----Registration------\n");
        
        System.out.print("Enter First Name: ");
        firstname = input.nextLine();
        System.out.print("Enter Last Name: ");
        lastname = input.nextLine();
        System.out.print("Enter Username: ");
        username = input.nextLine();
        System.out.print("Enter Password: ");
        password = input.nextLine();
        System.out.print("Enter phone Number starting with (+27...): ");
        phonenumber = input.nextLine();
        
        Login login = new Login();
        
        boolean validatePhone = login.checkCellPhoneNumber(phonenumber);
        boolean validateUsername = login.checkUserName(username);
        boolean validatePassword = login.checkPasswordComplexity(password);
        
        //check and validate username
        if(validateUsername = true){
            System.out.println("Username succesfully captured. ");
        }else{
            System.out.println("Username is not correctly formatted, please ensure that your username contains an underscore and has five characters. ");
        }
        
        //check and validate password
        if(validatePassword = true){
            System.out.println("Password succesfully captured. ");
        }else{
            System.out.println("Password not correctly formatted, please ensure that password contains atleast eight characters. ");
        }
        
        //check and validate phone number
        if(validatePhone = true){
            System.out.println("Cell phone number succesfully added. ");
        }else{
            System.out.println("Cell phone number incorrectly formatted or does not contain international code. ");
        }
        System.out.println("\n-----Login Portal------");
        System.out.print("Enter Username:");
        String Username = input.nextLine();
        System.out.print("Enter Password:");
        String Password = input.nextLine();
        
        if(Username.equals(username) && Password.equals(password)) {
            System.out.println("Welcome," + firstname + " " + lastname + ",it is good seeing you again!!");
        }else{
            System.out.println("Incorrect Username or Password,please Try Again!!");
        }
        input.close();
        }    
        }
    

