package day16;

import org.apache.poi.ss.usermodel.*;
import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C01_ExelRead {
    @Test
    public void readExelTest() throws IOException {
//  WORKBOOK > WORKSHEET/SHEET (SAYFA) > ROW (SATIR) > CELL (VERI HUCRESI)
        String path = "./src/test/java/resource/Capitals.xlsx";
        FileInputStream fileInputStream= new FileInputStream(path);

//        EXCEL DOSYASINI AC /WORKBOOK AC
        Workbook workbook = WorkbookFactory.create(fileInputStream);

//        SAYFAYI AC / Sheet1
       // Sheet sheet1 =workbook.getSheetAt(0);
        Sheet sheet1 =workbook.getSheet("Sheet1");
//        ILK SATIRA GIT / Row
        Row row1= sheet1.getRow(0);
//        INK SATIRDAKI ILK VERIYI AL
       Cell cell1= row1.getCell(0);

//        O VERIYI YAZDIR
        System.out.println(cell1);
 //        1. SATIR 2. SUTUN
        Cell cell12 = sheet1.getRow(0).getCell(1);
        System.out.println(cell12);
//        3.Satir 1.Sutun yazdir ve O verinin France oldugunu test et

        String cell31 = sheet1.getRow(2).getCell(0).toString();
        System.out.println(cell31);
        Assert.assertEquals("France",cell31);

//Exceldeki toplam kullanilan satir sayisini bul


        int toplamSatirSayisi = sheet1.getLastRowNum()+1;//son satir numarasi.index 0dan basliyor. sayma sayilari 1 den. +1 ekle
        System.out.println(toplamSatirSayisi);//11
// Kullanililan satir sayisini bul

        int kullanililanSatirSaysi = sheet1.getPhysicalNumberOfRows();
        System.out.println(kullanililanSatirSaysi);

//


    }
}
