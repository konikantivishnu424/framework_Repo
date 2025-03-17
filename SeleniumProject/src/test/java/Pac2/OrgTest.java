package Pac2;

import org.testng.annotations.Test;

public class OrgTest {

	@Test
	public void CreateOrgTest() {
		System.out.println("Execute CreateOrgtest");
		
		String URL=System.getProperty("url");
		String BROWSER=System.getProperty("browser","chrome");
		String USERNAME=System.getProperty("username");
		String PASSWORD=System.getProperty("password");
		
		System.out.println(URL);
		System.out.println(BROWSER);
		System.out.println(USERNAME);
		System.out.println(PASSWORD);
	}
	
	@Test
	public void ModifyOrgTest() {
		System.out.println("Execute ModifyOrgTest");
	}
}
