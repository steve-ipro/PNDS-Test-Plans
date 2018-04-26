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

WebUI.click(findTestObject('Plans and Products/Page_PNDS (8)/a_Search by Health Plan'))

WebUI.selectOptionByValue(findTestObject('Plans and Products/Page_PNDS (8)/select_--- Choose one ---Aetna'), '0184', true)

WebUI.selectOptionByValue(findTestObject('Plans and Products/Page_PNDS (8)/select_--- Choose One ---BlueC'), 'chpprovider', 
    true)

WebUI.selectOptionByValue(findTestObject('Plans and Products/Page_PNDS (8)/select_--- Choose One ---BlueC'), 'bhp', true)

WebUI.selectOptionByValue(findTestObject('Plans and Products/Page_PNDS (8)/select_--- Choose One ---BlueC'), 'indivstsilver,indivstgold,indivstplatinum,indivstbronze,indivstbronze,indivchildonlybronze,indivstsilver,indivchildonlysilver,indivnonstsilver1,indivnonstsilver1,indivnonstsilver3,indivnonstsilver3,indivstgold,indivchildonlygold,indivnonstgold1,indivnonstgold1,indivstplatinum,indivchildonlyplatinum,indivnonstplatinum1,indivnonstplatinum1,indivnonstplatinum3,indivnonstplatinum3,indivnonstbronze1,indivnonstbronze1,indivnonstgold2,indivnonstgold2,indivnonstsilver2,indivnonstsilver2,indivnonstbronze2,indivnonstbronze2,indivstbronze,indivstbronze,indivnonstplatinum2,indivnonstplatinum2', 
    true)

WebUI.selectOptionByValue(findTestObject('Plans and Products/Page_PNDS (8)/select_--- Choose One ---BlueC'), 'medicaidprovider', 
    true)

WebUI.selectOptionByValue(findTestObject('Plans and Products/Page_PNDS (8)/select_--- Choose One ---BlueC'), 'shopstbronze,shopstbronze,shopstbronze,shopstbronze,shopstsilver,shopstsilver,shopstsilver,shopstsilver,shopstgold,shopstgold,shopstgold,shopstgold,shopstplatinum,shopstplatinum,shopstplatinum,shopstplatinum,shopstplatinum,shopstplatinum,shopstplatinum,shopstplatinum,shopstbronze,shopstbronze,shopstbronze,shopstbronze,shopstsilver,shopstsilver,shopstsilver,shopstsilver,shopstgold,shopstgold,shopstgold,shopstgold,shopstplatinum,shopstplatinum,shopstplatinum,shopstplatinum,shopstplatinum,shopstplatinum,shopstplatinum,shopstplatinum', 
    true)

WebUI.selectOptionByValue(findTestObject('Plans and Products/Page_PNDS (8)/select_--- Choose One ---BlueC'), 'commercialprovider', 
    true)

WebUI.selectOptionByValue(findTestObject('Plans and Products/Page_PNDS (8)/select_--- Choose One ---BlueC'), 'indivpeddentallow,indivfamdental', 
    true)

WebUI.selectOptionByValue(findTestObject('Plans and Products/Page_PNDS (8)/select_--- Choose One ---BlueC'), 'shoppeddentallow,shopfamdental', 
    true)

WebUI.selectOptionByValue(findTestObject('Plans and Products/Page_PNDS (8)/select_--- Choose One ---BlueC'), 'shopstbronze,shopstbronze,shopstbronze,shopstbronze,shopstsilver,shopstsilver,shopstsilver,shopstsilver,shopstgold,shopstgold,shopstgold,shopstgold,shopstplatinum,shopstplatinum,shopstplatinum,shopstplatinum,shopstplatinum,shopstplatinum,shopstplatinum,shopstplatinum,shopstbronze,shopstbronze,shopstbronze,shopstbronze,shopstsilver,shopstsilver,shopstsilver,shopstsilver,shopstgold,shopstgold,shopstgold,shopstgold,shopstplatinum,shopstplatinum,shopstplatinum,shopstplatinum,shopstplatinum,shopstplatinum,shopstplatinum,shopstplatinum,skp_008', 
    true)

WebUI.selectOptionByValue(findTestObject('Plans and Products/Page_PNDS (8)/select_--- Choose One ---BlueC'), 'indivstbronze,indivstbronze,indivchildonlybronze,indivstsilver,indivchildonlysilver,indivstgold,indivchildonlygold,indivstplatinum,indivchildonlyplatinum,indivnonstplatinum1,indivnonstplatinum1,indivnonstgold1,indivnonstgold1,indivnonstsilver1,indivnonstsilver1,indivstbronze,indivstbronze,indivstsilver,indivstgold,indivstplatinum', 
    true)

WebUI.closeBrowser()

