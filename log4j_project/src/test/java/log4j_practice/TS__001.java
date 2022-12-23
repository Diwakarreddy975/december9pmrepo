package log4j_practice;


public class TS__001 extends BaseClass{
	PageObject_Home pgHome;
	public static void main(String[] args) throws Exception {
		
		init();
		setup("firefoxbrowser");
		navigateURL("amazonURL");
		PageObject_Home pgHome=new PageObject_Home(driver);
		pgHome.All();
		
		
	}

}
