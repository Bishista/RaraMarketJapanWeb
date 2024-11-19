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

WebUI.navigateToUrl(GlobalVariable.URL)

WebUI.click(findTestObject('Object Repository/RaraMarket/Page_RaraMarket Japan  Best Online Shopping_0a9bf9/i_Search products_fa fa-user collapsed'))

WebUI.setText(findTestObject('Object Repository/RaraMarket/Page_Login  RaraMarket Japan/input_Email_Email'), GlobalVariable.EMAIL)

WebUI.setEncryptedText(findTestObject('Object Repository/RaraMarket/Page_Login  RaraMarket Japan/input_Password_Password'), 
    '8+b+Xs4N2656l6YHUVYEcQ==')

WebUI.click(findTestObject('Object Repository/RaraMarket/Page_Login  RaraMarket Japan/button_Log in'))

WebUI.click(findTestObject('Object Repository/RaraMarket/Page_RaraMarket Japan  Best Online Shopping_0a9bf9/img'))

WebUI.click(findTestObject('Object Repository/RaraMarket/Page_Sweet  Nutty Delights  RaraMarket Japan/a_Add to cart'))

WebUI.click(findTestObject('Object Repository/RaraMarket/Page_Sweet  Nutty Delights  RaraMarket Japan/button_Go to cart'))

