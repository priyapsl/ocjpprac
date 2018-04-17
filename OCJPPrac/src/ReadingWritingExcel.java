import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;





import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ReadingWritingExcel {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		File file1 = new File("./ExcelFile/631Fp13IF15th_Build_Test_cases.xlsx");
		
		InputStream input = new FileInputStream(file1);
		Workbook wb = new XSSFWorkbook(input);
		Sheet sh = wb.getSheet("Testcases");
		
		
		for(int i = sh.getFirstRowNum();i<=sh.getLastRowNum(); i++)
		{
			Row row1 = sh.getRow(i);
			  
			for(int j=row1.getFirstCellNum(); j<= row1.getLastCellNum();j++)
			{
				
				Cell cell1 = row1.getCell(j);
				//System.out.println(cell1.getRowIndex());
				System.out.println("The Test case number is " +cell1.getRichStringCellValue() + "Testcase objective" +cell1.getRichStringCellValue()+"Test case Steps" +cell1.getRichStringCellValue());
			}
		
		
	}

}
}
