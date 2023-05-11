package com.automation.testcases;

import com.ebay.LoginFeatures;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;

public class DataDrivenTestWithExcel {

    LoginFeatures loginFeature = new LoginFeatures();

    @Test(dataProvider = "invalidData")
    public void verifyLoginUnsuccessfulWithInvalidCredentials(String username, String password) {
        // Testing the Method with Test Data
        boolean result = loginFeature.doLogin(username, password);

        // Checking the output
        Assert.assertEquals(result, false);
    }

    @DataProvider(name = "invalidData")
    public Object[][] getInvalidData() throws IOException {

        Object[][] credentials= new Object[10][2];

        // Open Excel File
        XSSFWorkbook workbook = new XSSFWorkbook("src/test/resources/data/Data.xlsx");

        // Open Excel Sheet
        XSSFSheet sheet = workbook.getSheetAt(0);

        for(int i=0; i < sheet.getPhysicalNumberOfRows(); i++){
            XSSFRow row = sheet.getRow(i);
            XSSFCell column1   =   row.getCell(0);
            XSSFCell column2   =   row.getCell(1);
            credentials[i][0] = column1.getStringCellValue();
            credentials[i][1] = column2.getStringCellValue();
        }

        return credentials;
    }

    @Test
    public void verifyLoginSuccessfulWithValidCred() {

    }
}