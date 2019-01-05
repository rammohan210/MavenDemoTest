package ApachePOI;
			

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

		public class ReadData 
		{
			public static void main(String[] args) throws IOException
			{				
				FileInputStream inputstream = null;
				XSSFWorkbook wb1 = null;
				 boolean bTag = false;
				try{					
					String Username;
					String Password;					
					
					File f1 = new File("C:\\Users\\Admin\\Desktop\\rummy.xlsx");
					inputstream = new FileInputStream(f1);
					wb1 = new XSSFWorkbook(inputstream);
					bTag = true;
					XSSFSheet ws1 = wb1.getSheet("Sheet1");
											
					int rowcount = ws1.getLastRowNum()+1;					
					System.out.println("Rowcount is: " + rowcount);
					for(int iRowIndex=1; iRowIndex<rowcount; iRowIndex++)
					{
						Row r1 = ws1.getRow(iRowIndex);
						Username = r1.getCell(0).getStringCellValue();
						Password = r1.getCell(1).getStringCellValue();
						System.out.println(Username + " ; " + Password);
					}					
				}				
				
				catch(IOException e)
				{
					System.out.println("File not found or unable to read/write data..");
				}
				
				catch(Exception e)
				{
					System.out.println("unknown exception");
				}
				
				finally
				{
					if(bTag)
					{
					wb1.close();
					inputstream.close();
					}
				}				
			}
	}
		
		
		
		


