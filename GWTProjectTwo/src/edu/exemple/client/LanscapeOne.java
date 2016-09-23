package edu.exemple.client;

import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.VerticalPanel;

public class LanscapeOne extends Composite {
	private VerticalPanel vpanel;
	 
	public  Image   LanscapeOne (){
		initWidget(this.vpanel);
		 Image img = new Image("images/barca.jpg");
		 this.vpanel.setBorderWidth(1);
		 // try to retern the path like array in projecttree!!
		//img.setWidth("500px");
		//img.setHeight("50px");
		//this.vpanel.add(img);
		 return img;
	}

}
