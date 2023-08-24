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

WebUI.navigateToUrl('https://www.sepulsa.com/signin')

WebUI.setText(findTestObject('Object Repository/testcase3/Page_Sepulsa Mobile  Isi Ulang Pulsa Secara_989577/input_Yuk login dengan e-mail atau nomor HP_32d74a'), 
    'jendeladuia56@gmail.xxx')

WebUI.setEncryptedText(findTestObject('Object Repository/testcase3/Page_Sepulsa Mobile  Isi Ulang Pulsa Secara_989577/input_Yuk login dengan e-mail atau nomor HP_08ff20'), 
    's/IiTvd0Zn6KIrJOFzUarg==')

WebUI.click(findTestObject('Object Repository/testcase3/Page_Sepulsa Mobile  Isi Ulang Pulsa Secara_989577/svg_Yuk login dengan e-mail atau nomor HP m_c907c5'))

WebUI.click(findTestObject('Object Repository/testcase3/Page_Sepulsa Mobile  Isi Ulang Pulsa Secara_989577/button_Masuk'))

WebUI.closeBrowser()

