package com.mycompany.bop3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author mzagh
 */
public class Employee implements Serializable {
    int Id;
    String name;
    String BirthDate;
    String Address;
    String phoneNumber;
    String Salary;
    
public Employee(){
Id = 0 ;
name = null ;
BirthDate = null ;
Address = null ;
Salary = null ;
phoneNumber = null ;
}

public Employee(int id, String n,String date, String add, String income, String phone){
Id = id ;
name = n ;
BirthDate = date ;
Address = add ;
Salary = income ;
phoneNumber = phone ;
}
public static void SaveEmployees(ArrayList<Employee> Employees){
    File f = new File("Employees.txt");
        try{
        FileOutputStream fos = new FileOutputStream(f);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(Employees);
        }
        catch(FileNotFoundException ex){
        }
        catch(IOException e){
        }
}
public static ArrayList<Employee> ReadEmployees(){
    ArrayList<Employee> Employees = new ArrayList<Employee>();
    File f = new File("Employees.txt");
         try
        {
            FileInputStream fis = new FileInputStream(f);
            ObjectInputStream ois = new ObjectInputStream(fis);
            Employees = (ArrayList) ois.readObject();  
            ois.close();
            fis.close();
        } 
        catch(IOException e){
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ModifyStock.class.getName()).log(Level.SEVERE, null, ex);
        }
    return Employees;
}
}