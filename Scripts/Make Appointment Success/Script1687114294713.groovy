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

WebUI.callTestCase(findTestCase('Login/Login Success'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByValue(findTestObject('Demo Web/Appointment Page/Dropdown Facility'), 'Hongkong CURA Healthcare Center', 
    false)

WebUI.click(findTestObject('Demo Web/Appointment Page/Checkbox Apply'))

WebUI.click(findTestObject('Demo Web/Appointment Page/Radio Option/input_Medicare_programs'))

WebUI.click(findTestObject('Demo Web/Appointment Page/Kalender/input_Visit Date (Required)_visit_date'))

WebUI.click(findTestObject('Demo Web/Appointment Page/Kalender/td_25'))

WebUI.setText(findTestObject('Demo Web/Appointment Page/textarea_Comment_comment'), 'Make Appointment AUTOW')

WebUI.click(findTestObject('Demo Web/Appointment Page/button_Book Appointment'))

WebUI.verifyEqual(WebUI.getUrl(), 'https://katalon-demo-cura.herokuapp.com/appointment.php#summary')

WebUI.verifyElementText(findTestObject('Demo Web/Summary Page/Title Summary'), 'Appointment Confirmation')

WebUI.verifyElementText(findTestObject('Demo Web/Summary Page/p_Please be informed that your appointment has been booked as following'), 
    'Please be informed that your appointment has been booked as following:')

WebUI.verifyElementText(findTestObject('Demo Web/Summary Page/div_Facility'), 'Facility')

WebUI.verifyElementText(findTestObject('Demo Web/Summary Page/p_Seoul CURA Healthcare Center'), 'Hongkong CURA Healthcare Center')

WebUI.verifyElementText(findTestObject('Demo Web/Summary Page/label_Apply for hospital readmission'), 'Apply for hospital readmission')

WebUI.verifyElementText(findTestObject('Demo Web/Summary Page/p_Yes'), 'Yes')

WebUI.verifyElementText(findTestObject('Demo Web/Summary Page/label_Healthcare Program'), 'Healthcare Program')

WebUI.verifyElementText(findTestObject('Demo Web/Summary Page/p_Medicare'), 'Medicare')

WebUI.verifyElementText(findTestObject('Demo Web/Summary Page/div_Visit Date'), 'Visit Date')

WebUI.verifyElementText(findTestObject('Demo Web/Summary Page/p_25062023'), '25/06/2023')

WebUI.verifyElementText(findTestObject('Demo Web/Summary Page/div_Comment'), 'Comment')

WebUI.verifyElementText(findTestObject('Demo Web/Summary Page/p_AAAAA'), 'Make Appointment AUTOW')

WebUI.verifyElementClickable(findTestObject('Demo Web/Summary Page/a_Go to Homepage'))

WebUI.click(findTestObject('Demo Web/Summary Page/a_Go to Homepage'))

WebUI.verifyEqual(WebUI.getUrl(), 'https://katalon-demo-cura.herokuapp.com/')

WebUI.closeBrowser()

