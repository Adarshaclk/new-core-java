package com.Java;

import com.exception.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;


public class ExceptionHandling {
    public static void main(String[] args) throws InvalidNameException,IncompleteTaskException,InvalidAgeCheckException,LoginStatusException,PaymentStatusException,ProductAvailabilityException,InvalidProfileException,
            OtpValidationException,IOException,FileNotFoundException,SQLException,ClassNotFoundException,InterruptedException,NullPointerException,ArithmeticException,IllegalArgumentException{
        ExceptionHandling runner=new ExceptionHandling();
        runner.Namecheck();
        runner.taskcheck();
        runner.agecheckforvote();
        runner.loginstatuscheck();
        runner.paymentstatuscheck();
        runner.productavailabilitycheck();
        runner.profileCompleteCheck();
        runner.otpValidationCheck();
        runner.inputoutexception();
        runner.filenotfound();
        runner.sqlexception();
        runner.classnotfound();
        runner.interrupted();
        runner.nullPointerExample();
        runner.arithmeticExample();
        runner.illegalArgumentExample();
    }
    public void Namecheck() throws InvalidNameException {
        String name="Pruthvi";
        if(name.length()<3){
            throw new InvalidNameException("Name Length should be Greater then 3 char");
        }
        else{
            System.out.println("Name is saved");
        }
    }
    public void taskcheck() throws IncompleteTaskException {
        boolean task=true;
        if(!task){
            throw new IncompleteTaskException("Task is not complted");
        }
        else{
            System.out.println("Task is completed");
        }
    }
    public void agecheckforvote()throws InvalidAgeCheckException {
        int age=13;
        if(age<18){
            throw  new InvalidAgeCheckException("your not eligible for vote");
        }
        else{
            System.out.println("your can vote");
        }
    }
    public void loginstatuscheck() throws LoginStatusException {
        boolean login=true;
        if(!login){
            throw new LoginStatusException("Your not logged in");
        }
        else{
            System.out.println("your are successfully logged in");
        }
    }
    public void paymentstatuscheck() throws PaymentStatusException {
        boolean payment=true;
        if(!payment){
            throw new PaymentStatusException("Payment is Failed");
        }
        else{
            System.out.println("payment is success");
        }
    }
    public void productavailabilitycheck() throws ProductAvailabilityException{
        boolean product=true;
        if(!product){
            throw new ProductAvailabilityException("Product is not available now");
        }
        else{
            System.out.println("Product is available");
        }
    }
    public void profileCompleteCheck() throws InvalidProfileException{
        boolean profile=true;
        if(!profile){
            throw new InvalidProfileException("Profile is not verified");
        }
        else{
            System.out.println("Profile is valid and verified");
        }
    }
    public void otpValidationCheck() throws OtpValidationException{
        boolean otp=true;
        if(!otp){
            throw new OtpValidationException("Wrong OTP");
        }
        else{
            System.out.println("You Have Entered Right OTP");
        }
    }
    public void inputoutexception() throws IOException{
        boolean input=true;
        if(!input){
            throw new IOException();
        }
    }
    public void filenotfound() throws FileNotFoundException {
        boolean file=true;
        if(!file){
            throw new FileNotFoundException();
        }
    }
    public void sqlexception() throws SQLException{
        boolean sqlexception=true;
        if(!sqlexception){
            throw new SQLException();
        }
    }
    public void classnotfound() throws ClassNotFoundException{
        boolean classfound=true;
        if (!classfound) {
            throw new ClassNotFoundException();
        }
    }
    public void interrupted() throws InterruptedException{
        boolean interrupted=true;
        if(!interrupted){
            throw new InterruptedException();
        }
    }
    public void nullPointerExample() throws NullPointerException {
        String data = null;
        if (data == null) {
            throw new NullPointerException("Data is null");
        }
    }
    public void arithmeticExample() throws ArithmeticException{
        int divisor = 0;
        if (divisor == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
    }
    public void illegalArgumentExample() throws IllegalArgumentException{
        int age = -1;
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        }
    }


}