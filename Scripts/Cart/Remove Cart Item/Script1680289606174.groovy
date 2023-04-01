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

WebUI.openBrowser('')

WebUI.navigateToUrl('http://44.213.144.246:8080/')

WebUI.click(findTestObject('Object Repository/Check Remove Cart Item/Page_index/span_Getsu_navbar-toggler-icon'))

WebUI.click(findTestObject('Object Repository/Check Remove Cart Item/Page_index/a_Signin'))

WebUI.setText(findTestObject('Object Repository/Check Remove Cart Item/Page_Login/input_Username_userInput'), 'AsterKant')

WebUI.setEncryptedText(findTestObject('Object Repository/Check Remove Cart Item/Page_Login/input_Password_password'), 'q/YpmlqjooV0cKPACKWCUw==')

WebUI.click(findTestObject('Object Repository/Check Remove Cart Item/Page_Login/input_Password_btn btn-primary btn-lg'))

WebUI.navigateToUrl('http://44.213.144.246:8080/menu')

WebUI.click(findTestObject('Object Repository/Check Remove Cart Item/Page_Menu/Open Cart Btn'))

WebUI.verifyElementInViewport(findTestObject('Check Remove Cart Item/Page_Menu/Cart Is Empty'), 2)

WebUI.click(findTestObject('Object Repository/Check Remove Cart Item/Page_Menu/Close Cart Icon'))

WebUI.click(findTestObject('Object Repository/Check Remove Cart Item/Page_Menu/button_Add to cart'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Check Remove Cart Item/Page_Menu/Open Cart Icon'))

WebUI.verifyElementNotInViewport(findTestObject('Check Remove Cart Item/Page_Menu/Cart Is Empty'), 2)

WebUI.click(findTestObject('Object Repository/Check Remove Cart Item/Page_Menu/Remove Omelet'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Check Remove Cart Item/Page_Menu/Open Cart Icon'))

WebUI.verifyElementInViewport(findTestObject('Check Remove Cart Item/Page_Menu/Cart Is Empty'), 2)

WebUI.closeBrowser()

