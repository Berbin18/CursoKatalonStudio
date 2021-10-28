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

WebUI.callTestCase(findTestCase('Demo/Login'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Cobrar QR/MenuPrincipal'), 0)

Mobile.tap(findTestObject('Cobrar QR/android.widget.TextView - Simple (Transferencias QR)'), 0)

Mobile.tap(findTestObject('PagarQR/android.widget.TextView - Pagar'), 0)

Mobile.tap(findTestObject('PagarQR/android.widget.TextView - Importar imagen'), 0)

Mobile.tap(findTestObject('PagarQR/android.widget.ImageView'), 0)

Mobile.tap(findTestObject('PagarQR/android.widget.TextView - Caja de A.2789'), 0)

Mobile.tap(findTestObject('PagarQR/yodeclaro'), 0)

Mobile.checkElement(findTestObject('PagarQR/android.widget.Button - Continuar'), 0)

Mobile.tap(findTestObject('PagarQR/token'), 0)

Mobile.setText(findTestObject('PagarQR/tokenedit'), '111111', 0)

Mobile.tap(findTestObject('PagarQR/android.widget.Button - Enviar'), 0)

