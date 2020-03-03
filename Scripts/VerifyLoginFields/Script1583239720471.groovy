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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.facebook.com/')

WebUI.verifyElementPresent(findTestObject('Page_Facebook - Log In or Sign Up/emailField'), 0)

WebUI.setText(findTestObject('Page_Facebook - Log In or Sign Up/emailField'), 'Test')

WebUI.verifyElementPresent(findTestObject('Page_Facebook - Log In or Sign Up/passwordField'), 0)

WebUI.setText(findTestObject('Page_Facebook - Log In or Sign Up/passwordField'), 'Test')

WebUI.verifyElementPresent(findTestObject('Page_Facebook - Log In or Sign Up/loginButton'), 0)

WebUI.verifyElementPresent(findTestObject('Page_Facebook - Log In or Sign Up/firstNameField'), 0)

WebUI.setText(findTestObject('Page_Facebook - Log In or Sign Up/firstNameField'), 'Test')

WebUI.verifyElementPresent(findTestObject('Page_Facebook - Log In or Sign Up/lastNameField'), 0)

WebUI.setText(findTestObject('Page_Facebook - Log In or Sign Up/lastNameField'), 'test')

WebUI.verifyElementPresent(findTestObject('Page_Facebook - Log In or Sign Up/mobileOrEmailField'), 0)

WebUI.setText(findTestObject('Page_Facebook - Log In or Sign Up/mobileOrEmailField'), 'juantamad@gmail.com')

WebUI.verifyElementPresent(findTestObject('Page_Facebook - Log In or Sign Up/reenterEmailField'), 0)

WebUI.setText(findTestObject('Page_Facebook - Log In or Sign Up/reenterEmailField'), 'juantamad@gmail.com')

WebUI.verifyElementPresent(findTestObject('Page_Facebook - Log In or Sign Up/newPasswordField'), 0)

WebUI.setText(findTestObject('Page_Facebook - Log In or Sign Up/newPasswordField'), 'newpassword123!')

WebUI.verifyElementPresent(findTestObject('Page_Facebook - Log In or Sign Up/dropDownMenuDay'), 0)

WebUI.selectOptionByValue(findTestObject('Page_Facebook - Log In or Sign Up/dropDownMenuDay'), '1', true)

WebUI.verifyElementPresent(findTestObject('Page_Facebook - Log In or Sign Up/dropDownMenuMonth'), 0)

WebUI.selectOptionByValue(findTestObject('Page_Facebook - Log In or Sign Up/dropDownMenuMonth'), '1', true)

WebUI.verifyElementPresent(findTestObject('Page_Facebook - Log In or Sign Up/dropDownMenuYear'), 0)

WebUI.selectOptionByValue(findTestObject('Page_Facebook - Log In or Sign Up/dropDownMenuDay'), '1', true)

WebUI.verifyElementPresent(findTestObject('Page_Facebook - Log In or Sign Up/radioBtnFemale'), 0)

WebUI.verifyElementPresent(findTestObject('Page_Facebook - Log In or Sign Up/radioBtnMale'), 0)

WebUI.verifyElementPresent(findTestObject('Page_Facebook - Log In or Sign Up/radioBtnCustom'), 0)

WebUI.click(findTestObject('Page_Facebook - Log In or Sign Up/radioBtnCustom'))

WebUI.verifyElementVisible(findTestObject('Page_Facebook - Log In or Sign Up/genderOptionalField'))

WebUI.setText(findTestObject('Page_Facebook - Log In or Sign Up/genderOptionalField'), 'test')

WebUI.verifyElementVisible(findTestObject('Page_Facebook - Log In or Sign Up/signupBtn'))

WebUI.closeBrowser()

