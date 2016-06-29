package utilities.xmlRead.xls2xml;

import java.io.*;

import org.apache.poi.ss.usermodel.*;

import java.text.*;

public class ConvertXLStoXML {

	static DecimalFormat df = new DecimalFormat("#####0");

	public static void main(String[] args) {

		FileWriter fostream;

		PrintWriter out = null;

		String strOutputPath = "src/xls2xml";

		String strFilePrefix = "_Converted";

		try {

			InputStream inputStream = new FileInputStream(new File("src\\xls2xml\\AdilTestCases.xlsx"));

			System.out.println("After file read");

			Workbook wb = WorkbookFactory.create(inputStream);

			Sheet sheet = wb.getSheet("texta");

			System.out.println("After texta");

			fostream = new FileWriter(strOutputPath + "/" + strFilePrefix + ".xml");

			out = new PrintWriter(new BufferedWriter(fostream));

			out.println("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");

			out.println("<testsuite name=\"\" >");

			String firstColValue, secondColValue, previousTitle;

			previousTitle = "previous";

			// boolean firstRow = true;

			for (Row row : sheet) {

				/*
				 * if (firstRow == true) {
				 * 
				 * firstRow = false;
				 * 
				 * continue;
				 * 
				 * }
				 */

				firstColValue = formatCell(row.getCell(0)).trim();

				secondColValue = formatCell(row.getCell(1)).trim();

				if (firstColValue.isEmpty() && secondColValue.isEmpty())

				{

					out.println("");

				}

				else if (firstColValue.equals("Test Case") && previousTitle.equals("Expected"))

				{

					out.println("\t\t\t</expectedresults>");

					out.println("\t\t\t</step>");

					out.println("\t\t</steps>");

					out.println("\t</testcase>");

					out.print("\t<testcase\t id=" + secondColValue + "\t");

				}

				else if (firstColValue.equals("Test Case"))

				{

					out.print("\t<testcase\t id=" + secondColValue + "\t");

				}

				else if (firstColValue.equals("Test Case Name"))

				{

					out.println("name=" + secondColValue + ">");

				}

				else if (firstColValue.equals("Test Case Desc"))

				{

					out.println("\t\t<summary>" + secondColValue + "</summary>");

				}

				else if (firstColValue.equals("Test Case Pre-Con"))

				{

					out.println("\t\t<preconditions>" + secondColValue + "</preconditions>");

				}

				else if (firstColValue.equals("Procedure"))

				{

					out.println("\t\t<steps>");

					out.println("\t\t\t<step>");

					out.println("\t\t\t<step_number>1</step_number>");

					out.println("\t\t\t<actions>" + secondColValue + "</actions>");

				}

				else if (firstColValue.equals("Expected"))

				{

					out.println("\t\t\t<expectedresults>" + secondColValue);

				}

				else if (previousTitle.equals("Expected") && !secondColValue.isEmpty())

				{

					out.println("\t\t\t" + secondColValue);

				}

				/*
				 * else if (firstColValue.isEmpty()&&
				 * previousTitle.equals("Expected")&&secondColValue.isEmpty())
				 * 
				 * {
				 * 
				 * out.println("\t\t\t</expectedresults>");
				 * 
				 * out.println("\t\t\t</step>");
				 * 
				 * out.println("\t\t</steps>");
				 * 
				 * out.println("second column is "+secondColValue);
				 * 
				 * }
				 */

				else if (firstColValue.isEmpty() && previousTitle.equals("Expected") && secondColValue.isEmpty())

				{

				}

				if (!firstColValue.isEmpty())

				{

					previousTitle = firstColValue;

				}

				// out.println(formatElement("\t\t", "ID",
				// formatCell(row.getCell(0))));

				// out.println(formatElement("\t\t", "Variable",
				// formatCell(row.getCell(1))));

				// out.println("\t</DCT>");

			}

			out.write("</testsuite>");

			out.flush();

			out.close();

		} catch (Exception e) {

			e.printStackTrace();

		}

	}

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

			return ConvertXLStoXML.df.format(cell.getNumericCellValue());

		case Cell.CELL_TYPE_STRING:

			return cell.getStringCellValue();

		default:

			return "<unknown value>";

		}

	}

}
