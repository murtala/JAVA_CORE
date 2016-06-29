package utilities;

import java.text.*;
import java.util.*;
import java.io.*;
import org.apache.poi.ss.usermodel.*;

public class ConvertExcelToXml {
	
	
	static DecimalFormat df = new DecimalFormat("#####0");

	public int testCaseCount(){
		int count = 0;
		
		return count;
	}

    public static void main(String[] args) {

        FileWriter fostream;

        PrintWriter out = null;

        String strOutputPath = "/Users/adilh/Desktop";

        String strFilePrefix = "AdilTests8";
        boolean moreExpectedresults = false;


        try {

            InputStream inputStream = new FileInputStream(new File("AdilTestCases2.xlsx"));

            System.out.println("After file read");

            Workbook wb = WorkbookFactory.create(inputStream);

            Sheet sheet = wb.getSheet("texta");

            System.out.println("After texta");

            fostream = new FileWriter(strOutputPath + "/" + strFilePrefix+ ".xml");

            out = new PrintWriter(new BufferedWriter(fostream));


            out.println("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");

            out.println("<testsuite name= \"Assessment\">");
            out.println("\t<node_order><![CDATA[1]]></node_order>");
            out.println("<details><![CDATA[]]>\n</details>");

            String firstColValue, secondColValue, previousTitle;

            previousTitle="previous";

//            boolean firstRow = true;

            for (Row row : sheet) {

                firstColValue=formatCell(row.getCell(0)).trim();

                secondColValue=formatCell(row.getCell(1)).trim();

                if (firstColValue.isEmpty()&&secondColValue.isEmpty())

                {}

                else if(firstColValue.equals("Test Case")&&(previousTitle.equals("Expected") || moreExpectedresults))

                {
	                out.println("\t\t\t]]></expectedresults>");
	                out.println("\t\t\t<execution_type><![CDATA[1]]></execution_type>");
	
	                out.println("\t\t\t</step>");
	
	                out.println("\t\t</steps>");
	
	                out.println("\t</testcase>");
	
	                out.print("\t<testcase internalid = \""+secondColValue+"\"\t");
	                moreExpectedresults = false;

                }

                else if(firstColValue.equals("Test Case"))

                {

                	out.print("\t<testcase internalid =\""+secondColValue+"\"\t");

                }

                else if (firstColValue.equals("Test Case Name"))

                {
                	String newSecondValue = "";
                	if(secondColValue.contains("&")){
                		newSecondValue = secondColValue.replace("&", "&amp;");
                		out.println("name= \""+newSecondValue+"\">");
                	}
                	else
                		out.println("name= \""+secondColValue+"\">");
                }

                else if (firstColValue.equals("Test Case Desc"))

                {

                out.println("\t\t<node_order><![CDATA[10]]></node_order>");
                out.println("\t\t<!--externalid><![CDATA[13507]]></externalid-->");
                out.println("\t\t<version><![CDATA[1]]></version>");
                out.println("\t\t<summary><![CDATA["+secondColValue+"]]></summary>");
                }

                else if (firstColValue.equals("Test Case Pre-Con"))

                {

                out.println("\t\t<preconditions><![CDATA[ "+secondColValue+"]]></preconditions>");
                out.println("\t\t<execution_type><![CDATA[1]]></execution_type>");
                out.println("\t\t<importance><![CDATA[3]]></importance>");

                }

                else if (firstColValue.equals("Procedure"))

                {

                out.println("\t\t<steps>");

                out.println("\t\t\t<step>");

                out.println("\t\t\t\t<step_number><![CDATA[1]]></step_number>");

                out.println("\t\t\t\t<actions><![CDATA[ "+secondColValue+"]]></actions>");
                //out.println("\t\t\t\t<expectedresults><![CDATA[ ");

                }
            
                else if (firstColValue.equals("Expected"))

                {

                out.println("\t\t\t\t<expectedresults><![CDATA[ "+secondColValue);
                
                }

                else if (previousTitle.equals("Expected") &&!secondColValue.isEmpty() )

                {

                	out.println("\t\t\t"+secondColValue);
                	moreExpectedresults = true;

                }
                else if(!secondColValue.isEmpty() && moreExpectedresults)
                {
                	out.println("\t\t\t"+secondColValue);
                }

                else if (firstColValue.isEmpty()&&previousTitle.equals("Expected")&&secondColValue.isEmpty())

                {
                }  
                
                else if (firstColValue.equals("Expected") &&secondColValue.isEmpty() )
                {
                	out.print("\t\t\t<![CDATA[No Steps");
                }
                if(!firstColValue.isEmpty())

                {

                	previousTitle=firstColValue;

                }

              //  out.println(formatElement("\t\t", "ID", formatCell(row.getCell(0))));

               // out.println(formatElement("\t\t", "Variable", formatCell(row.getCell(1))));

               // out.println("\t</DCT>");

            }
            
        	
        
            out.write("\t\t\t\t]]></expectedresults>");
        	out.write("\n\t\t\t<execution_type><![CDATA[1]]></execution_type>");
        	out.write("\n\t\t\t</step>");
            out.write("\n\t\t</steps>");
            out.write("\n\t</testcase>\n</testsuite>");

            out.flush();

            out.close();

        } catch (Exception e) {

            e.printStackTrace();

        }

    }


//    private static int randomID() {
//		Set<Integer> set = new HashSet<Integer>();
//			Random randGen = new Random();
//			int x = 0, randNum = randGen.nextInt();
//			
//			if(set.add(randNum))
//				 x = randNum;
//			else
//				randomID();	
//			return x;
//	}

	private static String formatCell(Cell cell)

    {

        if (cell == null) {

            return "";

        }

        switch(cell.getCellType()) {

            case Cell.CELL_TYPE_BLANK:

                return "";

            case Cell.CELL_TYPE_BOOLEAN:

                return Boolean.toString(cell.getBooleanCellValue());

            case Cell.CELL_TYPE_ERROR:

                return "*error*";

            case Cell.CELL_TYPE_NUMERIC:

                return ConvertExcelToXml.df.format(cell.getNumericCellValue());

            case Cell.CELL_TYPE_STRING:

                return cell.getStringCellValue();

            default:

                return "<unknown value>";

        }

    }
	

}
