package ApachePOI;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

	public class WriteData 
	{
		public static void main(String[] args) throws IOException 
		{
			File f1 = new File("D:\\HRM1.xlsx");
			FileInputStream inputstream = new FileInputStream(f1);
			XSSFWorkbook wb1 = new XSSFWorkbook(inputstream);
			XSSFSheet sheet = wb1.getSheet("Sheet1");
			Cell c1 = sheet.getRow(1).getCell(2);
			if(c1==null)
			{
				c1 = sheet.getRow(1).createCell(2);
			}
			c1.setCellValue("invalid id, please try again");
			inputstream.close();
			
			FileOutputStream outputstream = new FileOutputStream(f1);
			wb1.write(outputstream);
			wb1.close();
			outputstream.close();
		}

	}

