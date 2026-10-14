package org.utility;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteData {
	public static void main(String[] args) throws IOException {

		File f = new File("C:\\Users\\admin\\eclipse-workspace\\InkSpiredBDD\\SourceFile\\inkspired.xlsx");
		Workbook book = new XSSFWorkbook();
		Sheet sheet = book.createSheet("Sheet1");
		Row r0 = sheet.createRow(0);
		Cell c0 = r0.createCell(0);
		Cell c1 = r0.createCell(1);
		Cell c2 = r0.createCell(2);
		Cell c3 = r0.createCell(3);
		Cell c4 = r0.createCell(4);
		Cell c5 = r0.createCell(5);
		Cell c6 = r0.createCell(6);
		Cell c7 = r0.createCell(7);
		
		c0.setCellValue("Sl.NO");
		c1.setCellValue("E-MAIL");
		c2.setCellValue("SHIPPINGNAME");
		c3.setCellValue("PHONENUMBER");
		c4.setCellValue("SHIPPINGADDRESS1");
		c5.setCellValue("SHIPPINADDRESS2");
		c6.setCellValue("CITY");
		c7.setCellValue("ZIP");

		Row r1 = sheet.createRow(1);
		Cell c10 = r1.createCell(0);
		Cell c11 = r1.createCell(1);
		Cell c12 = r1.createCell(2);
		Cell c13 = r1.createCell(3);
		Cell c14 = r1.createCell(4);
		Cell c15 = r1.createCell(5);
		Cell c16 = r1.createCell(6);
		Cell c17 = r1.createCell(7);
		
		c10.setCellValue("1");
		c11.setCellValue("praveenkumar@gmail.com");
		c12.setCellValue("praveenkumar");
		c13.setCellValue("1234567890");
		c14.setCellValue("14 Ridge Square NW");
		c15.setCellValue("Suite 500");
		c16.setCellValue("Washington");
		c17.setCellValue("9820001 ");
		
		FileOutputStream fo = new FileOutputStream(f);
		book.write(fo);

	}

}
