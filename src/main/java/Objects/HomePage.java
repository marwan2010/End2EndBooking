package Objects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class HomePage extends PagesBase {
	public HomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "//button[@class='a83ed08757 c21c56c305 f38b6daa18 d691166b09 ab98298258 deab83296e f4552b6561']")
	WebElement b2indexPage;

	@FindBy(name = "ss")
	WebElement txt_destination;

	

	@FindBy(xpath = "//span[@class='fcd9eec8fb a804864eef c2cc050fb8 c696a7d242']")
	WebElement picker;
	@FindBy(xpath = "//button[@data-testid='occupancy-config']")
	WebElement btn;
	@FindBy(xpath = "//button[@class='a83ed08757 c21c56c305 f38b6daa18 d691166b09 ab98298258 deab83296e bb803d8689 f4d78af12a']")
	List<WebElement> counter;

	@FindBy(xpath = "//div[@class='cabad3c686 aff44befa2']")
	WebElement dp_age;

	@FindBy(className = "ebf4591c8e")
	WebElement dp;

	@FindBy(xpath = "//button[@class='a83ed08757 c21c56c305 a4c1805887 f671049264 d2529514af c082d89982 aa11d0d5cd']")
	WebElement btnsearch;
	@FindBy(xpath = "//div[@data-testid='price-for-x-nights']")
	WebElement text;

	@FindBy(xpath = "//div[@data-filters-item='class:class=3']")
	WebElement chk;
	@FindBy(xpath = "//div[@aria-label='3 out of 5']")
	List<WebElement> star;
	@FindBy(xpath = "//h3[@aria-live='polite']")
	List<WebElement> test;

	public void enter_Depart_city(String value)

	{

		setTextElementText(txt_destination, value);
	}

	public void click_On_close()

	{

		clickButton(b2indexPage);

	}

	public void click_on_picker_date()

	{

		clickButton(picker);

	}

	public void click_Occupancy()

	{

		clickButton(btn);

	}

	public void numberOfAdulits()

	{

		clickButton(counter.get(1));

	}

	public void dpselectAge()

	{

		Select drppAge = new Select(dp);
		drppAge.selectByIndex(11);

	}

	public void clickFlightsearch()

	{

		clickButton(btnsearch);

	}

	public void check3star()

	{
		wait.until(ExpectedConditions.visibilityOf(chk)).click();

	}

	public void check_number_of_guest(String value) {
		if (text.getText().contains(value)) {
			System.out.println("Text: " + " is present. ");
		} else {
			System.out.println("Text: " + " is not present. ");
		}
	}

	public void check_number_star(String value) {
		wait.until(ExpectedConditions.visibilityOf(star.get(0)));

		if (star.get(0).getAttribute("aria-label").contains(value)) {
			System.out.println("value: " + " Attribute value is \" + . " + star.get(0).getAttribute("aria-label"));

		} else {
			System.out.println("value: " + " Attribute is not present. ");
		}

	}

}
