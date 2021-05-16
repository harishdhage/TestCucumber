package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class ProductListingPage {
    public ProductListingPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.CSS, using = "button.single_add_to_cart_button")
    private WebElement btn_AddToCart;

    @FindAll(@FindBy(how = How.CSS, using = ".noo-product-inner"))
    private List<WebElement> prd_List;

    @FindBy(xpath = "//select[@id='pa_color']")
    private WebElement color;

    @FindBy(xpath = "//select[@id='pa_size']")
    private WebElement size;

    public void clickOn_AddToCart() {
        btn_AddToCart.click();
    }

    public void select_Product(int productNumber) {
        prd_List.get(productNumber).click();
    }

    public void setColor(){
        Select select = new Select(color);
        select.selectByVisibleText("White");
    }

    public void setSize(){
        Select select = new Select(size);
        select.selectByVisibleText("Medium");
    }

    public String getProductName(int productNumber) {
        return prd_List.get(productNumber).findElement(By.cssSelector("h3")).getText();
    }
}
