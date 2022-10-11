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
public class Client implements Serializable {
    int Id;
    String name;
    String BirthDate;
    String Address;
    String phoneNumber;
    String Password;
public Client(){
Id = 0 ;
name = null ;
BirthDate = null ;
Address = null ;
Password = null ;
phoneNumber = null ;
}

public Client(int id, String n,String date, String add, String phone, String psw){
Id = id ;
name = n ;
BirthDate = date ;
Address = add ;
Password = psw ;
phoneNumber = phone ;
}
public static ArrayList<Client> ReadClients(){
    ArrayList<Client> Clients = new ArrayList<Client>();
    File f = new File("Client.txt");
         try
        {
            FileInputStream fis = new FileInputStream(f);
            ObjectInputStream ois = new ObjectInputStream(fis);
            Clients = (ArrayList) ois.readObject();  
            ois.close();
            fis.close();
        } 
        catch(IOException e){
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ModifyStock.class.getName()).log(Level.SEVERE, null, ex);
        }
    return Clients;
}
public static void SaveClients(ArrayList<Client> Clients){
    File f = new File("Client.txt");
        try{
        FileOutputStream fos = new FileOutputStream(f);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(Clients);
        }
        catch(FileNotFoundException ex){
        }
        catch(IOException e){
        }
}
}
