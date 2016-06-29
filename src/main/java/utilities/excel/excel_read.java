package utilities.excel;

import java.io.File;
import java.io.FileInputStream;

import jxl.Sheet;
import jxl.Workbook;




public class excel_read
{

	public static void main(String[] args) throws Exception
	{
		File file = new File("../files/data.xls");
		String url = file.getAbsolutePath();
		url = url.replace("..\\", "");
		
		
		//get the file for reading
		FileInputStream fs=new FileInputStream(url);
		//get workbook in the file
		Workbook wb=Workbook.getWorkbook(fs);
		//get sheet in the workbook
		Sheet ws=wb.getSheet(0);
		//for all the rows
		for(int r=0;r<ws.getRows();r++)
		{
			System.out.println(ws.getCell(0, r).getContents());
		}
		wb.close();
		

	}

}
