package org.selenium.sdet;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;

public class ReadingDataFromXcel {
    public static void main(String[] args) throws Exception {

       try( FileInputStream FI = new FileInputStream("C:\\Users\\ritish_babu\\Documents\\data.xlsx")) {
           XSSFWorkbook workbook = new XSSFWorkbook(FI);
           XSSFSheet sheet = workbook.getSheet("Sheet1");
           int rows = sheet.getLastRowNum();
           int columns = sheet.getRow(1).getLastCellNum();

           System.out.println(rows);
           System.out.println(columns);

           for (int i = 0; i <= rows; i++) {
               XSSFRow row = sheet.getRow(i);
               for (int j = 0; j < columns; j++) {
                   XSSFCell cell = row.getCell(j);
                   System.out.print(cell.toString() + " ");
               }
               System.out.println();
           }

       }
    }
}
