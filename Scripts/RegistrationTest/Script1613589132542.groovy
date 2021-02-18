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

WebUI.navigateToUrl('https://demoqa.com/automation-practice-form')

WebUI.setText(findTestObject('Object Repository/Page_ToolsQA/input_Name_firstName'), 'Mark')

WebUI.setText(findTestObject('Object Repository/Page_ToolsQA/input_Name_lastName'), 'Wahlberg')

WebUI.setText(findTestObject('Object Repository/Page_ToolsQA/input_Email_userEmail'), 'test@testing.com')

WebUI.click(findTestObject('Object Repository/Page_ToolsQA/label_Male'))

WebUI.setText(findTestObject('Object Repository/Page_ToolsQA/input_(10 Digits)_userNumber'), '8888888888')

WebUI.click(findTestObject('Object Repository/Page_ToolsQA/input_Date of Birth_dateOfBirthInput'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_ToolsQA/select_JanuaryFebruaryMarchAprilMayJuneJuly_566629'), 
    '5', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_ToolsQA/select_190019011902190319041905190619071908_246ee1'), 
    '1994', true)

WebUI.click(findTestObject('Object Repository/Page_ToolsQA/div_11'))

WebUI.click(findTestObject('Object Repository/Page_ToolsQA/div_Subjects_subjects-auto-complete__value-_d244cf'))

WebUI.setText(findTestObject('Object Repository/Page_ToolsQA/input_Subjects_subjectsInput'), 'math')

WebUI.click(findTestObject('Object Repository/Page_ToolsQA/div_Maths'))

WebUI.click(findTestObject('Object Repository/Page_ToolsQA/label_Sports'))

WebUI.click(findTestObject('Object Repository/Page_ToolsQA/label_Reading'))

WebUI.click(findTestObject('Object Repository/Page_ToolsQA/label_Music'))

WebUI.uploadFile(findTestObject('FileUpload/Page_ToolsQA/input_Select picture_uploadPicture'), file)

WebUI.setText(findTestObject('Object Repository/Page_ToolsQA/textarea_Current Address_currentAddress'), '2346 Prospect Street')

WebUI.setText(findTestObject('Object Repository/Page_ToolsQA/input_State and City_react-select-3-input'), 'ut')

WebUI.click(findTestObject('Object Repository/Page_ToolsQA/div_Uttar Pradesh'))

WebUI.setText(findTestObject('Object Repository/Page_ToolsQA/input_Uttar Pradesh_react-select-4-input'), 'lu')

WebUI.click(findTestObject('Object Repository/Page_ToolsQA/div_Lucknow'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_ToolsQA/button_Submit'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_ToolsQA/button_Close'))

WebUI.closeBrowser()

