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

WebUI.navigateToUrl('https://bibleathon.id/')

WebUI.click(findTestObject('Object Repository/Signup/SG-001 Isi semua form/Page_Bible a Thon/button_Login'))

WebUI.click(findTestObject('Object Repository/Signup/SG-001 Isi semua form/Page_Bible a Thon/a_Disini'))

WebUI.setText(findTestObject('Object Repository/Signup/SG-001 Isi semua form/Page_Bible a Thon  SignUp/input_Nama Lengkap_nama_lengkap'), 'Nat')

WebUI.setText(findTestObject('Object Repository/Signup/SG-001 Isi semua form/Page_Bible a Thon  SignUp/input_Nama Panggilan_nama_panggilan'), 
    'nat')

WebUI.setText(findTestObject('Object Repository/Signup/SG-001 Isi semua form/Page_Bible a Thon  SignUp/input_No Whatsapp_nohp'), '085155207987')

WebUI.setText(findTestObject('Object Repository/Signup/SG-001 Isi semua form/Page_Bible a Thon  SignUp/input_Email_email'), 'adrian@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Signup/SG-001 Isi semua form/Page_Bible a Thon  SignUp/input_Password_password'), 'RAIVpflpDOg=')

WebUI.selectOptionByValue(findTestObject('Object Repository/Signup/SG-001 Isi semua form/Page_Bible a Thon  SignUp/select_Pilih Dekenat Anda                  _aae06c'), 
    '1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Signup/SG-001 Isi semua form/Page_Bible a Thon  SignUp/select_No SelectedParoki CidengParoki Kampu_3d36e7'), 
    '1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Signup/SG-001 Isi semua form/Page_Bible a Thon  SignUp/select_No SelectedWilayah 1'), 
    '1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Signup/SG-001 Isi semua form/Page_Bible a Thon  SignUp/select_No SelectedLingkungan 1'), 
    '1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Signup/SG-001 Isi semua form/Page_Bible a Thon  SignUp/select_Pilih Posisi Anda                   _a881c2'), 
    'registered', true)

WebUI.click(findTestObject('Object Repository/Signup/SG-001 Isi semua form/Page_Bible a Thon  SignUp/input_Tambah Peserta_approve_peserta'))

WebUI.click(findTestObject('Object Repository/Signup/SG-001 Isi semua form/Page_Bible a Thon  SignUp/button_Daftar Diri Anda'))

WebUI.closeBrowser()

