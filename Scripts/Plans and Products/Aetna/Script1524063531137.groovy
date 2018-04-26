import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.preProdURL)

WebUI.click(findTestObject('Plans and Products/Page_PNDS/a_Search by Health Plan'))

WebUI.selectOptionByValue(findTestObject('Plans and Products/Page_PNDS/select_--- Choose one ---Aetna'), '0001', true)

WebUI.selectOptionByValue(findTestObject('Plans and Products/Page_PNDS/select_--- Choose One ---Aetna (1)'), 'fida', true)

WebUI.selectOptionByValue(findTestObject('Plans and Products/Page_PNDS/select_--- Choose One ---Aetna (1)'), 'partialcaps', 
    true)

WebUI.selectOptionByValue(findTestObject('Plans and Products/Page_PNDS/select_--- Choose One ---Aetna (1)'), 'nonmcovision', 
    true)

WebUI.selectOptionByValue(findTestObject('Plans and Products/Page_PNDS/select_--- Choose One ---Aetna (1)'), 'nonmcomedical', 
    true)

WebUI.selectOptionByValue(findTestObject('Plans and Products/Page_PNDS/select_--- Choose One ---Aetna (1)'), 'nonmcomedical,skp_004', 
    true)

WebUI.selectOptionByValue(findTestObject('Plans and Products/Page_PNDS/select_--- Choose One ---Aetna (1)'), 'nonmcomedical,skp_005', 
    true)

WebUI.selectOptionByValue(findTestObject('Plans and Products/Page_PNDS/select_--- Choose One ---Aetna (1)'), 'nonmcodental', 
    true)

WebUI.selectOptionByValue(findTestObject('Plans and Products/Page_PNDS/select_--- Choose One ---Aetna (1)'), 'nonmcodental,skp_007', 
    true)

WebUI.selectOptionByValue(findTestObject('Plans and Products/Page_PNDS/select_--- Choose One ---Aetna (1)'), 'nonmcomedical,skp_008', 
    true)

WebUI.selectOptionByValue(findTestObject('Plans and Products/Page_PNDS/select_--- Choose One ---Aetna (1)'), 'nonmcomedical,skp_009', 
    true)

WebUI.selectOptionByValue(findTestObject('Plans and Products/Page_PNDS/select_--- Choose One ---Aetna (1)'), 'nonmcomedical,skp_010', 
    true)

WebUI.selectOptionByValue(findTestObject('Plans and Products/Page_PNDS/select_--- Choose One ---Aetna (1)'), 'nonmcomedical,skp_011', 
    true)

WebUI.closeBrowser()

