package com.prudent.crm.ui.view;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.server.ExternalResource;
import com.vaadin.spring.annotation.SpringView;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.GridLayout;
import com.vaadin.ui.Image;
import com.vaadin.ui.Label;
import com.vaadin.ui.Notification;
import com.vaadin.ui.VerticalLayout;

@SpringView(name=DetailView.VIEW_NAME)
public class DetailView extends VerticalLayout implements View{
	public static final String VIEW_NAME="detail";
	
	private static final long serialVersionUID = 1L;

	@SuppressWarnings({ "unused", "serial" })
	public DetailView() {
		setSizeFull();
		VerticalLayout layout = new VerticalLayout();
		Image image = new Image(null, new ExternalResource(
				"https://media.licdn.com/mpr/mpr/p/7/005/075/3bb/1e40bf6.jpg"));
		Button button = new Button("Go to Main Page", new Button.ClickListener() {
			@Override
			public void buttonClick(ClickEvent event) {
				getUI().getNavigator().navigateTo("");
			}
		});

		image.setAlternateText("PRUDENT ACCOUNTING SERVICES,LLC.");
		
		GridLayout detail=new GridLayout(5,1);
		
		
		Label l1=new Label("Name :"+"\t"+"Telephone/Cell :");
		l1.setCaption("TAXPAYER CONTACT");
		
		Label l2=new Label("Name :"+"\n");
		l2.setCaption("CURRENT YEAR");
		Label l3=new Label("Name :"+"\n");
		l3.setCaption("PRIOR YEARS");
		
		
	
		detail.setSpacing(true);
		detail.addComponent(l1,0,0);
		detail.addComponent(l2,2,0);
		detail.addComponent(l3,4,0);
		Label ad1 = new Label("");
		ad1.setWidth(null);
		ad1.setHeight("30px");
		layout.addComponent(ad1);
		layout.addComponent(image);
		
		Label ad2 = new Label("");
		ad2.setWidth(null);
		ad2.setHeight("50px");
		layout.addComponent(ad2);

		layout.addComponent(detail);
		
		layout.setComponentAlignment(image, Alignment.MIDDLE_CENTER);
		layout.setComponentAlignment(detail, Alignment.MIDDLE_CENTER);
		

		addComponent(layout);

	};

	@Override
	public void enter(ViewChangeEvent event) {
		Notification.show("Welcome to the Detail View");
	}




}
