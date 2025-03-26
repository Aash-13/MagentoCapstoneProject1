package com.Magento.StepDefinition;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.Assert;

import com.Magento.Pages.HomePage;
import com.Magento.Pages.SigninPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;

public class LogoutStepDefinition {
	HomePage HomePage=new HomePage();
	SigninPage SigninPage=new SigninPage();
	@And("User Click the link SignIn")
	public void user_click_the_link_sign_in() throws Exception {
	    HomePage.signInLink();
	}

	@And("User Enter the required details to Login")
	public void user_enter_the_required_details_to_login(DataTable dataTable) throws Exception {
		List<List<String>> credentials = credentials("C:\\Users\\Admin\\eclipse-workspace\\Magento-CapstoneProject\\src\\test\\resources\\SignIn Credentials.xlsx");
		dataTable = DataTable.create(credentials);
		System.out.println(dataTable.cell(0, 0));
		System.out.println(dataTable.cell(0, 1));
		SigninPage.Email(dataTable.cell(0, 0));
		SigninPage.Password(dataTable.cell(0, 1));
	}
	public static List<List<String>> credentials(String excelFilePath) throws Exception {
		List<List<String>> credentials = new ArrayList<>();
		FileInputStream file = new FileInputStream(new File(excelFilePath));
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		Sheet sheet = workbook.getSheetAt(0);
		for (int i = 0; i <= sheet.getLastRowNum(); i++) {
			Row row = sheet.getRow(i);
			List<String> rowData = new ArrayList<>();
			if(row!=null) {
				for(int j=0;j<row.getLastCellNum();j++) {
					Cell cell=row.getCell(j);
					if(cell!=null) {
						rowData.add(cell.getStringCellValue());
						//rowData.add(cell.toString());
					}else {
						rowData.add("");
					}
				}
			}
		credentials.add(rowData);
		}
	workbook.close();
	return credentials;
	}

	@And("User Click Logout from Home Page")
	public void user_click_logout_from_home_page() {
	    HomePage.dropDown();
	    HomePage.signOut();
	}

	@And("User Verify that the session ends and the user is redirected to the homepage.")
	public void user_verify_that_the_session_ends_and_the_user_is_redirected_to_the_homepage() {
	   Assert.assertEquals(HomePage.homePageText(),"You are signed out");
	}

}
