/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.mycompany.bop3.Client;
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
public class TestClient {
    
@Test
public void TestSaveBooksAndReadClients(){
    Client C1 = new Client(1,"1","1","1","1","1");
    Client C2 = new Client(2,"2","2","2","2","2");
    ArrayList<Client> ExptArrayClients = new ArrayList<Client>();
    ExptArrayClients.add(C1);
    ExptArrayClients.add(C2);
    File f = new File("TestClient.txt");
        try{
        FileOutputStream fos = new FileOutputStream(f);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(ExptArrayClients);
        }
        catch(FileNotFoundException ex){
        }
        catch(IOException e){
        }
        ArrayList<Client> ResultClients = new ArrayList<>();
    File f1 = new File("TestClient.txt");
         try
        {
            FileInputStream fis = new FileInputStream(f1);
            ObjectInputStream ois = new ObjectInputStream(fis);
            ResultClients = (ArrayList) ois.readObject();  
            ois.close();
            fis.close();
        } 
        catch(IOException e){
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ModifyStock.class.getName()).log(Level.SEVERE, null, ex);
            assertEquals(ExptArrayClients,ResultClients);
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
}