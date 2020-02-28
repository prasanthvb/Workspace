package leaftab;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
	
	public static Object[][] readdata() throws IOException{
		
		XSSFWorkbook wbook = new XSSFWorkbook("./DataSheets/CreateLead.xlsx");
		XSSFSheet sheet = wbook.getSheetAt(0);
		int rownum = sheet.getLastRowNum();
		int CellNum = sheet.getRow(0).getLastCellNum();
		
		String[][] data= new String[rownum][CellNum];
		System.out.println(rownum);
		System.out.println(CellNum);
		for (int i = 1; i <= rownum; i++) {
			
			XSSFRow row = sheet.getRow(i);
			
			for (int j = 0; j < CellNum; j++) {
				
				XSSFCell cell = row.getCell(j);
				data[i-1][j] = cell.getStringCellValue();
				
			}
			
		}
		
		
		wbook.close();
		return data;
		
	}

	
}