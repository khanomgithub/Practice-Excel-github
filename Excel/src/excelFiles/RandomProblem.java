package excelFiles;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class RandomProblem {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		System.out.println("how many random number you need");
		Scanner myobj=new Scanner(System.in);
		int n=myobj.nextInt();
		
		 // create instance of Random class 
		
        Set<Integer>myrandom=new TreeSet<Integer>();
		Random rand = new Random(); 

		for (int i=0;i<n;i++) {
			myrandom.add((rand.nextInt(1000)));
			      
		 }
		Object[] myarray=myrandom.toArray();
        System.out.println(myrandom);
        System.out.println(myrandom.size());
  
        //Write Formula
        XSSFWorkbook wb=new XSSFWorkbook();
        XSSFSheet wbs =wb.createSheet("RANDOM");
        
        for(int i=0;i<n;i++) {
        wbs.createRow(i).createCell(0).setCellValue(myarray[i].toString());
        }
        		//Cell c0=r0.createCell(0);
        
       // c0.setCellValue(myarray[0].toString());
        
        String path="C:\\Users\\Tahmina\\eclipse-workspace\\Excel\\data\\random.xlsx";
		File f=new File(path);
		FileOutputStream fis=new FileOutputStream(f);
		
		wb.write(fis);

        fis.close();
          } 
		

}


