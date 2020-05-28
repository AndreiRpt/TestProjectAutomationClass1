import org.testng.Assert;
import org.testng.annotations.Test;

import static java.lang.Thread.sleep;

public class GoogleSearchTest {

    /*
        1. open the google.com webpage
        2. in search box type query string and submit search
        3. verify that results page is showing up
        4. verify that amount of results is more than 100

     */


    //TODO refactor this to step by step format
    @Test
    public void testName001() {
        System.setProperty("webdriver.geck........")
        WebDriver driver = new FirefoxDriver();

        String queryString = "Portnov Computer School";

        driver.get("https://www.google.com");


        WebElement textInput = driver.findElement(By.cssSelector(".gLFyf"));
        textInput.sendKeys(queryString);
        textInput.submit();

        //TODO: read about try and catch block
        try {
            sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement resultsStatsElement = driver.findElement(By.id("result-stats"));
        String resultsStatsText = resultsStatsElement.getText();

        String[] stringArray = resultsStatsText.split(" ");

        String amountOfResults = stringArray[1];

        String amountOfResultsFixed = amountOfResults.replace(",", "");

        int amountOfResultsParsed = Integer.parseInt(amountOfResultsFixed);

        Assert.assertTrue(amountOfResultsParsed > 100);







    }
}
