import java.io.File;
import java.io.FileNotFoundException; 
import java.util.Scanner; 
import java.io.FileWriter; 
import java.io.IOException; 
import java.io.BufferedWriter; 
import java.util.*;  


public class FileHandle{
    public static void main(String s[]){
        try {
            List<String> files=new ArrayList<String>();  
            files.add("file1.txt");
            files.add("file2.txt");

            for(String file:files){  
                File Obj = new File("data/"+file);
                Scanner Reader = new Scanner(Obj);
                while (Reader.hasNextLine()) {
                    String data = Reader.nextLine();
                    try{
                        FileWriter Writer = new FileWriter("data/merged.txt",true);
                        BufferedWriter bw = new BufferedWriter(Writer);
                        bw.write(data+"\n");
                        bw.close();
                    }           
                    catch (IOException e){
                        e.printStackTrace(); 
                    }    
                }
                Reader.close();
            }
            System.out.println("New File Created and Merged File 1 and File 2");
        }
        catch (FileNotFoundException e) {
            System.out.println("An error has occurred.");
            e.printStackTrace();
        }        
    }
}