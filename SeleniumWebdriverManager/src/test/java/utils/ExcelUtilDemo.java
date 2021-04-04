package utils;

public class ExcelUtilDemo {

	public static void main(String[] args) {
		String path = System.getProperty("user.dir");
		ExcelUtils obj = new ExcelUtils(path+"\\excel\\data.xlsx", "sheet1");
		obj.countRow();
		obj.countColumn();
		obj.getCellData(0, 0);
		obj.getCellDataNumber(1, 1);
		
		
	}

}
