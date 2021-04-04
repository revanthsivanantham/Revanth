package utils;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {

	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	
	ExcelUtils(String excelpath, String sheetname)
	{
		try{
			//Creating Reference for workbook.
			workbook = new XSSFWorkbook(excelpath);
			sheet = workbook.getSheet(sheetname);
		}
		catch(Exception exp)
		{
			System.out.println("Exception message is "+exp.getMessage());
			System.out.println("Cause message is "+exp.getCause());
		}
	}
	
	public static void main(String[] args) {
		//countRow();
		//getCellData(0,0);
		//getCellDataNumber(1,1);
	}

	public static int countRow(){

			int noOfRows = sheet.getPhysicalNumberOfRows(); 
			System.out.println("Rows count is "+noOfRows);
			return noOfRows;
	}
	
	public static int countColumn(){

		int noOfColumns = sheet.getRow(0).getPhysicalNumberOfCells();
		System.out.println("Columns count is "+noOfColumns);
		return noOfColumns;
}
	
	public static String getCellData(int rowNum, int columnNum)
	{
			String cellData = sheet.getRow(rowNum).getCell(columnNum).getStringCellValue();
			//System.out.println("Cell data is "+cellData);
			return cellData;
	}
	
	public static void getCellDataNumber(int rowNum, int columnNum)
	{
			double cellDatanumber = sheet.getRow(rowNum).getCell(columnNum).getNumericCellValue();
			System.out.println("Cell data(no) is "+cellDatanumber);
	}

}
