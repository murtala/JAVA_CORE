package utilities.xmlRead.convert;

import java.text.*;
import java.util.*;
import java.io.*;
import org.apache.poi.ss.usermodel.*;

public class ConvertExcelToXml1 {

	static DecimalFormat df = new DecimalFormat("#####0");

	public int testCaseCount() {
		int count = 0;

		return count;
	}

	public static void main(String[] args) {
		int jump = 0;
		int num = 2;
		List<String> plist = new ArrayList<String>();
		List<String> elist = new ArrayList<String>();

		FileWriter fostream;

		PrintWriter out = null;

		String strOutputPath = "F:/Users/Mobile/White Box/Xls2Xml/src/convert/";

		String strFilePrefix = "AdilTests9";
		boolean moreExpectedresults = false;

		try {

			InputStream inputStream = new FileInputStream(new File(
					"F:/Users/Mobile/White Box/Xls2Xml/src/convert/AdilTestCases2.xlsx"));

			System.out.println("After file read");
			
			Workbook wb = WorkbookFactory.create(inputStream);

			Sheet sheet = wb.getSheet("texta");

			System.out.println("After texta");

			fostream = new FileWriter(strOutputPath + "/" + strFilePrefix + ".xml");

			out = new PrintWriter(new BufferedWriter(fostream));

			System.out.println("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
			System.out.println("<testsuite name= \"Assessment\">");
			System.out.println("\t<node_order><![CDATA[1]]></node_order>");
			System.out.println("<details><![CDATA[]]>\n</details>");

			String firstColValue, secondColValue, previousTitle;

			previousTitle = "previous";

			for (Row row : sheet) {

				firstColValue = formatCell(row.getCell(0)).trim();

				secondColValue = formatCell(row.getCell(1)).trim();

				if (firstColValue.isEmpty() && !secondColValue.isEmpty() && previousTitle.equals("Procedure"))

				{
					plist.add(secondColValue);
				} else

				if (firstColValue.isEmpty() && !secondColValue.isEmpty() && previousTitle.equals("Expected"))

				{
					elist.add(secondColValue);
				}

				else if (firstColValue.equals("Test Case") && (previousTitle.equals("Expected"))) {
					for (int i = 0; i < jump; i++) {
						System.out.println("\t\t\t<step>");
						System.out.println("\t\t\t\t<step_number><![CDATA[" + (num + i) + "]]></step_number>");
						System.out.println("\t\t\t\t<actions><![CDATA[ " + plist.get(i) + "]]></actions>");
						System.out.println("\t\t\t\t<expectedresults><![CDATA[ " + elist.get(i) + "]]></expectedresults>");
						System.out.println("\t\t\t\t<execution_type><![CDATA[1]]></execution_type>");
						System.out.println("\t\t\t</step>");
					}
					System.out.println("\t\t</steps>");
					System.out.println("\t</testcase>");
					out.print("\t<testcase internalid =\"" + secondColValue + "\"\t");
					//System.out.println("\t\t</steps>");

				}

				else if (firstColValue.equals("Test Case"))

				{

					out.print("\t<testcase internalid =\"" + secondColValue + "\"\t");

				}

				else if (firstColValue.equals("Test Case Name"))

				{
					String newSecondValue = "";
					if (secondColValue.contains("&")) {
						newSecondValue = secondColValue.replace("&", "&amp;");
						System.out.println("name= \"" + newSecondValue + "\">");
					} else
						System.out.println("name= \"" + secondColValue + "\">");
				}

				else if (firstColValue.equals("Test Case Desc"))

				{

					System.out.println("\t\t<node_order><![CDATA[10]]></node_order>");
					System.out.println("\t\t<!--externalid><![CDATA[13507]]></externalid-->");
					System.out.println("\t\t<version><![CDATA[1]]></version>");
					System.out.println("\t\t<summary><![CDATA[" + secondColValue + "]]></summary>");

				}

				else if (firstColValue.equals("Test Case Pre-Con"))

				{

					System.out.println("\t\t<preconditions><![CDATA[ " + secondColValue + "]]></preconditions>");
					System.out.println("\t\t<execution_type><![CDATA[1]]></execution_type>");
					System.out.println("\t\t<importance><![CDATA[3]]></importance>");

				}

				else if (firstColValue.equals("Procedure"))

				{

					System.out.println("\t\t<steps>");

					System.out.println("\t\t\t<step>");

					System.out.println("\t\t\t\t<step_number><![CDATA[1]]></step_number>");

					System.out.println("\t\t\t\t<actions><![CDATA[ " + secondColValue + "]]></actions>");
					
					jump++;

				}

				else if (firstColValue.equals("Expected"))

				{
					System.out.println("\t\t\t\t<expectedresults><![CDATA[ " + secondColValue + "]]></expectedresults>");
					System.out.println("\t\t\t\t<execution_type><![CDATA[1]]></execution_type>");
					System.out.println("\t\t\t</step>");
					//System.out.println("\t\t</steps>");

				}

				else if (previousTitle.equals("Expected") && !secondColValue.isEmpty())

				{

					moreExpectedresults = false;

				} else if (!secondColValue.isEmpty() && moreExpectedresults) {
					System.out.println("\t\t\t" + secondColValue);
				}

				else if (firstColValue.isEmpty() && previousTitle.equals("Expected") && secondColValue.isEmpty())

				{
				}

				else if (firstColValue.equals("Expected") && secondColValue.isEmpty()) {
					out.print("\t\t\t<![CDATA[No Steps");
				}
				if (!firstColValue.isEmpty())

				{

					previousTitle = firstColValue;

				}

			}
			System.out.println("\n\t\t\t<step>");

			System.out.println("\t\t\t\t<expectedresults><![CDATA[No Steps]]></expectedresults>");
			System.out.println("\n\t\t\t<execution_type><![CDATA[1]]></execution_type>");
			System.out.println("\n\t\t\t</step>");
			System.out.println("\n\t\t</steps>");
			System.out.println("\n\t</testcase>\n</testsuite>");

			out.flush();

			out.close();

		} catch (Exception e) {

			e.printStackTrace();

		}

	}

	// private static int randomID() {
	// Set<Integer> set = new HashSet<Integer>();
	// Random randGen = new Random();
	// int x = 0, randNum = randGen.nextInt();
	//
	// if(set.add(randNum))
	// x = randNum;
	// else
	// randomID();
	// return x;
	// }

	private static String formatCell(Cell cell)

	{

		if (cell == null) {

			return "";

		}

		switch (cell.getCellType()) {

		case Cell.CELL_TYPE_BLANK:

			return "";

		case Cell.CELL_TYPE_BOOLEAN:

			return Boolean.toString(cell.getBooleanCellValue());

		case Cell.CELL_TYPE_ERROR:

			return "*error*";

		case Cell.CELL_TYPE_NUMERIC:

			return ConvertExcelToXml1.df.format(cell.getNumericCellValue());

		case Cell.CELL_TYPE_STRING:

			return cell.getStringCellValue();

		default:

			return "<unknown value>";

		}

	}

}
