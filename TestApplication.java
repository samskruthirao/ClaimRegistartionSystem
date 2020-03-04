package com.capgemini.insurance.testing;

import static net.sourceforge.jwebunit.junit.JWebUnit.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
	 
import net.sourceforge.jwebunit.util.TestingEngineRegistry;
	 
	 
public class TestApplication  {
	    @Before
	    public void prepare() {
	        setTestingEngineKey(TestingEngineRegistry.TESTING_ENGINE_HTMLUNIT); 
	        setBaseUrl("http://localhost:8089/PLP");
	    }
	 
	   /* @Test
	    public void testIndexPage() {
	        beginAt("index.jsp"); 
	        assertTitleEquals("SafeHands");
	        getElementAttributeByXPath("//div[@id='loginboxid']","username");
	        getElementAttributeByXPath("//div[@id='loginboxid']","password");
	        getElementAttributeByXPath("//div[@id='loginboxid']","submit");
	        clickElementByXPath("//div[@id='loginboxid']");
	        //assertTitleEquals("insuredPage.jsp");
	        }
	    */
         @Test	    
	     public void testInsuredPage() {
	    	 beginAt("insuredPage.jsp");
	    	 assertTitleEquals("InsuredPage");
	    	 //clickElementByXPath("//div[@id='navid']");
	    	 
	     }
	    
	   
	    
	}

