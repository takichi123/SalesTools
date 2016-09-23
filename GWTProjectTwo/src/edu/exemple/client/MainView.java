package edu.exemple.client;

import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.VerticalPanel;

public class MainView extends Composite {
	VerticalPanel VPANEL=new VerticalPanel();
	VerticalPanel contentPanel;
	
	public MainView (){
		initWidget(this.VPANEL);
		this.VPANEL.setBorderWidth(1);
		MenuView menu =new MenuView(this);
		this.VPANEL.add(menu);		
		//Label Textlbl= new Label("choose you team");
		//this.contentPanel.add(Textlbl);
		this.contentPanel=new VerticalPanel();
		this.VPANEL.add(contentPanel);
		
	}
	
	public void openLandscape1(){
		System.out.println("hi");
		LanscapeOne page1 =new LanscapeOne();
		this.contentPanel.clear();
		this.contentPanel.add(page1);
		this.contentPanel.add(page1);
	}
	
	public void openLandscape2(){
		LandscapeTwo page2 =new LandscapeTwo();
		this.contentPanel.clear();
		this.contentPanel.add(page2);
	 this.contentPanel.add(page2);
	}

}
