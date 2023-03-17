package com.GoogleThreadClasses;

import com.pages.GooglePage;

public class GoogleFeatureThread extends Thread{
	
	public String broswerName;
	
	GooglePage googlePage;
	
	//constructor
	public GoogleFeatureThread(String threadname , String browserName) {
		
		super(threadname);
		
		this.broswerName=browserName;
		
		googlePage = new GooglePage();
	
	}
	
	//override run() method:
	
	public void run() {
		
			System.out.println("thread started" +Thread.currentThread().getName());
			
			try {
				Thread.sleep(1000);
				googlePage.setup(this.broswerName);
				googlePage.googleSearchTest();
				
				
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			finally {
				
				googlePage.tearDown();
			}
			
			System.out.println("thread ended" +Thread.currentThread().getName());
	}
	
	}

