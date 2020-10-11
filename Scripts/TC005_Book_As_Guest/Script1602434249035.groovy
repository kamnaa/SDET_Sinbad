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

WebUI.setText(findTestObject('Book_As_Guest/Txt_First_Name'), 'Kamna')

WebUI.setText(findTestObject('Book_As_Guest/Txt_Last_Name'), 'Siahaan')

WebUI.setText(findTestObject('Book_As_Guest/Txt_Email'), 'nataliakamna13@gmail.com')

WebUI.setText(findTestObject('Book_As_Guest/Txt_Confirm'), 'nataliakamna13@gmail.com')

WebUI.setText(findTestObject('Book_As_Guest/Txt_Contact_Number'), '081265653197')

WebUI.setText(findTestObject('Book_As_Guest/Txt_Address'), 'Jl Selambo Indah No 3 Medan')

