import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.google.common.collect.Table.Cell;


public class ReadDemo {

	public static void main(String[] args) throws FileNotFoundException {
		FileInputStream fis=new FileInputStream("");
		Workbook w= WorkbookFactory.create(fis);
		Sheet sh=w.getSheet("Sheet1");
		Row firstRow=sh.getRow(0);
		int  rowCount=sh.getPhysicalNumberOfRows();
		for(int i=0;i<rowCount;i++){
			for(int j=0; j<firstRow.getLastCellNum(); j++){
				Cell cl=sh.getRow(i).getCell(j);
				System.out.println(cl);
				
			}
		}
		
		// TODO Auto-generated method stub

	}

}
