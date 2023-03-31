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

WebUI.click(findTestObject('Object Repository/Check Food Item Staff View/Page_index/span_Getsu_navbar-toggler-icon'))

WebUI.click(findTestObject('Object Repository/Check Food Item Staff View/Page_index/a_Signin'))

WebUI.setText(findTestObject('Object Repository/Check Food Item Staff View/Page_Login/input_Username_userInput'), 'AsterKant')

WebUI.setEncryptedText(findTestObject('Object Repository/Check Food Item Staff View/Page_Login/input_Password_password'), 
    'q/YpmlqjooV0cKPACKWCUw==')

WebUI.click(findTestObject('Object Repository/Check Food Item Staff View/Page_Login/input_Password_btn btn-primary btn-lg'))

WebUI.click(findTestObject('Object Repository/Check Food Item Staff View/Page_index/span_Getsu_navbar-toggler-icon'))

WebUI.click(findTestObject('Object Repository/Check Food Item Staff View/Page_index/a_query.kangmail.com'))

WebUI.click(findTestObject('Object Repository/Check Food Item Staff View/Page_index/a_Dashboard'))

WebUI.click(findTestObject('Object Repository/Check Food Item Staff View/Page_Dashboard/a_Manage Food'))

WebUI.verifyElementText(findTestObject('Object Repository/Check Food Item Staff View/Page_Staff/foodname_1'), 'Omelet')

WebUI.verifyElementText(findTestObject('Object Repository/Check Food Item Staff View/Page_Staff/foodCategory_1'), 'side')

WebUI.verifyElementText(findTestObject('Object Repository/Check Food Item Staff View/Page_Staff/foodPrice_1'), '45')

WebUI.verifyElementText(findTestObject('Check Food Item Staff View/Page_Staff/foodName_2'), 'Orange Juice')

WebUI.verifyElementText(findTestObject('Check Food Item Staff View/Page_Staff/foodCategory_2'), 'drink')

WebUI.verifyElementText(findTestObject('Check Food Item Staff View/Page_Staff/foodPrice_2'), '30')

WebUI.verifyElementText(findTestObject('Check Food Item Staff View/Page_Staff/foodName_3'), 'Fried Egg')

WebUI.verifyElementText(findTestObject('Check Food Item Staff View/Page_Staff/foodCategory_3'), 'side')

WebUI.verifyElementText(findTestObject('Check Food Item Staff View/Page_Staff/foodPrice_3'), '25')

WebUI.verifyElementText(findTestObject('Check Food Item Staff View/Page_Staff/foodName_4'), 'Schnitzel')

WebUI.verifyElementText(findTestObject('Check Food Item Staff View/Page_Staff/foodCategory_4'), 'main')

WebUI.verifyElementText(findTestObject('Check Food Item Staff View/Page_Staff/foodPrice_4'), '60')

WebDriver driver = DriverFactory.getWebDriver()
'To locate the table'
WebElement Table = driver.findElement(By.xpath('/html/body/div/div[3]/table/tbody'))
'to get tr elements'
List<WebElement> table_row = Table.findElements(By.tagName('tr'))
'To get no. of row'
int rows_count = table_row.size()
'To compare the expected value'
WebUI.verifyEqual(4, rows_count)

WebUI.closeBrowser()

