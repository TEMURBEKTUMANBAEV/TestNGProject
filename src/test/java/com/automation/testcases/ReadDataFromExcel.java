package com.automation.testcases;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataFromExcel {
    public static void main(String[] args) throws Exception {
        // Open Excel File
        XSSFWorkbook workbook = new XSSFWorkbook("data/Data.xlsx");
        // Open Sheet File
         XSSFSheet sheet = workbook.getSheetAt(0);
         //Open Row File
        XSSFRow row = sheet.getRow(0);
        //Open Cell File
        XSSFCell cell = row.getCell(0);

        System.out.println(cell.getStringCellValue());
    }
}
