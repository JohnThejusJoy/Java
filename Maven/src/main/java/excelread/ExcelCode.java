package excelread;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelCode {

static FileInputStream f;

static XSSFWorkbook w;

static XSSFSheet sh;

public static String readStringData(int row, int col) throws IOException {
	f = new FileInputStream("C:\\Users\\Thejus\\git\\Java\\Maven\\src\\main\\resources\\Book1.xlsx");//to enter into the file
w = new XSSFWorkbook(f); //load to memory through poi
sh = w.getSheet("Sheet1");//rep sheet1 in workbook
XSSFRow r = sh.getRow(row);//to get details in row based on row number
XSSFCell c = r.getCell(col);//to get details of cells in that column
return c.getStringCellValue();//to return valuein cell as String
}

public static String//same as above; one is for string one for int
readIntegerData(int row, int col) throws IOException {
	f = new FileInputStream("C:\\Users\\Thejus\\git\\Java\\Maven\\src\\main\\resources\\Book1.xlsx");
w = new XSSFWorkbook(f);
sh = w.getSheet("Sheet1");
XSSFRow r = sh.getRow(row);
XSSFCell c = r.getCell(col);
int val = (int) c.getNumericCellValue(); //convert double to int using typecasting
return String.valueOf(val);//convert int to string using valueOf() method
}
}