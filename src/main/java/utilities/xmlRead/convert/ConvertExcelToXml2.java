package utilities.xmlRead.convert;

import java.text.*;
import java.util.*;
import java.io.*;
import org.apache.poi.ss.usermodel.*;

public class ConvertExcelToXml2 {
    
    
    static DecimalFormat df = new DecimalFormat("#####0");

    public int testCaseCount(){
        int count = 0;
        
        return count;
    }

    public static void main(String[] args) {

        FileWriter fostream;

        PrintWriter out = null;

        String strOutputPath = "/Users/adilh/Desktop";

        String strFilePrefix = "AdilTests9";
        boolean moreExpectedresults = false, moreProcedure = false;
        String steps[][]= new String [10][2];
        LinkedList<String> procList = new LinkedList<String>();
        LinkedList<String> expList = new LinkedList<String>();
        Object[] procArray, expArray;

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
            int stepcount=0;
            
            
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
                   // procList.add(secondColValue);
                	steps[0][0]=secondColValue;
                	stepcount=1;

                }
                
                else if (previousTitle.equals("Procedure"))

                {
                  //  procList.add(secondColValue);
                	steps[1][0]= secondColValue;
                    moreProcedure = true;;
                    stepcount++;
                }
                
                else if(!secondColValue.isEmpty() && moreProcedure)

                {
                   // procList.add(secondColValue);
                	steps[stepcount][0]= secondColValue;
                    moreProcedure = true;
                }
                
            
                else if (firstColValue.equals("Expected"))

                {
                	steps[0][1]=secondColValue;
                	stepcount=1;
                  //  expList.add(secondColValue);
                	
                }

                else if (previousTitle.equals("Expected") &&!secondColValue.isEmpty() )

                {
                   // expList.add(secondColValue);
                    moreExpectedresults = true;

                }
                else if(!secondColValue.isEmpty() && moreExpectedresults)
                {
                    expList.add(secondColValue);
                    moreExpectedresults = true;
                }

                else if (firstColValue.isEmpty()&&previousTitle.equals("Expected")&&secondColValue.isEmpty())

                {
                }  
                
//                else if (firstColValue.equals("Expected") &&secondColValue.isEmpty() )
//                {
//                    out.print("\t\t\t<![CDATA[No Steps");
//                }
                if(!firstColValue.isEmpty())

                {

                    previousTitle=firstColValue;

                }
                
                procArray = procList.toArray();
                expArray = expList.toArray();
                int length = procArray.length;
                
                out.println("\t<steps>");
                for(int i = 0, j = length - 1; i<length; i++, j--){
                    
                    out.println("\t\t<step>");
                    out.println("\t\t\t<step_number><![CDATA[1]]></step_number>");
                    out.println("\t\t\t<actions><![CDATA["+procArray[i]+"]]></actions>");
                    out.println("\t\t\t<expectedresults><![CDATA["+expArray[j]+"]]></expectedresults>");
                    out.println("\t\t\t<execution_type><![CDATA[1]]></execution_type>");
                    out.println("\t\t</step>");
                }
                
                out.println("\t</steps>");
                

              
            }
            
            
        
            
            out.write("\n\t</testcase>\n</testsuite>");

            out.flush();

            out.close();

        } catch (Exception e) {

            e.printStackTrace();

        }

    }


//    private static int randomID() {
//        Set<Integer> set = new HashSet<Integer>();
//            Random randGen = new Random();
//            int x = 0, randNum = randGen.nextInt();
//            
//            if(set.add(randNum))
//                 x = randNum;
//            else
//                randomID();    
//            return x;
//    }

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

                return ConvertExcelToXml2.df.format(cell.getNumericCellValue());

            case Cell.CELL_TYPE_STRING:

                return cell.getStringCellValue();

            default:

                return "<unknown value>";

        }

    }
    

}