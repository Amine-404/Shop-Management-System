/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.mycompany.bop3.Book;
import com.mycompany.bop3.Employee;
import com.mycompany.bop3.ModifyStock;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author mzagh
 */
public class TestEmployee {
    
   @Test
public void TestSaveBooksAndReadEmployees(){
    Employee E1 = new Employee(1,"1","1","1","1","1");
    Employee E2 = new Employee(2,"2","2","2","2","2");
    ArrayList<Employee> ExptArrayEmployees = new ArrayList<Employee>();
    ExptArrayEmployees.add(E1);
    ExptArrayEmployees.add(E2);
    File f = new File("TestEmployee.txt");
        try{
        FileOutputStream fos = new FileOutputStream(f);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(ExptArrayEmployees);
        }
        catch(FileNotFoundException ex){
        }
        catch(IOException e){
        }
        ArrayList<Employee> ResultEmployees = new ArrayList<>();
    File f1 = new File("TestEmployee.txt");
         try
        {
            FileInputStream fis = new FileInputStream(f1);
            ObjectInputStream ois = new ObjectInputStream(fis);
            ResultEmployees = (ArrayList) ois.readObject();  
            ois.close();
            fis.close();
        } 
        catch(IOException e){
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ModifyStock.class.getName()).log(Level.SEVERE, null, ex);
            assertEquals(ExptArrayEmployees,ResultEmployees);
    }
}

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
