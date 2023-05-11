package com.automation.testcases;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataFromExcel {
    public static void main(String[] args) throws Exception {
        // Open Excel File
        XSSFWorkbook workbook = new XSSFWorkbook("src/test/resources/data/Data.xlsx");
        // Open Sheet File
         XSSFSheet sheet = workbook.getSheetAt(0);
        for(int i=0; i < sheet.getPhysicalNumberOfRows(); i++){
            XSSFRow row = sheet.getRow(i);
            XSSFCell column1   =   row.getCell(0);
            XSSFCell column2   =   row.getCell(1);
            System.out.println(column1.getStringCellValue()+ "    "+column2.getStringCellValue());
        }
    }
}
