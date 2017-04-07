package presentation;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Lanceur {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File f = new File("chaton.jpg");
		FileInputStream fr = new FileInputStream(f);
		
		File f2 = new File("fichier.jpg"); //renvoie des entiers : code binaire de chaque lettre
		FileOutputStream fw = new FileOutputStream (f2);
		
		
		int c;
		while((c=fr.read())!=-1)
		{
			System.out.println(c);
			fw.write(c+1);
		}
		
		fr.close();
		fw.close();

		
		File f4 = new File("fichier.jpg");
		FileInputStream fr1 = new FileInputStream(f4);
		File f3 = new File("fichier2.jpg");
		FileOutputStream fw2 = new FileOutputStream(f3);
		
		
		int y;
		while ((y=fr1.read())!=-1)
		{
			fw2.write(y-1);
		}
		
		
		
		fr1.close();
		fw2.close();
	}

}
