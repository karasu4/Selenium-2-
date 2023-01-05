package day09;

import org.junit.Test;
import org.openqa.selenium.Cookie;
import utilities.TestBase;

import java.util.Set;

public class C04_Cookies extends TestBase {
    @Test
    public void handleCookiesTest(){

        //        Amazona git
        driver.get("https://www.amazon.com");
        waitFor(3);
//        1.toplam cookie sayisini bul
        Set<Cookie> allCookies = driver.manage().getCookies();
        int cookieSayisi = allCookies.size();
        System.out.println("Sayfada "+cookieSayisi+ " adet cookie var");
        //3. Bir Cookie yi smiyle bul
        //4. Yeni bir cookie ekle
        //5. Bir Cookie yi ismiyle sil
        //6. Tum cookie leri sil

    }
}
