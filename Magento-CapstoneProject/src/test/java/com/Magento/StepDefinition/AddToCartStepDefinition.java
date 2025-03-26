package com.Magento.StepDefinition;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.Assert;

import com.Magento.Pages.SearchResultPage;
import com.Magento.Pages.SigninPage;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;

public class AddToCartStepDefinition {
	SigninPage SigninPage=new SigninPage();
	SearchResultPage searchPage = new SearchResultPage();
	@And("User Search for a {string} Product")
	public void user_search_for_a_product(String string) {
	    SigninPage.SearchBox(string);
	}
	@And("User Select autosuggestion {string} from List displayed")
	public void user_select_autosuggestion_from_list_displayed(String string) {
		SigninPage.SearchBoxList(string);
	}

	@And("User Select Product {string} in nextpage")
	public void user_select_product_in_nextpage(String string) {
	    searchPage.SelectProduct(string);
	}
	@And("User Selects the Size,Color,Quantity in Search result page")
	public void user_selects_the_size_color_quantity_in_search_result_page(DataTable dataTable) throws Exception {
	   List<List<String>> credentials = credentials("C:\\Users\\Admin\\eclipse-workspace\\Magento-CapstoneProject\\src\\test\\resources\\ProductDetails.xlsx");
		dataTable = DataTable.create(credentials);
		System.out.println(dataTable.cell(0, 0));
		System.out.println(dataTable.cell(0, 1));
		System.out.println(dataTable.cell(0, 2));
		searchPage.selectSize(dataTable.cell(0, 0));
		searchPage.selectColor(dataTable.cell(0, 1));
		searchPage.enterQuantity(dataTable.cell(0, 2));
	}
	public static List<List<String>> credentials(String excelFilePath) throws Exception {
		List<List<String>> credentials = new ArrayList<>();
		FileInputStream file = new FileInputStream(new File(excelFilePath));
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		DataFormatter dataFormatter = new DataFormatter();
		Sheet sheet = workbook.getSheetAt(0);
		for (int i = 0; i <= sheet.getLastRowNum(); i++) {
			Row row = sheet.getRow(i);
			List<String> rowData = new ArrayList<>();
			if(row!=null) {
				for(int j=0;j<row.getLastCellNum();j++) {
					Cell cell=row.getCell(j);
					if(cell!=null) {
						//rowData.add(cell.getStringCellValue());
						//rowData.add(cell.toString());
						rowData.add(dataFormatter.formatCellValue(cell));
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

	@And("User Click on Add to Cart")
	public void user_click_on_add_to_cart() {
	    searchPage.addToCart();
	}

	@And("User Verify that the product is added to the cart")
	public void user_verify_that_the_product_is_added_to_the_cart() {
	    Assert.assertEquals(searchPage.verifyAddedToCartMessage(), true);
	}


}
