import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class test {

    public static Piece[] createPieceObjects() {
        Piece PieceArr[] = new Piece[31];

        //Create Array of objects to store sale items as objects
        PieceArr[0] = new Piece("Rick Owens Vomit Trench Coat", "https://www.grailed.com/listings/11435201-Rick-Owens-Vomit-Trench-Coat");
        PieceArr[1] = new Piece("Raf Simons Poltergeist Crewneck", "https://www.grailed.com/listings/11435210-Raf-Simons-Poltergeist-Crewneck");
        PieceArr[2] = new Piece("Helmut Lang Bondage Pants", "https://www.grailed.com/listings/11435197-Helmut-Lang-Bondage-Pants");
        PieceArr[3] = new Piece("Undercover Bat Wing Backpack", "https://www.grailed.com/listings/11435213-Undercover-Bat-Wing-Backpack");
        PieceArr[4] = new Piece("Undercover Anatomicouture Ribcage Bomber", "https://www.grailed.com/listings/11435198-Undercover-Anitomicouture-Ribcage-Bomber-Jacket");
        PieceArr[5] = new Piece("SLP Razor Blade Sweater", "https://www.grailed.com/listings/11435196-Saint-Laurent-Paris-Razor-Blade-Sweater");
        PieceArr[6] = new Piece("Vintage The Shining Tee", "https://www.grailed.com/listings/11435185-Vintage--Here-s-Johnny--The-Shining-Tee");
        PieceArr[7] = new Piece("Supreme Skull Pile Jacket", "https://www.grailed.com/listings/11435217-Supreme-Skull-Pile-Jacket");
        PieceArr[8] = new Piece("Number (N)ine Double Skull Hoodie", "https://www.grailed.com/listings/11435207-Number--N-ine-Double-Skull-Hoodie");
        PieceArr[9] = new Piece("Supreme Spider Web Sweatpants", "https://www.grailed.com/listings/11435191-Supreme-Spider-Web-Sweatpants");
        PieceArr[10] = new Piece("Ambush x Bape Melting Necklace", "https://www.grailed.com/listings/11435182-Ambush-Design---Bape-Melting-Necklace");
        PieceArr[11] = new Piece("Undercover But Beautiful Reconstructed Blazer", "https://www.grailed.com/listings/11435190-Undercover-But-Beautiful-Reconstructed-Blazer");
        PieceArr[12] = new Piece("MiharaYasuhiro Distressed Striped Sweater", "https://www.grailed.com/listings/11435181-Miharayasuhiro-Distressed-Striped-Sweater");
        PieceArr[13] = new Piece("Michael Myers Halloween Tee", "https://www.grailed.com/listings/11435183-Vintage-Michael-Myers-Halloween-Tee");
        PieceArr[14] = new Piece("Junya Watanabe Distressed Biker Boots", "https://www.grailed.com/listings/11435203-Junya-Watanabe-Distressed-Biker-Boots");
        PieceArr[15] = new Piece("Palace Funder Jacket", "https://www.grailed.com/listings/11435205-Palace-Funder-Jacket");
        PieceArr[16] = new Piece("CPFM Kids See Ghosts Longsleeve", "https://www.grailed.com/listings/11435180-Cactus-Plant-Flea-Market-Kids-See-Ghosts--Longsleeve-Tee");
        PieceArr[17] = new Piece("Number (N)ine Led Zeppelin Skull Tee", "https://www.grailed.com/listings/11435204-Number--N-ine-Led-Zeppelin-Skull-Tee");
        PieceArr[18] = new Piece("JPG Cyber Irridescent Bag", "https://www.grailed.com/listings/11435192-Jean-Paul-Gaultier-Cyber-Irridescent-Bag");
        PieceArr[19] = new Piece("Kapital Skeleton Crewneck", "https://www.grailed.com/listings/11435215-Kapital-Skeleton-Crewneck");
        PieceArr[20] = new Piece("Undercover Bug Denim", "https://www.grailed.com/listings/11435187-Undercover-Bug-Denim");
        PieceArr[21] = new Piece("Medicom Bearbrick Halloween Toys", "https://www.grailed.com/listings/11435178-Medicom-Bearbrick--Happy-Halloween--Toys");
        PieceArr[22] = new Piece("Nike x Off-White Hallow's Eve Blazer", "https://www.grailed.com/listings/11435199-Nike---Off-White-Hallow-s-Eve-Blazer");
        PieceArr[23] = new Piece("Vintage Blair Witch Project Tee", "https://www.grailed.com/listings/11435186-Vintage-Missing--Blair-Witch-Project-Tee");
        PieceArr[24] = new Piece("Helmut Lang Prisoner Pants", "https://www.grailed.com/listings/11435211-Helmut-Lang-Prisoner-Pants");
        PieceArr[25] = new Piece("Nike Janoski 'Wino'", "https://www.grailed.com/listings/11435188-Nike-Stefan-Janoski--Wino-");
        PieceArr[26] = new Piece("Supreme Hellraiser Trench Coat", "https://www.grailed.com/listings/11435206-Supreme-Hellraiser-Trench-Coat");
        PieceArr[27] = new Piece("Supreme Excorcist Tee", "https://www.grailed.com/listings/11435202-Supreme-Exorcist-Tee");
        PieceArr[28] = new Piece("Undercover Blade Bracelet", "https://www.grailed.com/listings/11435189-Undercover-Razor-Blade-Bracelet");
        PieceArr[29] = new Piece("Rick Owens Babel Geobasket", "https://www.grailed.com/listings/11435194-Rick-Owens-Babel-Geobasket");
        PieceArr[30] = new Piece("Vintage Texas Chainsaw Massacre Tee", "https://www.grailed.com/listings/11435184-Vintage-Texas-Chainsaw-Massacre-Sleeveless-Tee");
        return(PieceArr);
    }


    public static void main(String args[]) {

        WebDriver driver;

        Piece[] Pieces = createPieceObjects();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Paypal Email");
        String paypalEmail = sc.nextLine();
        System.out.println("Enter Paypal Password");
        String paypalPassword = sc.nextLine();

        //set chromedriver path
        System.setProperty("webdriver.chrome.driver", "chromedriver");

        //disable loading of images for faster browsing
        //can't use because grailed implements captcha
        /*
        ChromeOptions options = new ChromeOptions();
        HashMap<String, Object> images = new HashMap<String, Object>();
        images.put("images", 2);
        HashMap<String, Object> prefs = new HashMap<String, Object>();
        prefs.put("profile.default_content_setting_values", images);
        options.setExperimentalOption("prefs", prefs);
        */

        //initialize webDriver
        driver = new ChromeDriver();

        //if program can't find element in 1 second, error will be raised
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);


        //go to sale page url
        driver.get("https://www.grailed.com/drycleanonly/halloween-sale/");

        System.out.println("Type the number of the item you want");

        //print list of items
        for (int i = 0; i<Pieces.length; i++) {
            System.out.println((i+1) + ". " + Pieces[i].getName());
        }

        int userSelection = sc.nextInt();

        while (true) {
            System.out.println("Log into grailed, then type anything in the terminal and press enter");
            String userLoggedIn = sc.nextLine();
            if (userLoggedIn.length() > 0) {
                break;
            }
        }

        //user selected object
        Piece selectedPiece = Pieces[userSelection - 1];


        //go to url of piece
        driver.get(selectedPiece.getUrl());
        //while statements handle slow loading of pages due to traffic
        while(true) {
            try {
                //if url is accessed before 10/31 @ 1:31pm EST, redirect will occur
                //if buyButton isn't found, program will go to url of item until it can find the button
                WebElement buyButton = driver.findElement(By.xpath("//button[@title='PURCHASE']"));
                System.out.println("Item now available for purchase");
                buyButton.click();
                break;
            } catch (Exception e) {
                System.out.println(e);
                System.out.println("Item not yet available (Able to purchase on 10/31/19 @ 1:31pm EST");
                driver.get(selectedPiece.getUrl());

            }
        }


        System.out.println("Working...");

        while (true) {
            try {
                //open paypal portal
                driver.findElement(By.className("-submit")).click();
                break;
            } catch (Exception e) {
                System.out.println("Working on gtting to paypal portal");
            }
        }


        //paypal actions
        while (true) {
            try {
                WebElement paypalEmailInput = driver.findElement(By.id("email"));
                paypalEmailInput.sendKeys(paypalEmail);
                break;
            } catch (Exception e) {
                System.out.println("Working...");
            }
        }

        WebElement paypalnextButton = driver.findElement(By.id("btnNext"));
        paypalnextButton.click();

        while (true) {
            try {
                WebElement paypalPasswordInput = driver.findElement(By.id("password"));
                paypalPasswordInput.sendKeys(paypalPassword);
                break;
            }
            catch (Exception e) {
                System.out.println("Working...");
            }
        }
        //login into paypal
        driver.findElement(By.id("btnLogin")).click();

        while(true) {
            try {
                WebElement pay = driver.findElement(By.xpath("//button[@value='Pay Now']"));
                //pay.click();
                break;
            } catch (Exception e) {
                System.out.println("Working...");
            }
            try {
                driver.findElement(By.id("notNowLink")).click();
            } catch (Exception e) {
                System.out.println("Working...");
            }
        }

    }
}