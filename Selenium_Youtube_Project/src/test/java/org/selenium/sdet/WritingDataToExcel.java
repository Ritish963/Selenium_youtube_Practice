package org.selenium.sdet;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;

public class WritingDataToExcel {
    public static void main(String[] args) throws Exception {

        XSSFWorkbook book = new XSSFWorkbook();
        XSSFSheet sheet = book.createSheet("data");
      XSSFRow row1=  sheet.createRow(0);
        row1.createCell(0).setCellValue("java");
        row1.createCell(1).setCellValue("17");
        row1.createCell(2).setCellValue(200);

        XSSFRow row2 =  sheet.createRow(1);
        row2.createCell(0).setCellValue("Python");
        row2.createCell(1).setCellValue("19");
        row2.createCell(2).setCellValue(300);

        XSSFRow row3 =  sheet.createRow(2);
        row3.createCell(0).setCellValue(".Net");
        row3.createCell(1).setCellValue("20");
        row3.createCell(2).setCellValue(400);

        FileOutputStream file = new FileOutputStream("C:\\Users\\ritish_babu\\Documents\\myFIle.xlsx");
        book.write(file);




    }
}
