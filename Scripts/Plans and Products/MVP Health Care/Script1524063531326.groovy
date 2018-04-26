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

WebUI.click(findTestObject('Plans and Products/Page_PNDS (56)/a_Search by Health Plan'))

WebUI.selectOptionByValue(findTestObject('Plans and Products/Page_PNDS (56)/select_--- Choose one ---Aetna'), '0069', true)

WebUI.selectOptionByValue(findTestObject('Plans and Products/Page_PNDS (56)/select_--- Choose One ---MVP H'), 'chpprovider', 
    true)

WebUI.selectOptionByValue(findTestObject('Plans and Products/Page_PNDS (56)/select_--- Choose One ---MVP H'), 'bhp', true)

WebUI.selectOptionByValue(findTestObject('Plans and Products/Page_PNDS (56)/select_--- Choose One ---MVP H'), 'harp', true)

WebUI.selectOptionByValue(findTestObject('Plans and Products/Page_PNDS (56)/select_--- Choose One ---MVP H'), 'indivnonstplatinum3,indivnonstplatinum3,indivnonstgold3,indivnonstgold3', 
    true)

WebUI.selectOptionByValue(findTestObject('Plans and Products/Page_PNDS (56)/select_--- Choose One ---MVP H'), 'indivstbronze,indivstbronze,indivstsilver,indivstsilver,indivstgold,indivstgold,indivstplatinum,indivstplatinum,indivstbronze,indivstbronze,indivstgold,indivstgold,indivstsilver,indivstsilver,indivnonstbronze2,indivnonstsilver2,indivnonstgold1,indivnonstplatinum1,indivnonstbronze1,indivnonstsilver1,indivnonstplatinum2,indivnonstbronze2,indivnonstsilver1,indivnonstsilver2,indivnonstgold1,indivnonstplatinum1,indivnonstplatinum2,indivnonstbronze1,indivchildonlybronze,indivchildonlysilver,indivchildonlygold,indivchildonlyplatinum,indivchildonlybronze,indivchildonlygold,indivchildonlysilver,indivnonstbronze3,indivnonstsilver3,indivnonstgold2,indivnonstbronze3,indivnonstsilver3,indivnonstgold2,indivcatastrophic', 
    true)

WebUI.selectOptionByValue(findTestObject('Plans and Products/Page_PNDS (56)/select_--- Choose One ---MVP H'), 'medicaidprovider', 
    true)

WebUI.selectOptionByValue(findTestObject('Plans and Products/Page_PNDS (56)/select_--- Choose One ---MVP H'), 'shopstbronze,shopstbronze,shopstsilver,shopstsilver,shopstgold,shopstgold,shopstplatinum,shopstplatinum,shopstbronze,shopstbronze,shopstsilver,shopstsilver,shopstgold,shopstgold,shopstplatinum,shopstplatinum,shopstbronze,shopstbronze,shopstsilver,shopstsilver,shopstgold,shopstgold,shopstplatinum,shopstplatinum,shopstbronze,shopstbronze,shopstsilver,shopstsilver,shopstgold,shopstgold,shopstplatinum,shopstplatinum,shopstbronze,shopstbronze,shopstbronze,shopstbronze,shopstbronze,shopstbronze,shopstbronze,shopstbronze,shopstgold,shopstgold,shopstgold,shopstgold,shopstgold,shopstgold,shopstgold,shopstgold,shopstsilver,shopstsilver,shopstsilver,shopstsilver,shopstsilver,shopstsilver,shopstsilver,shopstsilver,shopnonstbronze2,shopnonstsilver2,shopnonstgold1,shopnonstplatinum1,shopnonstbronze1,shopnonstsilver1,shopnonstplatinum2,shopnonstbronze2,shopnonstsilver2,shopnonstgold1,shopnonstplatinum1,shopnonstbronze1,shopnonstsilver1,shopnonstplatinum2,shopnonstbronze2,shopnonstbronze2,shopnonstsilver1,shopnonstsilver1,sh', 
    true)

WebUI.selectOptionByValue(findTestObject('Plans and Products/Page_PNDS (56)/select_--- Choose One ---MVP H'), 'commercialprovider', 
    true)

WebUI.closeBrowser()

