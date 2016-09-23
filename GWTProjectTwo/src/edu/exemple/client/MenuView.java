package edu.exemple.client;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HorizontalPanel;

public class MenuView extends Composite {
	private HorizontalPanel hpanel= new HorizontalPanel ();
	private MainView main ;
	
	public MenuView (  MainView main){
		initWidget(this.hpanel);
		this.main=main;
		Button lansc1btn = new Button ("Barca");
		this.hpanel.add(lansc1btn );
		Button lansc2btn = new Button ("real madrid");
		this.hpanel.add(lansc2btn);
		lansc1btn.addClickHandler(new ls1Clickhandler ());
		lansc2btn.addClickHandler( new ls2Clickhandler());
	}

	
	private class ls1Clickhandler implements ClickHandler{

		@Override
		public void onClick(ClickEvent event) {
			main.openLandscape1();
			
		}
		
	}
	
	private class ls2Clickhandler implements ClickHandler{

		@Override
		public void onClick(ClickEvent event) {
			main.openLandscape2();
			
		}
		
	}
}
