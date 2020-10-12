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

WebUI.navigateToUrl('https://www.phptravels.net/')

WebUI.click(findTestObject('Object Repository/Submit_Visa/Page_PHPTRAVELS  Travel Technology Partner/a_My Account'))

WebUI.click(findTestObject('Object Repository/Submit_Visa/Page_PHPTRAVELS  Travel Technology Partner/a_Login'))

WebUI.click(findTestObject('Object Repository/Submit_Visa/Page_Login/span_Email'))

WebUI.setText(findTestObject('Object Repository/Submit_Visa/Page_Login/input_Login_username'), 'user@phptravels.com')

WebUI.click(findTestObject('Object Repository/Submit_Visa/Page_Login/span_Password'))

WebUI.setEncryptedText(findTestObject('Object Repository/Submit_Visa/Page_Login/input_Email_password'), '6weEYLVRi3+STmppai9GiQ==')

WebUI.click(findTestObject('Object Repository/Submit_Visa/Page_Login/button_Login'))

WebUI.click(findTestObject('Object Repository/Submit_Visa/Page_My Account/a_Home'))

WebUI.click(findTestObject('Object Repository/Submit_Visa/Page_PHPTRAVELS  Travel Technology Partner/a_Visa'))

WebUI.click(findTestObject('Object Repository/Submit_Visa/Page_PHPTRAVELS  Travel Technology Partner/span_Albania'))

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/Submit_Visa/Page_PHPTRAVELS  Travel Technology Partner/input_Albania_chosen-search-input'), 
    'indonesia')

WebUI.click(findTestObject('Object Repository/Submit_Visa/Page_PHPTRAVELS  Travel Technology Partner/em_Indonesia'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Submit_Visa/Page_PHPTRAVELS  Travel Technology Partner/span_Aruba'))

WebUI.delay(4)

WebUI.setText(findTestObject('Object Repository/Submit_Visa/Page_PHPTRAVELS  Travel Technology Partner/input_Albania_chosen-search-input'), 
    'australia')

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Submit_Visa/Page_PHPTRAVELS  Travel Technology Partner/em_Australia'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Submit_Visa/Page_PHPTRAVELS  Travel Technology Partner/i__bx bx-calendar'))

WebUI.setText(findTestObject('Object Repository/Submit_Visa/Page_PHPTRAVELS  Travel Technology Partner/input__date'), '12/12/2020')

WebUI.click(findTestObject('Object Repository/Submit_Visa/Page_PHPTRAVELS  Travel Technology Partner/button_Submit'))

