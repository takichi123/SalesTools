package edu.exemple.client;

import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.VerticalPanel;

public class LandscapeTwo extends Composite {
	
private VerticalPanel vpanel;
	
	public Image LandscapeTwo (){
		initWidget(this.vpanel);
		Image img= new Image("images/madrid.png");
		img.setWidth("500px");
		//this.vpanel.add(img);
		return img;
	}

}
