package Pac1;

import org.testng.annotations.Test;

public class ContactTest {
	@Test()
	public void createContactTest() {
		
		String URL=System.getProperty("url");
		String BROWSER=System.getProperty("browser","chrome");
		String USERNAME=System.getProperty("username");
		String PASSWORD=System.getProperty("password");
		
		System.out.println(URL);
		System.out.println(BROWSER);
		System.out.println(USERNAME);
		System.out.println(PASSWORD);
		System.out.println("Execute CreatecontactTest");
	}

	@Test
	public void modifyContactTest() {
		System.out.println("Execute modifycontactTest");
	}

	@Test
	public void DeleteContactTest() {
		System.out.println("Execute DeletecontactTest");
	}

}
