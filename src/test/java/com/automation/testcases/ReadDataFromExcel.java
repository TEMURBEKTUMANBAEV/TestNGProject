package com.automation.testcases;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataFromExcel {
    public static void main(String[] args) throws Exception {
        // Open Excel File
        XSSFWorkbook workbook = new XSSFWorkbook("data/Data.xlsx");
         XSSFSheet sheet = workbook.getSheetAt(0);
        XSSFRow row = sheet.getRow(0);
    }
}
