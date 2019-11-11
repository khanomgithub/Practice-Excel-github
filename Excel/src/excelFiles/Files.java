package excelFiles;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Files {

	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub
		//xls-HSSF api
		//xlsx-XSSF api
		
		String path="C:\\Users\\Tahmina\\eclipse-workspace\\Excel\\data\\study.xlsx";
		File f=new File(path);
		FileInputStream fis=new FileInputStream(f);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		
		XSSFSheet wbs= wb.getSheetAt(0);
		Row r0=wbs.getRow(0);
		Cell c0=r0.getCell(0);
		
		System.out.println(c0);
		
		fis.close();

	}

}
