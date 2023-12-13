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

WebUI.navigateToUrl('https://stage.mobipaid.com/en/register')

WebUI.maximizeWindow()

'input fname'
WebUI.setText(findTestObject('Object Repository/input_signatory_first_name'), 'test')

'input lname'
WebUI.setText(findTestObject('Object Repository/input_signatory_last_name'), 'test1')

'input email'
WebUI.setText(findTestObject('Object Repository/input_email'), 'hello1@gamil.com')

'input password'
WebUI.setEncryptedText(findTestObject('Object Repository/input_password'), 'jWModsK9zNSGtzParKYuZQ==')

'input company name'
WebUI.setText(findTestObject('Object Repository/input_name'), 'dasda')

'input random phone'
WebUI.setText(findTestObject('Object Repository/input_form-control phone'), '347987978')

'input country'
WebUI.selectOptionByValue(findTestObject('Object Repository/select_Your country'), '12', 
    true)

'input state'
WebUI.selectOptionByValue(findTestObject('Object Repository/select_Your state province'), 'Ísland', 
    true)

WebUI.click(findTestObject('Object Repository/input_psa-checkbox'))

'empty fname'
WebUI.setText(findTestObject('Object Repository/input_signatory_first_name'), '')

WebUI.click(findTestObject('Object Repository/button_register'))

'input fname'
WebUI.setText(findTestObject('Object Repository/input_signatory_first_name'), 'test')

WebUI.click(findTestObject('Object Repository/div_col-md-6 register-row'))

'empty fname'
WebUI.setText(findTestObject('Object Repository/input_signatory_last_name'), '')

WebUI.click(findTestObject('Object Repository/button_register'))

WebUI.setText(findTestObject('Object Repository/input_signatory_last_name'), 'test1')

'empty email'
WebUI.setText(findTestObject('Object Repository/input_email'), '')

WebUI.click(findTestObject('Object Repository/button_register'))

'input email'
WebUI.setText(findTestObject('Object Repository/input_email'), 'hello1@gmil1.com')

'input password'
WebUI.setEncryptedText(findTestObject('Object Repository/input_password'), '9NLz+4tGZcQ=')

WebUI.click(findTestObject('Object Repository/button_register'))

WebUI.setEncryptedText(findTestObject('Object Repository/input_password'), '+jKycXn6u1w=')

WebUI.setText(findTestObject('Object Repository/input_name'), 'dasda')

WebUI.click(findTestObject('Object Repository/input_name'))

WebUI.setEncryptedText(findTestObject('Object Repository/input_password'), 'jWModsK9zNSGtzParKYuZQ==')

WebUI.setText(findTestObject('Object Repository/input_name'), 'dasda')

WebUI.click(findTestObject('Object Repository/input_name'))

WebUI.click(findTestObject('Object Repository/div_col-md-12 register-row'))

'empty name'
WebUI.setText(findTestObject('Object Repository/input_name'), '')

WebUI.click(findTestObject('Object Repository/button_register'))

WebUI.setText(findTestObject('Object Repository/input_name'), 'dasda')

WebUI.click(findTestObject('Object Repository/input_name'))

WebUI.setText(findTestObject('Object Repository/input_form-control phone'), '')

WebUI.click(findTestObject('Object Repository/button_register'))

WebUI.setText(findTestObject('Object Repository/input_form-control phone'), '347987978')

WebUI.click(findTestObject('Object Repository/input_psa-checkbox'))

WebUI.click(findTestObject('Object Repository/button_register'))

WebUI.click(findTestObject('Object Repository/input_psa-checkbox'))

WebUI.click(findTestObject('Object Repository/button_register'))

WebUI.setText(findTestObject('Object Repository/input_form-control phone'), '8967830011')

WebUI.click(findTestObject('Object Repository/button_register'))

WebUI.click(findTestObject('Object Repository/div_Merchant Application'))

WebUI.closeBrowser()

