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

WebUI.click(findTestObject('Plans and Products/Page_PNDS (46)/a_Search by Health Plan'))

WebUI.selectOptionByValue(findTestObject('Plans and Products/Page_PNDS (46)/select_--- Choose one ---Aetna'), '0060', true)

WebUI.selectOptionByValue(findTestObject('Plans and Products/Page_PNDS (46)/select_--- Choose One ---Indep'), 'chpprovider', 
    true)

WebUI.selectOptionByValue(findTestObject('Plans and Products/Page_PNDS (46)/select_--- Choose One ---Indep'), 'bhp', true)

WebUI.selectOptionByValue(findTestObject('Plans and Products/Page_PNDS (46)/select_--- Choose One ---Indep'), 'harp', true)

WebUI.selectOptionByValue(findTestObject('Plans and Products/Page_PNDS (46)/select_--- Choose One ---Indep'), 'indivnonstplatinum2,indivnonstplatinum2,indivnonstgold2,indivnonstgold2', 
    true)

WebUI.selectOptionByValue(findTestObject('Plans and Products/Page_PNDS (46)/select_--- Choose One ---Indep'), 'indivstplatinum,indivstplatinum,indivchildonlyplatinum,indivnonstplatinum1,indivnonstplatinum1,indivstgold,indivstgold,indivchildonlygold,indivnonstgold1,indivnonstgold1,indivstsilver,indivstsilver,indivchildonlysilver,indivnonstsilver1,indivnonstsilver1,indivcatastrophic,indivnonstbronze2,indivstbronze,indivstbronze,indivchildonlybronze,indivnonstbronze1,indivnonstbronze1', 
    true)

WebUI.selectOptionByValue(findTestObject('Plans and Products/Page_PNDS (46)/select_--- Choose One ---Indep'), 'medicaidprovider', 
    true)

WebUI.selectOptionByValue(findTestObject('Plans and Products/Page_PNDS (46)/select_--- Choose One ---Indep'), 'shopnonstplatinum2,shopnonstplatinum2,shopnonstplatinum2,shopnonstplatinum2,shopnonstplatinum2,shopnonstplatinum2,shopnonstplatinum2,shopnonstplatinum2,shopnonstgold2,shopnonstgold2,shopnonstgold2,shopnonstgold2,shopnonstgold2,shopnonstgold2,shopnonstgold2,shopnonstgold2,shopnonstsilver2,shopnonstsilver2,shopnonstsilver2,shopnonstsilver2,shopnonstsilver2,shopnonstsilver2,shopnonstsilver2,shopnonstsilver2', 
    true)

WebUI.selectOptionByValue(findTestObject('Plans and Products/Page_PNDS (46)/select_--- Choose One ---Indep'), 'shopstplatinum,shopstplatinum,shopstplatinum,shopstplatinum,shopstplatinum,shopstplatinum,shopstplatinum,shopstplatinum,shopnonstplatinum3,shopnonstplatinum3,shopnonstplatinum3,shopnonstplatinum3,shopnonstplatinum3,shopnonstplatinum3,shopnonstplatinum3,shopnonstplatinum3,shopnonstplatinum1,shopnonstplatinum1,shopnonstplatinum1,shopnonstplatinum1,shopnonstplatinum1,shopnonstplatinum1,shopnonstplatinum1,shopnonstplatinum1,shopstgold,shopstgold,shopstgold,shopstgold,shopstgold,shopstgold,shopstgold,shopstgold,shopnonstgold1,shopnonstgold1,shopnonstgold1,shopnonstgold1,shopnonstgold1,shopnonstgold1,shopnonstgold1,shopnonstgold1,shopstsilver,shopstsilver,shopstsilver,shopstsilver,shopstsilver,shopstsilver,shopstsilver,shopstsilver,shopnonstsilver1,shopnonstsilver1,shopnonstsilver1,shopnonstsilver1,shopnonstsilver1,shopnonstsilver1,shopnonstsilver1,shopnonstsilver1,shopnonstsilver3,shopnonstsilver3,shopnonstsilver3,shopnonstsilver3,shopnonstsilver3,shopnonstsilver3,shopnonstsilver3,shopnonstsilver3,shopstbronze,sho', 
    true)

WebUI.selectOptionByValue(findTestObject('Plans and Products/Page_PNDS (46)/select_--- Choose One ---Indep'), 'commercialprovider', 
    true)

WebUI.closeBrowser()

