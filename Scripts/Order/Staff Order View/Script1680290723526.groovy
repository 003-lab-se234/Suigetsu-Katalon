import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import com.kms.katalon.core.webui.driver.DriverFactory

WebUI.openBrowser('')

WebUI.navigateToUrl('http://44.213.144.246:8080/')

WebUI.click(findTestObject('Object Repository/Check Staff Order/Page_index/span_Getsu_navbar-toggler-icon'))

WebUI.click(findTestObject('Object Repository/Check Staff Order/Page_index/a_Signin'))

WebUI.setText(findTestObject('Object Repository/Check Staff Order/Page_Login/input_Username_userInput'), 'AsterKant')

WebUI.setEncryptedText(findTestObject('Object Repository/Check Staff Order/Page_Login/input_Password_password'), 'q/YpmlqjooV0cKPACKWCUw==')

WebUI.click(findTestObject('Object Repository/Check Staff Order/Page_Login/input_Password_btn btn-primary btn-lg'))

WebUI.click(findTestObject('Object Repository/Check Staff Order/Page_index/span_Getsu_navbar-toggler-icon'))

WebUI.click(findTestObject('Object Repository/Check Staff Order/Page_index/a_query.kangmail.com'))

WebUI.click(findTestObject('Object Repository/Check Staff Order/Page_index/a_Dashboard'))

WebUI.click(findTestObject('Object Repository/Check Staff Order/Page_Dashboard/a_Manage Order'))

WebUI.verifyElementText(findTestObject('Object Repository/Check Staff Order/Page_Staff/status'), 'Cooking')

WebUI.verifyElementText(findTestObject('Object Repository/Check Staff Order/Page_Staff/orderedBy'), 'Kant Ketpark')

WebUI.verifyElementText(findTestObject('Object Repository/Check Staff Order/Page_Staff/finalPrice'), '130')

WebUI.verifyElementText(findTestObject('Object Repository/Check Staff Order/Page_Staff/destination'), '159, ลี้, ลี้ district ลำพูน 51110 Thailand')

WebUI.verifyElementText(findTestObject('Check Staff Order/Page_Staff/status_2'), 'Delivered')

WebUI.verifyElementText(findTestObject('Check Staff Order/Page_Staff/orderedBy_2'), 'John Doe')

WebUI.verifyElementText(findTestObject('Check Staff Order/Page_Staff/finalPrice_2'), '90')

WebUI.verifyElementText(findTestObject('Check Staff Order/Page_Staff/destination_2'), '123, สันกำแพง, แช่ช้าง district เชียงใหม่ 50130 Thailand')

WebUI.verifyElementText(findTestObject('Check Staff Order/Page_Staff/status_3'), 'Pending')

WebUI.verifyElementText(findTestObject('Check Staff Order/Page_Staff/orderedBy_3'), 'Kan Katpark')

WebUI.verifyElementText(findTestObject('Check Staff Order/Page_Staff/finalPrice_3'), '100')

WebUI.verifyElementText(findTestObject('Check Staff Order/Page_Staff/destination_3'), '123, สันกำแพง, แช่ช้าง district เชียงใหม่ 50130 Thailand')

WebDriver driver = DriverFactory.getWebDriver()
'To locate the table'
WebElement Table = driver.findElement(By.xpath('/html/body/div/div[2]/table/tbody'))
'to get tr elements'
List<WebElement> table_row = Table.findElements(By.tagName('tr'))
'To get no. of row'
int rows_count = table_row.size()
'To compare the expected value'
WebUI.verifyEqual(3, table_row.size())

WebUI.closeBrowser()

