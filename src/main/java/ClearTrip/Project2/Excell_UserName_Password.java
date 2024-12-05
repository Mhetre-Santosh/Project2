package ClearTrip.Project2;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;

public class Excell_UserName_Password {

	static String Mob_Number;
	static String Incorrect_MOB_Number;
	public void LoginData () throws EncryptedDocumentException, IOException
	{
		FileInputStream x = new FileInputStream("C:\\Users\\Santosh\\eclipse-workspace\\SeleniumBasics\\DDT\\Santosh DDT.xlsx");
		Workbook w = WorkbookFactory.create(x);
		Mob_Number= NumberToTextConverter.toText(w.getSheet("ClearTrip").getRow(0).getCell(0).getNumericCellValue());
		Incorrect_MOB_Number=NumberToTextConverter.toText(w.getSheet("ClearTrip").getRow(1).getCell(0).getNumericCellValue());
	}
}
