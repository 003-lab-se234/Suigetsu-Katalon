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
import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory

WebUI.openBrowser('')

WebUI.navigateToUrl('http://44.213.144.246:8080/')

WebUI.click(findTestObject('Object Repository/Check Cart Items/Page_index/button_Getsu_navbar-toggler'))

WebUI.click(findTestObject('Object Repository/Check Cart Items/Page_index/a_Signin'))

WebUI.setText(findTestObject('Object Repository/Check Cart Items/Page_Login/input_Username_userInput'), 'AsterKant')

WebUI.setEncryptedText(findTestObject('Object Repository/Check Cart Items/Page_Login/input_Password_password'), 'q/YpmlqjooV0cKPACKWCUw==')

WebUI.click(findTestObject('Object Repository/Check Cart Items/Page_Login/input_Password_btn btn-primary btn-lg'))

WebUI.click(findTestObject('Object Repository/Check Cart Items/Page_index/a_See menu'))

WebUI.click(findTestObject('Object Repository/Check Cart Items/Page_Menu/Add Omelet'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Check Cart Items/Page_Menu/Add Egg'))

WebUI.delay(3)

WebUI.click(findTestObject('Check Cart Items/Page_Menu/Add Schnitzel'))

WebUI.delay(3)

WebUI.click(findTestObject('Check Cart Items/Page_Menu/Add Orange'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Check Cart Items/Page_Menu/i_Search_fa fa-shopping-cart'))

WebUI.verifyElementText(findTestObject('Object Repository/Check Cart Items/Page_Menu/cart_item_1'), 'Omelet')

WebUI.verifyElementText(findTestObject('Object Repository/Check Cart Items/Page_Menu/cart_item_2'), 'Fried Egg')

WebUI.verifyElementText(findTestObject('Object Repository/Check Cart Items/Page_Menu/cart_item_3'), 'Schnitzel')

WebUI.verifyElementText(findTestObject('Object Repository/Check Cart Items/Page_Menu/cart_item_4'), 'Orange Juice')

WebUI.verifyElementText(findTestObject('Object Repository/Check Cart Items/Page_Menu/Cart Total Price'), '160')

WebDriver driver = DriverFactory.getWebDriver()

'To locate the cart'
WebElement Cart = driver.findElement(By.xpath('/html/body/div[2]/div[2]/div/div/div[2]/div[1]'))

'to get item elements'
List<WebElement> cart_items = Cart.findElements(By.className('container-fluid'))

'To get no. of items'
int cart_size = cart_items.size()

'To compare the expected value'
WebUI.verifyEqual(4, cart_items.size())

WebUI.closeBrowser()

