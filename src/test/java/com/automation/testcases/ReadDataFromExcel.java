package com.automation.testcases;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataFromExcel {
    public static void main(String[] args) throws Exception {
        XSSFWorkbook workbook = new XSSFWorkbook("data/Data.xlsx");

    }
}
