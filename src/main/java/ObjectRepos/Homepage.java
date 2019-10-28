package ObjectRepos;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Homepage {

	
	@FindBy(xpath="//i[@class='menu-white-icon']")
	WebElement Menue;
	
	@FindBy(xpath="//a[@title='Met Store']")
	WebElement metStore;
	
	@FindBy(xpath="//i[@class='search-white-icon']")
	WebElement Search;
	
	@FindBy(xpath="//a[@title='User: Login']")
	WebElement Login;
	
	@FindBy(xpath="//a[@title='Metallica Home']")
	WebElement Mettalica_Home;
	
	@FindBy(xpath="//a[@title='All Within My Hands']")
	WebElement AWMH;
	
	@FindBy(xpath="//a[@title='Fifth Member Fan Club']")
	WebElement FMFC;
	
	@FindBy(xpath="//a[@title='View Cart']")
	WebElement View_Cart;
	
	
	//Menue->News
	@FindBy(xpath="")
	WebElement Menue_News;
	
	@FindBy(xpath="")
	WebElement Menue_in_the_Press;
	
	@FindBy(xpath="")
	WebElement Menue_Top_Of_That;
	
	//Menue->Tour
	@FindBy(xpath="")
	WebElement Menue_Upcoming_Dates;
	
	@FindBy(xpath="")
	WebElement Menue_Past_Dates;
	
	//Menue->Band
	@FindBy(xpath="")
	WebElement Menue_Timeline;
	
	@FindBy(xpath="")
	WebElement Menue_History;
	
	//Menue->Music
	@FindBy(xpath="")
	WebElement Menue_Release;
		
	@FindBy(xpath="")
	WebElement Menue_SongsLyrics;
		
	//Menue->Media
	@FindBy(xpath="")
	WebElement Menue_Videos;
		
	@FindBy(xpath="")
	WebElement Menue_Photos;
		
	@FindBy(xpath="")
	WebElement Menue_App;
	
	//Menue->Fan Club
	@FindBy(xpath="")
	WebElement Menue_FNews;
	
	@FindBy(xpath="")
	WebElement Menue_So_What;
	
	@FindBy(xpath="")
	WebElement Menue_Contests;
	
	@FindBy(xpath="")
	WebElement Menue_FVideos;
	
	@FindBy(xpath="")
	WebElement Menue_FPhotos;
	
	@FindBy(xpath="")
	WebElement Menue_Forums;
	
	@FindBy(xpath="")
	WebElement Menue_Local_Chapters;
		
	//Menue->Account
	@FindBy(xpath="")
	WebElement Menue_Login;
		
	@FindBy(xpath="")
	WebElement Menue_Register;
		
	@FindBy(xpath="")
	WebElement Menue_Customer_Service;
}
