package excelread;
import java.io.IOException;
public class ExcelMain {
public static void main(String[] args) throws IOException {
String s=ExcelCode.readStringData(1, 0);//first row first value
System.out.println(s);
String s1=ExcelCode.readIntegerData(1, 1);//first row second value
System.out.println(s1);
}
}

