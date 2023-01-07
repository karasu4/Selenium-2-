package day11;
import com.beust.ah.A;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;
public class C01_Actions5 extends TestBase {
    @Test
    public void keyboardActionsTest(){
//
//        Google a gidin https://www.google.com
        driver.get("https://www.google.com");
       driver.findElement(By.xpath("//*[@id='W0wltc']")).click();
//      ‘iPhone X fiyatlari’ yazdir (SHIFT TUSUNA BASILARAK)
//      ‘ cok pahali!’ Yazdır (SHIFT TUSUNA BASILMAYARAK)
//        Ve ENTER tusuna bas
        WebElement aramaKutusu = driver.findElement(By.name("q"));
//        aramaKutusu.sendKeys("IPHONE X FIYATLARI" + Keys.ENTER);
        Actions actions = new Actions(driver);
        actions
                .keyDown(aramaKutusu,Keys.SHIFT)//arama kutusunun ustunde Shist tusuna bas
                .sendKeys("iPhone X fiyatlari")//shifte basiliyken yazi yaz
                .keyUp(aramaKutusu,Keys.SHIFT)//shift de artik basma
                .sendKeys("  cok pahali!"+Keys.ENTER)//normal halde yaz ve Enter tusuna bas
                .build()
                .perform();



                 //       ACTIONS CLASS'ı NEDİR? HANGİ METHODLAR İLE  NASIL KULLANILIR?..

                //   Actions classını kullanarak klavye ve mouse ile yapabileciğiz tüm işlemleri otomosyonda da  yapmamızı sağlamaktayız..!!
                //   Bu classa ait metdodlar kısaca aşağıdaki gibidir....

                //       actions.doubleClick () :   WebElement'e çift tıklama yapar
                //       actions.clickAndHold () :  Uzerinde click yapili olarak bekler
                //       actions .dragAndDrop () :  Bir noktadan diğerine sürükler ve bırakır
                //       actions.moveToElement () : Mouse'u istedigimiz WebElement'in uzerinde tutar
                //       actions.contextClick ():   Mouse ile istedigimiz WebElement'e sag tiklama yapar.
                //       actions.sendKeys() :       Öğeye bir dizi anahtar gönderir
                //       actions.keyDown () :       Klavyede tuşa basma işlemi gerçekleştirir
                //       actions.keyUp () :         Klavyede tuşu serbest bırakma işlemi gerçekleştirir
                //
                //
                //        !!!!Actions classını kullanmak için üç aşama vardır.

                //     1.Action classından obje üretiriz.
                //     (Actions actions= new Actions(driver);)
                //     2.actions objesi ile kullanacağımız web elementi locate ederiz...
                //     3.istediğimiz methodları action objesi ile kullanırız.
                //     actions.doubleClick(element ismi).perform;

        //////////////////////////////////////////////////////////////////////////
        /*
        1- Actions nedir? Actions Class nedir ?
*Actions selenium dan gelen bir kütüphanedir. Mouse ve Keyboard islemlerini gerçekleştirmek icin kullandigimiz hazır bir selenium kutuphanesidir. Ornegin, sag tiklamak(contextClick), çift tıklamak(doubleClick), elementin uzerine gitmek(moveToElement) gibi mouse islemlerini gerçekleştirebiliriz. Ayni zamanda, shift, control, delete, enter gibi keyboard tuslarinada actions yardımıyla basabiliriz. Bu tur islemlerde sendKeys metodu kullaninir.
2- Ne tur methodlar kullandin?
Actions metotlari onemlidir. Ve tekrar tekrar kullanmam gerektiğinden, Actions metotlarını içeren Reusable metodları oluşturdum. Ve gerektiğinde bu reusable metodları kullanıyorum. Ornegin rightClick methodunu bir elemente raga tiklamak icin test classimda vagira bilirim.
3- Hangi methodlari kullandin ne ne ise yarar?
Ornegin, sag tiklamak(contextClick), çift tıklamak(doubleClick), elementin uzerine gitmek(moveToElement) gibi mouse islemlerini gerçekleştirebiliriz. Ayni zamanda, shift, control, delete, enter gibi keyboard tuslarinada actions yardımıyla basabiliriz. Bu tur islemlerde sendKeys metodu kullaninir.
         */
    }
}