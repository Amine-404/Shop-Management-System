/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.mycompany.bop3.Book;
import com.mycompany.bop3.CustomComparator;
import com.mycompany.bop3.ModifyStock;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
/**
 *
 * @author mzagh
 */
public class TestBook {
    public TestBook() {
    }
@Test
public void TestSaveBooksAndReadBooks(){
    Book B1 = new Book(1,"1",1,1,"1","1");
    Book B2 = new Book(2,"2",2,2,"2","2");
    ArrayList<Book> ExptArrayBooks = new ArrayList<>();
    ExptArrayBooks.add(B2);
    ExptArrayBooks.add(B1);
    File f = new File("TestBook.txt");
        try{
        FileOutputStream fos = new FileOutputStream(f);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(ExptArrayBooks);
        }
        catch(FileNotFoundException ex){
        }
        catch(IOException e){
        }
        ArrayList<Book> ResultBooks = new ArrayList<>();
    File f1 = new File("TestBook.txt");
         try
        {
            FileInputStream fis = new FileInputStream(f1);
            ObjectInputStream ois = new ObjectInputStream(fis);
            ResultBooks = (ArrayList) ois.readObject();  
            ois.close();
            fis.close();
        } 
        catch(IOException e){
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ModifyStock.class.getName()).log(Level.SEVERE, null, ex);
            assertEquals(ExptArrayBooks,ResultBooks);
    }
}
@Test
public void TestSort(){
    Book B1 = new Book(1,"1",1,1,"1","1");
    Book B2 = new Book(2,"2",2,2,"2","2");
    ArrayList<Book> ExptArrayBooks = new ArrayList<>();
    ExptArrayBooks.add(B2);
    ExptArrayBooks.add(B1);
    Collections.sort(ExptArrayBooks, new CustomComparator());
    assertEquals(B1,ExptArrayBooks.get(0));
    assertEquals(B1,ExptArrayBooks.get(1));
}

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
