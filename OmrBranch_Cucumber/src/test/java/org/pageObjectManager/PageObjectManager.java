package org.pageObjectManager;

import org.pages.BookHotelPage;
import org.pages.ExploreHotelPage;
import org.pages.LoginPage;
import org.pages.SelectHotelPage;

public class PageObjectManager {
	
	private LoginPage loginpage;
	private ExploreHotelPage exploreHotelPage;
	private SelectHotelPage selectHotelPage;
	private BookHotelPage bookHotelPage;
	public LoginPage getLoginpage() {
		return (loginpage==null)?loginpage=new LoginPage():loginpage;
	}
	public ExploreHotelPage getSearchHotelPage() {
		return (exploreHotelPage==null)?exploreHotelPage=new ExploreHotelPage():exploreHotelPage;
	}
	public SelectHotelPage getSelectHotelPage() {
		return (selectHotelPage==null)?selectHotelPage=new SelectHotelPage():selectHotelPage;
	}
	public BookHotelPage getBookHotelPage() {
		return (bookHotelPage==null)?bookHotelPage=new BookHotelPage():bookHotelPage;
	}
	
	
	
	
	
	
	
	

}
