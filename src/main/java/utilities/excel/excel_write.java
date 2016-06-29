package utilities.excel;
import java.io.File;
import java.io.FileOutputStream;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;


public class excel_write 
{
	public static void main(String[] args) throws Exception
	{
		
		File file = new File("../files/data.xls");
		String url = file.getAbsolutePath();
		url = url.replace("..\\", "");
		
		//create workbook in the excel file and store in writableworkbook obj
		WritableWorkbook wb=Workbook.createWorkbook(new FileOutputStream(url));
		//create worksheet in the workbook and store in writablesheet object
		WritableSheet ws=wb.createSheet("sample",0);
		//create a cell with data in worksheet
		ws.addCell(new Label(0,0,"selenium"));
		ws.addCell(new Label(0,1,"qtp"));
		ws.addCell(new Label(0,2,"java"));
		ws.addCell(new Label(0,3,"testing"));
		//write all data into workbook and close
		wb.write();
		wb.close();
		

	}

}
