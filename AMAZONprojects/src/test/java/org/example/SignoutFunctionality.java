package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.sql.*;

public class SignoutFunctionality {
    @Test
    public void maintain() throws SQLException, ClassNotFoundException {
        String host="localhost";
        String port="3306";
       Connection con= DriverManager.getConnection("jdbc:mysql://"+host+":"+port+"/amazom","root","Rohit@1234");
        Class.forName("com.mysql.jdbc.Driver");
        Statement s=con.createStatement();
        ResultSet rs=s.executeQuery("select * from AazonCredentials where name='rohit';");
        while(rs.next())
        {
//            System.out.println(rs.getString("id"));
//            System.out.println(rs.getString("pass"));
            System.setProperty("webdriver.chrome.driver","C:\\Users\\Rohit\\IdeaProjects\\RealTimeProject\\chromedriver\\chromedriver.exe");
            WebDriver driver= new ChromeDriver();
            driver.get("https://www.amazon.com/");
            HomepageLocators homepageLocators=new HomepageLocators(driver);
            homepageLocators.getSignin().click();
            SigninPageLocators signinPageLocators=new SigninPageLocators(driver);
            signinPageLocators.getSignInTypeBox().sendKeys(rs.getString("id")+"@gmail.com");
            signinPageLocators.getCntinueAfterEnteringEmail().click();
            signinPageLocators.getPassword().sendKeys(rs.getString("pass"));
            signinPageLocators.getSubmit().click();
            homepageLocators.getMAinMenuAll().click();
            homepageLocators.getSignOut().click();
            Assert.assertEquals(homepageLocators.getHomePageSignInText().getText(),"Sign-In");
            driver.close();



        }






    }
}
