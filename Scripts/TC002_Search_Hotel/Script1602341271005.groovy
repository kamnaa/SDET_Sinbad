import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.thoughtworks.selenium.webdriven.WebDriverBackedSelenium as WebDriverBackedSelenium
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable

WebUI.click(findTestObject('Search_Hotel/Txt_Destination'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.setText(findTestObject('Search_Hotel/input__select2-input select2-focused'), 
    'Istanbul')

WebUI.delay(3)

WebUI.click(findTestObject('Search_Hotel/div_Istanbul Turkey'))

WebUI.setText(findTestObject('Search_Hotel/Date_Checkin'), '17/10/2020')

WebUI.setText(findTestObject('Search_Hotel/Date_Checkout'), '19/10/2020')

WebUI.click(findTestObject('Search_Hotel/Btn_Children_Up'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Search_Hotel/button_'))

WebUI.click(findTestObject('Search_Hotel/Btn_Search'))

WebUI.delay(5)

