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

WebUI.click(findTestObject('Page_PNDS (20)/a_Search by Health Plan'))

WebUI.selectOptionByValue(findTestObject('Plans and Products/Page_PNDS (84)/select_--- Choose one ---Aetna'), '0001', true)

WebUI.selectOptionByValue(findTestObject('Plans and Products/Page_PNDS (84)/select_--- Choose One ---Aetna (1)'), 'fida', 
    true)

WebUI.selectOptionByValue(findTestObject('Plans and Products/Page_PNDS (84)/select_--- Choose One ---Aetna (1)'), 'partialcaps', 
    true)

WebUI.selectOptionByValue(findTestObject('Plans and Products/Page_PNDS (84)/select_--- Choose One ---Aetna (1)'), 'nonmcovision', 
    true)

WebUI.selectOptionByValue(findTestObject('Plans and Products/Page_PNDS (84)/select_--- Choose One ---Aetna (1)'), 'nonmcomedical', 
    true)

WebUI.selectOptionByValue(findTestObject('Plans and Products/Page_PNDS (84)/select_--- Choose One ---Aetna (1)'), 'nonmcomedical,skp_004', 
    true)

WebUI.selectOptionByValue(findTestObject('Plans and Products/Page_PNDS (84)/select_--- Choose One ---Aetna (1)'), 'nonmcomedical,skp_005', 
    true)

WebUI.selectOptionByValue(findTestObject('Plans and Products/Page_PNDS (84)/select_--- Choose One ---Aetna (1)'), 'nonmcodental', 
    true)

WebUI.selectOptionByValue(findTestObject('Plans and Products/Page_PNDS (84)/select_--- Choose One ---Aetna (1)'), 'nonmcodental,skp_007', 
    true)

WebUI.selectOptionByValue(findTestObject('Plans and Products/Page_PNDS (84)/select_--- Choose One ---Aetna (1)'), 'nonmcomedical,skp_008', 
    true)

WebUI.selectOptionByValue(findTestObject('Plans and Products/Page_PNDS (84)/select_--- Choose One ---Aetna (1)'), 'nonmcomedical,skp_009', 
    true)

WebUI.selectOptionByValue(findTestObject('Plans and Products/Page_PNDS (84)/select_--- Choose One ---Aetna (1)'), 'nonmcomedical,skp_010', 
    true)

WebUI.selectOptionByValue(findTestObject('Plans and Products/Page_PNDS (84)/select_--- Choose One ---Aetna (1)'), 'nonmcomedical,skp_011', 
    true)

WebUI.selectOptionByValue(findTestObject('Plans and Products/Page_PNDS (84)/select_--- Choose one ---Aetna'), '0006', true)

WebUI.selectOptionByValue(findTestObject('Plans and Products/Page_PNDS (84)/select_--- Choose One ---Affin'), 'chpprovider', 
    true)

WebUI.selectOptionByValue(findTestObject('Plans and Products/Page_PNDS (84)/select_--- Choose One ---Affin'), 'bhp,bhpplus', 
    true)

WebUI.selectOptionByValue(findTestObject('Plans and Products/Page_PNDS (84)/select_--- Choose One ---Affin'), 'harp', true)

WebUI.selectOptionByValue(findTestObject('Plans and Products/Page_PNDS (84)/select_--- Choose One ---Affin'), 'medicaidprovider', 
    true)

WebUI.selectOptionByValue(findTestObject('Plans and Products/Page_PNDS (84)/select_--- Choose One ---Affin'), 'medicaidadvantage', 
    true)

WebUI.selectOptionByValue(findTestObject('Plans and Products/Page_PNDS (84)/select_--- Choose one ---Aetna'), '0007', true)

WebUI.selectOptionByValue(findTestObject('Plans and Products/Page_PNDS (84)/select_--- Choose One ---AgeWe'), 'fida', true)

WebUI.selectOptionByValue(findTestObject('Plans and Products/Page_PNDS (84)/select_--- Choose One ---AgeWe'), 'partialcaps', 
    true)

WebUI.selectOptionByValue(findTestObject('Plans and Products/Page_PNDS (84)/select_--- Choose one ---Aetna'), '0008', true)

WebUI.selectOptionByValue(findTestObject('Plans and Products/Page_PNDS (84)/select_--- Choose One ---Alpha'), 'partialcaps', 
    true)

WebUI.selectOptionByValue(findTestObject('Plans and Products/Page_PNDS (84)/select_--- Choose one ---Aetna'), '0010', true)

WebUI.selectOptionByValue(findTestObject('Plans and Products/Page_PNDS (84)/select_--- Choose One ---Ameri'), 'nonmcodental', 
    true)

WebUI.selectOptionByValue(findTestObject('Plans and Products/Page_PNDS (84)/select_--- Choose One ---Ameri'), 'nonmcodental,skp_001', 
    true)

WebUI.selectOptionByValue(findTestObject('Plans and Products/Page_PNDS (84)/select_--- Choose One ---Ameri'), 'nonmcodental,skp_002', 
    true)

WebUI.selectOptionByValue(findTestObject('Plans and Products/Page_PNDS (84)/select_--- Choose One ---Ameri'), 'nonmcovision', 
    true)

WebUI.selectOptionByValue(findTestObject('Plans and Products/Page_PNDS (84)/select_--- Choose One ---Ameri'), 'nonmcovision,skp_004', 
    true)

WebUI.selectOptionByValue(findTestObject('Plans and Products/Page_PNDS (84)/select_--- Choose One ---Ameri'), 'nonmcovision,skp_005', 
    true)

WebUI.selectOptionByValue(findTestObject('Plans and Products/Page_PNDS (84)/select_--- Choose One ---Ameri'), 'nonmcovision,skp_006', 
    true)

WebUI.selectOptionByValue(findTestObject('Plans and Products/Page_PNDS (84)/select_--- Choose one ---Aetna'), '0011', true)

WebUI.selectOptionByValue(findTestObject('Plans and Products/Page_PNDS (84)/select_--- Choose One ---Amida'), 'hivsnp', 
    true)

WebUI.selectOptionByValue(findTestObject('Plans and Products/Page_PNDS (84)/select_--- Choose one ---Aetna'), '0012', true)

WebUI.selectOptionByValue(findTestObject('Plans and Products/Page_PNDS (84)/select_--- Choose One ---ArchC'), 'partialcaps', 
    true)

WebUI.selectOptionByValue(findTestObject('Plans and Products/Page_PNDS (84)/select_--- Choose One ---ArchC'), 'pace', true)

WebUI.selectOptionByValue(findTestObject('Plans and Products/Page_PNDS (84)/select_--- Choose one ---Aetna'), '0013', true)

WebUI.selectOptionByValue(findTestObject('Plans and Products/Page_PNDS (84)/select_--- Choose One ---AXA E'), 'nonmcodental', 
    true)

WebUI.selectOptionByValue(findTestObject('Plans and Products/Page_PNDS (84)/select_--- Choose One ---AXA E'), 'nonmcovision', 
    true)

WebUI.selectOptionByValue(findTestObject('Plans and Products/Page_PNDS (84)/select_--- Choose one ---Aetna'), '0184', true)

WebUI.selectOptionByValue(findTestObject('Plans and Products/Page_PNDS (84)/select_--- Choose One ---BlueC'), 'chpprovider', 
    true)

WebUI.selectOptionByValue(findTestObject('Plans and Products/Page_PNDS (84)/select_--- Choose One ---BlueC'), 'bhp', true)

WebUI.selectOptionByValue(findTestObject('Plans and Products/Page_PNDS (84)/select_--- Choose One ---BlueC'), 'indivstsilver,indivstgold,indivstplatinum,indivstbronze,indivstbronze,indivchildonlybronze,indivstsilver,indivchildonlysilver,indivnonstsilver1,indivnonstsilver1,indivnonstsilver3,indivnonstsilver3,indivstgold,indivchildonlygold,indivnonstgold1,indivnonstgold1,indivstplatinum,indivchildonlyplatinum,indivnonstplatinum1,indivnonstplatinum1,indivnonstplatinum3,indivnonstplatinum3,indivnonstbronze1,indivnonstbronze1,indivnonstgold2,indivnonstgold2,indivnonstsilver2,indivnonstsilver2,indivnonstbronze2,indivnonstbronze2,indivstbronze,indivstbronze,indivnonstplatinum2,indivnonstplatinum2', 
    true)

WebUI.selectOptionByValue(findTestObject('Plans and Products/Page_PNDS (84)/select_--- Choose One ---BlueC'), 'medicaidprovider', 
    true)

WebUI.selectOptionByValue(findTestObject('Plans and Products/Page_PNDS (84)/select_--- Choose One ---BlueC'), 'shopstbronze,shopstbronze,shopstbronze,shopstbronze,shopstsilver,shopstsilver,shopstsilver,shopstsilver,shopstgold,shopstgold,shopstgold,shopstgold,shopstplatinum,shopstplatinum,shopstplatinum,shopstplatinum,shopstplatinum,shopstplatinum,shopstplatinum,shopstplatinum,shopstbronze,shopstbronze,shopstbronze,shopstbronze,shopstsilver,shopstsilver,shopstsilver,shopstsilver,shopstgold,shopstgold,shopstgold,shopstgold,shopstplatinum,shopstplatinum,shopstplatinum,shopstplatinum,shopstplatinum,shopstplatinum,shopstplatinum,shopstplatinum', 
    true)

WebUI.selectOptionByValue(findTestObject('Plans and Products/Page_PNDS (84)/select_--- Choose One ---BlueC'), 'commercialprovider', 
    true)

WebUI.selectOptionByValue(findTestObject('Plans and Products/Page_PNDS (84)/select_--- Choose One ---BlueC'), 'indivpeddentallow,indivfamdental', 
    true)

WebUI.selectOptionByValue(findTestObject('Plans and Products/Page_PNDS (84)/select_--- Choose One ---BlueC'), 'shoppeddentallow,shopfamdental', 
    true)

WebUI.selectOptionByValue(findTestObject('Plans and Products/Page_PNDS (84)/select_--- Choose One ---BlueC'), 'shopstbronze,shopstbronze,shopstbronze,shopstbronze,shopstsilver,shopstsilver,shopstsilver,shopstsilver,shopstgold,shopstgold,shopstgold,shopstgold,shopstplatinum,shopstplatinum,shopstplatinum,shopstplatinum,shopstplatinum,shopstplatinum,shopstplatinum,shopstplatinum,shopstbronze,shopstbronze,shopstbronze,shopstbronze,shopstsilver,shopstsilver,shopstsilver,shopstsilver,shopstgold,shopstgold,shopstgold,shopstgold,shopstplatinum,shopstplatinum,shopstplatinum,shopstplatinum,shopstplatinum,shopstplatinum,shopstplatinum,shopstplatinum,skp_008', 
    true)

WebUI.selectOptionByValue(findTestObject('Plans and Products/Page_PNDS (84)/select_--- Choose One ---BlueC'), 'indivstbronze,indivstbronze,indivchildonlybronze,indivstsilver,indivchildonlysilver,indivstgold,indivchildonlygold,indivstplatinum,indivchildonlyplatinum,indivnonstplatinum1,indivnonstplatinum1,indivnonstgold1,indivnonstgold1,indivnonstsilver1,indivnonstsilver1,indivstbronze,indivstbronze,indivstsilver,indivstgold,indivstplatinum', 
    true)

WebUI.selectOptionByValue(findTestObject('Plans and Products/Page_PNDS (84)/select_--- Choose one ---Aetna'), '0147', true)

WebUI.selectOptionByValue(findTestObject('Plans and Products/Page_PNDS (84)/select_--- Choose One ---Capit'), 'commercialprovider', 
    true)

WebUI.selectOptionByValue(findTestObject('Plans and Products/Page_PNDS (84)/select_--- Choose One ---Capit'), 'chpprovider', 
    true)

WebUI.selectOptionByValue(findTestObject('Plans and Products/Page_PNDS (84)/select_--- Choose One ---Capit'), 'nonmcomedical', 
    true)

WebUI.selectOptionByValue(findTestObject('Plans and Products/Page_PNDS (84)/select_--- Choose One ---Capit'), 'harp', true)

WebUI.selectOptionByValue(findTestObject('Plans and Products/Page_PNDS (84)/select_--- Choose One ---Capit'), 'indivnonstsilver1,indivnonstsilver1,indivnonstsilver2,indivnonstsilver2,indivnonstbronze1,indivnonstbronze1,indivcatastrophic,indivstplatinum,indivstgold,indivstsilver,indivstbronze,indivstplatinum,indivstgold,indivstsilver,indivstbronze,indivchildonlybronze,indivchildonlygold,indivchildonlyplatinum,indivchildonlysilver,indivnonstplatinum1,indivnonstplatinum1,indivnonstgold1,indivnonstgold1', 
    true)

WebUI.selectOptionByValue(findTestObject('Plans and Products/Page_PNDS (84)/select_--- Choose One ---Capit'), 'medicaidprovider', 
    true)

WebUI.selectOptionByValue(findTestObject('Plans and Products/Page_PNDS (84)/select_--- Choose one ---Aetna'), '0016', true)

WebUI.selectOptionByValue(findTestObject('Plans and Products/Page_PNDS (84)/select_--- Choose One ---Catho'), 'pace', true)

WebUI.selectOptionByValue(findTestObject('Plans and Products/Page_PNDS (84)/select_--- Choose one ---Aetna'), '0020', true)

WebUI.selectOptionByValue(findTestObject('Plans and Products/Page_PNDS (84)/select_--- Choose One ---Cente'), 'pace', true)

WebUI.selectOptionByValue(findTestObject('Plans and Products/Page_PNDS (84)/select_--- Choose one ---Aetna'), '0096', true)

WebUI.selectOptionByValue(findTestObject('Plans and Products/Page_PNDS (84)/select_--- Choose One ---Cente_1'), 'fida', 
    true)

WebUI.selectOptionByValue(findTestObject('Plans and Products/Page_PNDS (84)/select_--- Choose One ---Cente_1'), 'partialcaps', 
    true)

WebUI.selectOptionByValue(findTestObject('Plans and Products/Page_PNDS (84)/select_--- Choose one ---Aetna'), '0157', true)

WebUI.selectOptionByValue(findTestObject('Plans and Products/Page_PNDS (84)/select_--- Choose One ---Cigna'), 'nonmcodental', 
    true)

WebUI.selectOptionByValue(findTestObject('Plans and Products/Page_PNDS (84)/select_--- Choose One ---Cigna'), 'nonmcovision', 
    true)

WebUI.selectOptionByValue(findTestObject('Plans and Products/Page_PNDS (84)/select_--- Choose One ---Cigna'), 'nonmcodental,skp_002', 
    true)

WebUI.selectOptionByValue(findTestObject('Plans and Products/Page_PNDS (84)/select_--- Choose One ---Cigna'), 'nonmcomedical', 
    true)

WebUI.selectOptionByValue(findTestObject('Plans and Products/Page_PNDS (84)/select_--- Choose One ---Cigna'), 'nonmcomedical,skp_004', 
    true)

WebUI.selectOptionByValue(findTestObject('Plans and Products/Page_PNDS (84)/select_--- Choose One ---Cigna'), 'nonmcomedical,skp_005', 
    true)

WebUI.selectOptionByValue(findTestObject('Plans and Products/Page_PNDS (84)/select_--- Choose one ---Aetna'), '0021', true)

WebUI.selectOptionByValue(findTestObject('Plans and Products/Page_PNDS (84)/select_--- Choose One ---Comme'), 'nonmcomedical', 
    true)

WebUI.selectOptionByValue(findTestObject('Plans and Products/Page_PNDS (84)/select_--- Choose One ---Comme'), 'nonmcomedical,skp_001', 
    true)

WebUI.selectOptionByValue(findTestObject('Plans and Products/Page_PNDS (84)/select_--- Choose One ---Comme'), 'nonmcomedical,skp_002', 
    true)

WebUI.selectOptionByValue(findTestObject('Plans and Products/Page_PNDS (84)/select_--- Choose one ---Aetna'), '0022', true)

WebUI.selectOptionByValue(findTestObject('Plans and Products/Page_PNDS (84)/select_--- Choose One ---Compl'), 'pace', true)

WebUI.selectOptionByValue(findTestObject('Plans and Products/Page_PNDS (84)/select_--- Choose one ---Aetna'), '0168', true)

WebUI.selectOptionByValue(findTestObject('Plans and Products/Page_PNDS (84)/select_--- Choose One ---Conso'), 'nonmcomedical', 
    true)

WebUI.selectOptionByValue(findTestObject('Plans and Products/Page_PNDS (84)/select_--- Choose One ---Conso'), 'nonmcomedical,skp_001', 
    true)

WebUI.selectOptionByValue(findTestObject('Plans and Products/Page_PNDS (84)/select_--- Choose One ---Conso'), 'nonmcomedical,skp_002', 
    true)

WebUI.selectOptionByValue(findTestObject('Plans and Products/Page_PNDS (84)/select_--- Choose one ---Aetna'), '0023', true)

WebUI.selectOptionByValue(findTestObject('Plans and Products/Page_PNDS (84)/select_--- Choose One ---Cryst'), 'commercialprovider', 
    true)

WebUI.selectOptionByValue(findTestObject('Plans and Products/Page_PNDS (84)/select_--- Choose One ---Cryst'), 'bhp,bhpplus', 
    true)

WebUI.selectOptionByValue(findTestObject('Plans and Products/Page_PNDS (84)/select_--- Choose One ---Cryst'), 'medicaidprovider', 
    true)

WebUI.selectOptionByValue(findTestObject('Plans and Products/Page_PNDS (84)/select_--- Choose one ---Aetna'), '0159', true)

WebUI.selectOptionByValue(findTestObject('Plans and Products/Page_PNDS (84)/select_--- Choose One ---Delaw'), 'nonmcomedical', 
    true)

WebUI.selectOptionByValue(findTestObject('Plans and Products/Page_PNDS (84)/select_--- Choose One ---Delaw'), 'nonmcomedical,skp_001', 
    true)

WebUI.selectOptionByValue(findTestObject('Plans and Products/Page_PNDS (84)/select_--- Choose One ---Delaw'), 'nonmcomedical,skp_002', 
    true)

WebUI.selectOptionByValue(findTestObject('Plans and Products/Page_PNDS (84)/select_--- Choose One ---Delaw'), 'nonmcomedical,skp_003', 
    true)

WebUI.selectOptionByValue(findTestObject('Plans and Products/Page_PNDS (84)/select_--- Choose one ---Aetna'), '0024', true)

WebUI.selectOptionByValue(findTestObject('Plans and Products/Page_PNDS (84)/select_--- Choose One ---Delta'), 'indivpeddentalhigh,indivadultdental', 
    true)

WebUI.selectOptionByValue(findTestObject('Plans and Products/Page_PNDS (84)/select_--- Choose One ---Delta'), 'indivfamdental', 
    true)

WebUI.selectOptionByValue(findTestObject('Plans and Products/Page_PNDS (84)/select_--- Choose One ---Delta'), 'shopfamdental', 
    true)

WebUI.selectOptionByValue(findTestObject('Plans and Products/Page_PNDS (84)/select_--- Choose One ---Delta'), 'shoppeddentalhigh,shopadultdental', 
    true)

WebUI.selectOptionByValue(findTestObject('Plans and Products/Page_PNDS (84)/select_--- Choose One ---Delta'), 'nonmcodental', 
    true)

WebUI.selectOptionByValue(findTestObject('Plans and Products/Page_PNDS (84)/select_--- Choose one ---Aetna'), '0164', true)

WebUI.selectOptionByValue(findTestObject('Plans and Products/Page_PNDS (84)/select_--- Choose One ---Denta'), 'nonmcodental', 
    true)

WebUI.selectOptionByValue(findTestObject('Plans and Products/Page_PNDS (84)/select_--- Choose one ---Aetna'), '0025', true)

WebUI.selectOptionByValue(findTestObject('Plans and Products/Page_PNDS (84)/select_--- Choose One ---Dentc'), 'indivpeddentalhigh,indivpeddentallow,indivadultdental,indivfamdental', 
    true)

WebUI.selectOptionByValue(findTestObject('Plans and Products/Page_PNDS (84)/select_--- Choose One ---Dentc'), 'shoppeddentalhigh,shoppeddentallow,shopadultdental,shopfamdental', 
    true)

WebUI.selectOptionByValue(findTestObject('Plans and Products/Page_PNDS (84)/select_--- Choose one ---Aetna'), '0026', true)

WebUI.selectOptionByValue(findTestObject('Plans and Products/Page_PNDS (84)/select_--- Choose One ---Dente'), 'indivpeddentallow,indivadultdental', 
    true)

WebUI.selectOptionByValue(findTestObject('Plans and Products/Page_PNDS (84)/select_--- Choose one ---Aetna'), '0027', true)

WebUI.selectOptionByValue(findTestObject('Plans and Products/Page_PNDS (84)/select_--- Choose One ---Easte'), 'nonmcovision', 
    true)

WebUI.selectOptionByValue(findTestObject('Plans and Products/Page_PNDS (84)/select_--- Choose One ---Easte'), 'nonmcovision,skp_001', 
    true)

WebUI.selectOptionByValue(findTestObject('Plans and Products/Page_PNDS (84)/select_--- Choose one ---Aetna'), '0028', true)

WebUI.selectOptionByValue(findTestObject('Plans and Products/Page_PNDS (84)/select_--- Choose One ---Eddy'), 'pace', true)

WebUI.selectOptionByValue(findTestObject('Plans and Products/Page_PNDS (84)/select_--- Choose one ---Aetna'), '0029', true)

WebUI.selectOptionByValue(findTestObject('Plans and Products/Page_PNDS (84)/select_--- Choose One ---Elant'), 'partialcaps', 
    true)

WebUI.selectOptionByValue(findTestObject('Plans and Products/Page_PNDS (84)/select_--- Choose one ---Aetna'), '0030', true)

WebUI.selectOptionByValue(findTestObject('Plans and Products/Page_PNDS (84)/select_--- Choose One ---Elder'), 'fida', true)

WebUI.selectOptionByValue(findTestObject('Plans and Products/Page_PNDS (84)/select_--- Choose One ---Elder'), 'partialcaps', 
    true)

WebUI.selectOptionByValue(findTestObject('Plans and Products/Page_PNDS (84)/select_--- Choose One ---Elder'), 'map', true)

WebUI.selectOptionByValue(findTestObject('Plans and Products/Page_PNDS (84)/select_--- Choose one ---Aetna'), '0031', true)

WebUI.selectOptionByValue(findTestObject('Plans and Products/Page_PNDS (84)/select_--- Choose One ---Elder_1'), 'fida', 
    true)

WebUI.selectOptionByValue(findTestObject('Plans and Products/Page_PNDS (84)/select_--- Choose One ---Elder_1'), 'partialcaps', 
    true)

WebUI.selectOptionByValue(findTestObject('Page_PNDS (19)/select_--- Choose one ---Aetna'), '0050', true)

WebUI.selectOptionByValue(findTestObject('Page_PNDS (19)/select_--- Choose One ---Emble'), 'chpprovider', true)

WebUI.selectOptionByValue(findTestObject('Page_PNDS (19)/select_--- Choose One ---Emble'), 'bhp,bhpplus', true)

WebUI.selectOptionByValue(findTestObject('Page_PNDS (19)/select_--- Choose One ---Emble'), 'harp', true)

WebUI.selectOptionByValue(findTestObject('Page_PNDS (19)/select_--- Choose One ---Emble'), 'indivstplatinum,indivstgold,indivstsilver,indivstbronze,indivcatastrophic,indivstbronze,indivchildonlybronze,indivstsilver,indivchildonlysilver,indivstgold,indivchildonlygold,indivstplatinum,indivchildonlyplatinum,indivnonstsilver1,indivnonstsilver1,indivchildonlysilver,indivnonstbronze1,indivnonstbronze1,indivchildonlybronze', 
    true)

WebUI.selectOptionByValue(findTestObject('Page_PNDS (19)/select_--- Choose One ---Emble'), 'medicaidprovider', true)

WebUI.selectOptionByValue(findTestObject('Page_PNDS (19)/select_--- Choose One ---Emble'), 'nonmcodental', true)

WebUI.selectOptionByValue(findTestObject('Page_PNDS (19)/select_--- Choose One ---Emble'), 'nonmcomedical', true)

WebUI.selectOptionByValue(findTestObject('Page_PNDS (19)/select_--- Choose One ---Emble'), 'commercialprovider', true)

WebUI.selectOptionByValue(findTestObject('Plans and Products/Page_PNDS (84)/select_--- Choose one ---Aetna'), '0057', true)

WebUI.selectOptionByValue(findTestObject('Plans and Products/Page_PNDS (84)/select_--- Choose One ---Empir'), 'indivpeddentalhigh,indivpeddentalhigh,indivadultdental,indivadultdental,indivfamdental,indivfamdental,indivfamdental,indivfamdental', 
    true)

WebUI.selectOptionByValue(findTestObject('Plans and Products/Page_PNDS (84)/select_--- Choose One ---Empir'), 'indivstbronze,indivstbronze,indivnonstbronze1,indivnonstbronze1,indivstsilver,indivstsilver,indivnonstsilver1,indivnonstsilver1,indivstgold,indivstgold,indivstplatinum,indivstplatinum,indivcatastrophic,indivcatastrophic,indivstbronze,indivstbronze,indivnonstbronze1,indivnonstbronze1,indivstsilver,indivstsilver,indivnonstsilver1,indivnonstsilver1,indivstgold,indivstgold,indivstplatinum,indivstplatinum,indivchildonlybronze,indivchildonlybronze,indivchildonlysilver,indivchildonlysilver,indivchildonlygold,indivchildonlygold,indivchildonlyplatinum,indivchildonlyplatinum,indivnonstgold1,indivnonstgold1,indivnonstgold1,indivnonstgold1,indivnonstplatinum1,indivnonstplatinum1,indivnonstplatinum1,indivnonstplatinum1,indivnonstsilver2,indivnonstsilver2,indivnonstsilver2,indivnonstsilver2,indivnonstbronze2,indivnonstbronze2,indivnonstbronze2,indivnonstbronze2,indivnonstgold2', 
    true)

WebUI.selectOptionByValue(findTestObject('Plans and Products/Page_PNDS (84)/select_--- Choose One ---Empir'), 'commercialprovider', 
    true)

WebUI.selectOptionByValue(findTestObject('Plans and Products/Page_PNDS (84)/select_--- Choose One ---Empir'), 'chpprovider', 
    true)

WebUI.selectOptionByValue(findTestObject('Plans and Products/Page_PNDS (84)/select_--- Choose One ---Empir'), 'bhp,bhpplus', 
    true)

WebUI.selectOptionByValue(findTestObject('Plans and Products/Page_PNDS (84)/select_--- Choose One ---Empir'), 'harp', true)

WebUI.selectOptionByValue(findTestObject('Plans and Products/Page_PNDS (84)/select_--- Choose One ---Empir'), 'partialcaps', 
    true)

WebUI.selectOptionByValue(findTestObject('Plans and Products/Page_PNDS (84)/select_--- Choose One ---Empir'), 'medicaidprovider', 
    true)

WebUI.selectOptionByValue(findTestObject('Plans and Products/Page_PNDS (84)/select_--- Choose One ---Empir'), 'medicaidadvantage', 
    true)

WebUI.selectOptionByValue(findTestObject('Plans and Products/Page_PNDS (84)/select_--- Choose One ---Empir'), 'map', true)

WebUI.selectOptionByValue(findTestObject('Plans and Products/Page_PNDS (84)/select_--- Choose One ---Empir'), 'nonmcomedical', 
    true)

WebUI.selectOptionByValue(findTestObject('Plans and Products/Page_PNDS (84)/select_--- Choose One ---Empir'), 'nonmcovision', 
    true)

WebUI.selectOptionByValue(findTestObject('Plans and Products/Page_PNDS (84)/select_--- Choose One ---Empir'), 'nonmcomedical,skp_012', 
    true)

WebUI.selectOptionByValue(findTestObject('Plans and Products/Page_PNDS (84)/select_--- Choose One ---Empir'), 'nonmcomedical,skp_013', 
    true)

WebUI.selectOptionByValue(findTestObject('Plans and Products/Page_PNDS (84)/select_--- Choose one ---Aetna'), '0038', true)

WebUI.selectOptionByValue(findTestObject('Plans and Products/Page_PNDS (84)/select_--- Choose One ---Excel'), 'chpprovider', 
    true)

WebUI.selectOptionByValue(findTestObject('Plans and Products/Page_PNDS (84)/select_--- Choose One ---Excel'), 'bhp,bhpplus', 
    true)

WebUI.selectOptionByValue(findTestObject('Plans and Products/Page_PNDS (84)/select_--- Choose One ---Excel'), 'harp', true)

WebUI.selectOptionByValue(findTestObject('Plans and Products/Page_PNDS (84)/select_--- Choose One ---Excel'), 'indivnonstgold2,indivnonstgold2,indivnonstsilver2,indivnonstsilver2', 
    true)

WebUI.selectOptionByValue(findTestObject('Plans and Products/Page_PNDS (84)/select_--- Choose One ---Excel'), 'indivnonstgold3,indivnonstgold3,indivnonstsilver3,indivnonstsilver3', 
    true)

WebUI.selectOptionByValue(findTestObject('Plans and Products/Page_PNDS (84)/select_--- Choose One ---Excel'), 'indivstplatinum,indivstplatinum,indivchildonlyplatinum,indivnonstplatinum1,indivnonstplatinum1,indivstgold,indivstgold,indivchildonlygold,indivstsilver,indivstsilver,indivchildonlysilver,indivnonstgold1,indivnonstgold1,indivstbronze,indivstbronze,indivchildonlybronze,indivnonstsilver1,indivnonstsilver1,indivnonstbronze1,indivnonstbronze1,indivstbronze,indivstbronze,indivchildonlybronze,indivcatastrophic', 
    true)

WebUI.selectOptionByValue(findTestObject('Plans and Products/Page_PNDS (84)/select_--- Choose One ---Excel'), 'medicaidprovider', 
    true)

WebUI.selectOptionByValue(findTestObject('Plans and Products/Page_PNDS (84)/select_--- Choose One ---Excel'), 'shopstbronze,shopstplatinum,shopstplatinum,shopstplatinum,shopstplatinum,shopstplatinum,shopstplatinum,shopstplatinum,shopstplatinum,shopnonstplatinum1,shopnonstplatinum1,shopnonstplatinum1,shopnonstplatinum1,shopnonstplatinum1,shopnonstplatinum1,shopnonstplatinum1,shopnonstplatinum1,shopnonstplatinum2,shopnonstplatinum2,shopnonstplatinum2,shopnonstplatinum2,shopnonstplatinum2,shopnonstplatinum2,shopnonstplatinum2,shopnonstplatinum2,shopnonstgold1,shopnonstgold1,shopnonstgold1,shopnonstgold1,shopnonstgold1,shopnonstgold1,shopnonstgold1,shopnonstgold1,shopstplatinum,shopstplatinum,shopstplatinum,shopstplatinum,shopstplatinum,shopstplatinum,shopstplatinum,shopstplatinum,shopstsilver,shopstsilver,shopstsilver,shopstsilver,shopstsilver,shopstsilver,shopstsilver,shopstsilver,shopstgold,shopstgold,shopstgold,shopstgold,shopstgold,shopstgold,shopstgold,shopstgold,shopnonstgold2,shopnonstgold2,shopnonstgold2,shopnonstgold2,shopnonstgold2,shopnonstgold2,shopnonstgold2,shopnonstgold2,shopstbronze,shopstbronze,shopstbro', 
    true)

WebUI.selectOptionByValue(findTestObject('Plans and Products/Page_PNDS (84)/select_--- Choose One ---Excel'), 'commercialprovider', 
    true)

WebUI.selectOptionByValue(findTestObject('Plans and Products/Page_PNDS (84)/select_--- Choose one ---Aetna'), '0042', true)

WebUI.selectOptionByValue(findTestObject('Plans and Products/Page_PNDS (84)/select_--- Choose One ---Exten'), 'partialcaps', 
    true)

WebUI.selectOptionByValue(findTestObject('Plans and Products/Page_PNDS (84)/select_--- Choose one ---Aetna'), '0043', true)

WebUI.selectOptionByValue(findTestObject('Plans and Products/Page_PNDS (84)/select_--- Choose One ---Fallo'), 'partialcaps', 
    true)

WebUI.selectOptionByValue(findTestObject('Plans and Products/Page_PNDS (84)/select_--- Choose One ---Fallo'), 'pace', true)

WebUI.closeBrowser()

