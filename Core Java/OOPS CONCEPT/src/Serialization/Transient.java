package Serialization;
import java.io.*;
public class Transient implements Serializable 
{
	int i = 10, j = 20; 
	  
    // Transient variables 
    transient int k = 30; 
  
    // Use of transient has no impact here 
    transient static int l = 40; 
    transient final int m = 50; 
  
    public static void main(String[] args) throws Exception 
    { 
    	Transient input = new Transient(); 
  
        // serialization 
        FileOutputStream fos = new FileOutputStream("D:\\Yash\\Java\\Core Java\\OOPS CONCEPT\\src\\Serialization\\pqr.txt"); 
        ObjectOutputStream oos = new ObjectOutputStream(fos); 
        oos.writeObject(input); 
  
        // de-serialization 
        FileInputStream fis = new FileInputStream("D:\\Yash\\Java\\Core Java\\OOPS CONCEPT\\src\\Serialization\\pqr.txt"); 
        ObjectInputStream ois = new ObjectInputStream(fis); 
        Transient output = (Transient)ois.readObject(); 
        System.out.println("i = " + output.i); 
        System.out.println("j = " + output.j); 
        System.out.println("k = " + output.k); 
        System.out.println("l = " + output.l);   
        System.out.println("m = " + output.m); 
	

}
}
