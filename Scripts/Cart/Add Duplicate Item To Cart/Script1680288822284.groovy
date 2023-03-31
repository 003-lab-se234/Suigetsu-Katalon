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

WebUI.click(findTestObject('Object Repository/Check Add Duplicate Item/Page_index/button_Getsu_navbar-toggler'))

WebUI.click(findTestObject('Object Repository/Check Add Duplicate Item/Page_index/a_Signin'))

WebUI.setText(findTestObject('Object Repository/Check Add Duplicate Item/Page_Login/input_Username_userInput'), 'AsterKant')

WebUI.setEncryptedText(findTestObject('Object Repository/Check Add Duplicate Item/Page_Login/input_Password_password'), 
    'q/YpmlqjooV0cKPACKWCUw==')

WebUI.click(findTestObject('Object Repository/Check Add Duplicate Item/Page_Login/input_Password_btn btn-primary btn-lg'))

WebUI.click(findTestObject('Object Repository/Check Add Duplicate Item/Page_index/a_See menu'))

WebUI.click(findTestObject('Object Repository/Check Add Duplicate Item/Page_Menu/button_Add to cart'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Check Add Duplicate Item/Page_Menu/CartOpenIcon'))

WebUI.verifyElementText(findTestObject('Object Repository/Check Add Duplicate Item/Page_Menu/ItemTimePriceResult'), '1*45= 45')

WebUI.verifyElementText(findTestObject('Object Repository/Check Add Duplicate Item/Page_Menu/CartFinalPrice'), '45')

WebUI.click(findTestObject('Object Repository/Check Add Duplicate Item/Page_Menu/ModalCloseBtn'))

WebUI.click(findTestObject('Object Repository/Check Add Duplicate Item/Page_Menu/button_Add to cart'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Check Add Duplicate Item/Page_Menu/CartOpenIcon'))

WebUI.verifyElementText(findTestObject('Check Add Duplicate Item/Page_Menu/ItemTimePriceResult'), '2*45= 90')

WebUI.verifyElementText(findTestObject('Check Add Duplicate Item/Page_Menu/CartFinalPrice'), '90')

WebDriver driver = DriverFactory.getWebDriver()
'To locate the cart'
WebElement Cart = driver.findElement(By.xpath('/html/body/div[2]/div[2]/div/div/div[2]/div[1]'))

'to get item elements'
List<WebElement> cart_items = Cart.findElements(By.className('container-fluid'))

'To get no. of items'
int cart_size = cart_items.size()

'To compare the expected value'
WebUI.verifyEqual(1, cart_items.size())

WebUI.click(findTestObject('Object Repository/Check Add Duplicate Item/Page_Menu/ModalCloseBtn'))

WebUI.closeBrowser()

