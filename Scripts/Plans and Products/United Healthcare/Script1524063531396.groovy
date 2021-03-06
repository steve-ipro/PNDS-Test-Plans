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

WebUI.navigateToUrl('http://dev.providerlookup.ipro.org/')

WebUI.click(findTestObject('Plans and Products/Page_PNDS (77)/a_Search by Health Plan'))

WebUI.selectOptionByValue(findTestObject('Plans and Products/Page_PNDS (77)/select_--- Choose one ---Aetna'), '0148', true)

WebUI.selectOptionByValue(findTestObject('Plans and Products/Page_PNDS (77)/select_--- Choose One ---Unite'), 'nonmcomedical', 
    true)

WebUI.selectOptionByValue(findTestObject('Plans and Products/Page_PNDS (77)/select_--- Choose One ---Unite'), 'chpprovider', 
    true)

WebUI.selectOptionByValue(findTestObject('Plans and Products/Page_PNDS (77)/select_--- Choose One ---Unite'), 'nonmcomedical,skp_002', 
    true)

WebUI.selectOptionByValue(findTestObject('Plans and Products/Page_PNDS (77)/select_--- Choose One ---Unite'), 'nonmcomedical,skp_003', 
    true)

WebUI.selectOptionByValue(findTestObject('Plans and Products/Page_PNDS (77)/select_--- Choose One ---Unite'), 'nonmcomedical,skp_004', 
    true)

WebUI.selectOptionByValue(findTestObject('Plans and Products/Page_PNDS (77)/select_--- Choose One ---Unite'), 'nonmcomedical,skp_005', 
    true)

WebUI.selectOptionByValue(findTestObject('Plans and Products/Page_PNDS (77)/select_--- Choose One ---Unite'), 'nonmcodental', 
    true)

WebUI.selectOptionByValue(findTestObject('Plans and Products/Page_PNDS (77)/select_--- Choose One ---Unite'), 'nonmcodental,skp_007', 
    true)

WebUI.selectOptionByValue(findTestObject('Plans and Products/Page_PNDS (77)/select_--- Choose One ---Unite'), 'nonmcomedical,skp_008', 
    true)

WebUI.selectOptionByValue(findTestObject('Plans and Products/Page_PNDS (77)/select_--- Choose One ---Unite'), 'bhp,bhpplus', 
    true)

WebUI.selectOptionByValue(findTestObject('Plans and Products/Page_PNDS (77)/select_--- Choose One ---Unite'), 'harp', true)

WebUI.selectOptionByValue(findTestObject('Plans and Products/Page_PNDS (77)/select_--- Choose One ---Unite'), 'indivstplatinum,indivstplatinum,indivstgold,indivstgold,indivstsilver,indivstsilver,indivstbronze,indivstbronze,indivcatastrophic,indivchildonlyplatinum,indivchildonlygold,indivchildonlysilver,indivchildonlybronze,indivnonstsilver2,indivnonstsilver2,indivchildonlysilver,indivnonstbronze1,indivnonstbronze1,indivchildonlybronze,indivnonstsilver1', 
    true)

WebUI.selectOptionByValue(findTestObject('Plans and Products/Page_PNDS (77)/select_--- Choose One ---Unite'), 'partialcaps', 
    true)

WebUI.selectOptionByValue(findTestObject('Plans and Products/Page_PNDS (77)/select_--- Choose One ---Unite'), 'medicaidprovider', 
    true)

WebUI.selectOptionByValue(findTestObject('Plans and Products/Page_PNDS (77)/select_--- Choose One ---Unite'), 'medicaidadvantage', 
    true)

WebUI.selectOptionByValue(findTestObject('Plans and Products/Page_PNDS (77)/select_--- Choose One ---Unite'), 'nonmcomedical,skp_015', 
    true)

WebUI.selectOptionByValue(findTestObject('Plans and Products/Page_PNDS (77)/select_--- Choose One ---Unite'), 'nonmcomedical,skp_016', 
    true)

WebUI.closeBrowser()

