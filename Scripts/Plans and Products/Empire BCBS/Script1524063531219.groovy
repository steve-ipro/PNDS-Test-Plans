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

WebUI.click(findTestObject('Plans and Products/Page_PNDS (30)/a_Search by Health Plan'))

WebUI.selectOptionByValue(findTestObject('Plans and Products/Page_PNDS (30)/select_--- Choose one ---Aetna'), '0057', true)

WebUI.selectOptionByValue(findTestObject('Plans and Products/Page_PNDS (30)/select_--- Choose One ---Empir'), 'indivpeddentalhigh,indivpeddentalhigh,indivadultdental,indivadultdental,indivfamdental,indivfamdental,indivfamdental,indivfamdental', 
    true)

WebUI.selectOptionByValue(findTestObject('Plans and Products/Page_PNDS (30)/select_--- Choose One ---Empir'), 'indivstbronze,indivstbronze,indivnonstbronze1,indivnonstbronze1,indivstsilver,indivstsilver,indivnonstsilver1,indivnonstsilver1,indivstgold,indivstgold,indivstplatinum,indivstplatinum,indivcatastrophic,indivcatastrophic,indivstbronze,indivstbronze,indivnonstbronze1,indivnonstbronze1,indivstsilver,indivstsilver,indivnonstsilver1,indivnonstsilver1,indivstgold,indivstgold,indivstplatinum,indivstplatinum,indivchildonlybronze,indivchildonlybronze,indivchildonlysilver,indivchildonlysilver,indivchildonlygold,indivchildonlygold,indivchildonlyplatinum,indivchildonlyplatinum,indivnonstgold1,indivnonstgold1,indivnonstgold1,indivnonstgold1,indivnonstplatinum1,indivnonstplatinum1,indivnonstplatinum1,indivnonstplatinum1,indivnonstsilver2,indivnonstsilver2,indivnonstsilver2,indivnonstsilver2,indivnonstbronze2,indivnonstbronze2,indivnonstbronze2,indivnonstbronze2,indivnonstgold2', 
    true)

WebUI.selectOptionByValue(findTestObject('Plans and Products/Page_PNDS (30)/select_--- Choose One ---Empir'), 'commercialprovider', 
    true)

WebUI.selectOptionByValue(findTestObject('Plans and Products/Page_PNDS (30)/select_--- Choose One ---Empir'), 'chpprovider', 
    true)

WebUI.selectOptionByValue(findTestObject('Plans and Products/Page_PNDS (30)/select_--- Choose One ---Empir'), 'bhp,bhpplus', 
    true)

WebUI.selectOptionByValue(findTestObject('Plans and Products/Page_PNDS (30)/select_--- Choose One ---Empir'), 'harp', true)

WebUI.selectOptionByValue(findTestObject('Plans and Products/Page_PNDS (30)/select_--- Choose One ---Empir'), 'partialcaps', 
    true)

WebUI.selectOptionByValue(findTestObject('Plans and Products/Page_PNDS (30)/select_--- Choose One ---Empir'), 'medicaidprovider', 
    true)

WebUI.selectOptionByValue(findTestObject('Plans and Products/Page_PNDS (30)/select_--- Choose One ---Empir'), 'medicaidadvantage', 
    true)

WebUI.selectOptionByValue(findTestObject('Plans and Products/Page_PNDS (30)/select_--- Choose One ---Empir'), 'map', true)

WebUI.selectOptionByValue(findTestObject('Plans and Products/Page_PNDS (30)/select_--- Choose One ---Empir'), 'nonmcomedical', 
    true)

WebUI.selectOptionByValue(findTestObject('Plans and Products/Page_PNDS (30)/select_--- Choose One ---Empir'), 'nonmcovision', 
    true)

WebUI.selectOptionByValue(findTestObject('Plans and Products/Page_PNDS (30)/select_--- Choose One ---Empir'), 'nonmcomedical,skp_012', 
    true)

WebUI.selectOptionByValue(findTestObject('Plans and Products/Page_PNDS (30)/select_--- Choose One ---Empir'), 'nonmcomedical,skp_013', 
    true)

WebUI.closeBrowser()

