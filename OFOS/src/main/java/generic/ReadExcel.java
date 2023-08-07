package generic;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 * 
 * @author Yogita
 *
 */

public class ReadExcel implements FrameworkConstants{

	public Workbook workbook;
	public static File filePath=new File(EXCEL_PATH);

	public String getData(String sheet, int row, int column) throws IOException {

		FileInputStream fis = new FileInputStream(filePath);
		workbook=WorkbookFactory.create(fis);
		Cell cell=workbook.getSheet(sheet).getRow(row).getCell(column);
		return cell.getStringCellValue();
	}

	public static String[][] getMultipleData(String sheetName) throws IOException {

		FileInputStream fis=new FileInputStream(filePath);

		 
		Workbook book=new XSSFWorkbook(fis);
		Sheet sheet=book.getSheet(sheetName);
		int row_count=sheet.getPhysicalNumberOfRows();
			
		int col_count=sheet.getRow(0).getPhysicalNumberOfCells();
		
		String[][] data=new String[row_count][col_count];
		
		for(int r=1;r<=row_count-1;r++) {
			Row row=sheet.getRow(r);
			for(int c=0;c<row.getLastCellNum();c++) {
				data[r-1][c]=row.getCell(c).toString();
				System.out.println(data[r-1][c]);
			}
		}
		book.close();
		return data;
	}
	
	public static Object[][] multipleData(String sheetname) throws EncryptedDocumentException, IOException
	{
		File file = new File(EXCEL_PATH);
		FileInputStream fis = new FileInputStream(file);
		Workbook book = WorkbookFactory.create(fis);
		Sheet sheet = book.getSheet(sheetname);
		int row = sheet.getPhysicalNumberOfRows();
		int cell = sheet.getRow(0).getPhysicalNumberOfCells();
		
		Object[][] data = new Object[row-1][cell];
		for(int i=1;i<row;i++)
		{
			for(int j=0;j<cell;j++)
			{
				data[i-1][j]=sheet.getRow(i).getCell(j).toString();
			}
		}
		return data;
		
		
		
	}
	

	
	

}
