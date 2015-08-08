package com.prudent.crm.view;

import javax.annotation.PostConstruct;

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
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;

@SpringView(name = MainView.VIEW_NAME)
public class MainView extends VerticalLayout implements View {
	public static final String VIEW_NAME="";
	private static final long serialVersionUID = 1L;

	@SuppressWarnings("serial")
	@PostConstruct
	void init(){
		setSizeFull();

		VerticalLayout layout = new VerticalLayout();

		Image image = new Image(null, new ExternalResource(
				"https://media.licdn.com/mpr/mpr/p/7/005/075/3bb/1e40bf6.jpg"));
		GridLayout grid = new GridLayout(6, 2);
		grid.setSpacing(true);

		/* grid.setWidth("100px"); */
		/* grid.setHeight(200, Sizeable.UNITS_PIXELS); */
		Label ssnText = new Label("Search By SSN:   ");
		TextField ssn = new TextField("");

		Label nameText = new Label("Search By Name(Last,First):   ");
		TextField firstName = new TextField("");
		TextField lastName = new TextField("");
		Label quote = new Label(" - ");
		image.setAlternateText("PRUDENT ACCOUNTING SERVICES,LLC.");
		
		Button ssnGo = new Button("Go", new Button.ClickListener() {
			@Override
			public void buttonClick(ClickEvent event) {
				// go to search by ssn
			}
		});

		Button nameGo = new Button("Go", new Button.ClickListener() {
			@Override
			public void buttonClick(ClickEvent event) {
				// go to search by name
			}
		});

		grid.addComponent(ssnText, 0, 0);
		grid.addComponent(ssn, 1, 0);
		grid.addComponent(ssnGo, 3, 0);

		grid.addComponent(nameText, 0, 1);
		grid.addComponent(lastName, 1, 1);
		grid.addComponent(quote, 2, 1);
		grid.addComponent(firstName, 3, 1);
		grid.addComponent(nameGo, 4, 1);

		grid.setComponentAlignment(ssnText, Alignment.BOTTOM_LEFT);
		grid.setComponentAlignment(ssn, Alignment.MIDDLE_CENTER);
		grid.setComponentAlignment(ssnGo, Alignment.BOTTOM_LEFT);

		grid.setComponentAlignment(nameText, Alignment.BOTTOM_LEFT);
		grid.setComponentAlignment(lastName, Alignment.BOTTOM_CENTER);
		grid.setComponentAlignment(quote, Alignment.BOTTOM_CENTER);
		grid.setComponentAlignment(firstName, Alignment.BOTTOM_CENTER);
		grid.setComponentAlignment(nameGo, Alignment.BOTTOM_CENTER);
		
		Label ad1 = new Label("");
		ad1.setWidth(null);
		ad1.setHeight("30px");
		layout.addComponent(ad1);
		layout.addComponent(image);

		Label ad2 = new Label("");
		ad2.setWidth(null);
		ad2.setHeight("50px");
		layout.addComponent(ad2);

		layout.addComponent(grid);
		layout.setComponentAlignment(grid, Alignment.MIDDLE_CENTER);
		layout.setComponentAlignment(image, Alignment.MIDDLE_CENTER);

		addComponent(layout);

	};

	@Override
	public void enter(ViewChangeEvent event) {
		Notification.show("Welcome to the Main View");
	}

}
