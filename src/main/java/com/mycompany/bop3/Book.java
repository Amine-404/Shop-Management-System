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


public class Book implements Serializable {
    int bookID;
    String bookName;
    int price;
    int copiesNumber;
    String authorName;
    String dateOfPublishing;
    public Book()
    {
        bookID = 0 ;
        bookName = null ;
        price = 0 ;
        copiesNumber = 0 ;
        authorName = null ;
        dateOfPublishing = null;
        
    }
    public Book(int n,String bName,int p,int cNum,String aName,String date)
    {
        bookID = n ;
        bookName = bName ;
        price = p ;
        copiesNumber = cNum ;
        authorName = aName ;
        dateOfPublishing = date;
    }
    public static ArrayList<Book> ReadBooks (){
    ArrayList<Book> Books = new ArrayList<>();
    File f = new File("Book.txt");
         try
        {
            FileInputStream fis = new FileInputStream(f);
            ObjectInputStream ois = new ObjectInputStream(fis);
            Books = (ArrayList) ois.readObject();  
            ois.close();
            fis.close();
        } 
        catch(IOException e){
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ModifyStock.class.getName()).log(Level.SEVERE, null, ex);
        }
    return Books; 
    }
    public static void SaveBooks(ArrayList<Book> Books){
        File f = new File("Book.txt");
        try{
        FileOutputStream fos = new FileOutputStream(f);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(Books);
        }
        catch(FileNotFoundException ex){
        }
        catch(IOException e){
        }
    }
}

