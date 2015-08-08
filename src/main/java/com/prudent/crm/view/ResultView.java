package com.prudent.crm.view;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.server.ExternalResource;
import com.vaadin.spring.annotation.SpringView;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Image;
import com.vaadin.ui.Label;
import com.vaadin.ui.Notification;
import com.vaadin.ui.Table;
import com.vaadin.ui.VerticalLayout;

@SpringView(name=ResultView.VIEW_NAME)
public class ResultView extends VerticalLayout implements View {
	public static final String VIEW_NAME="result";

	private static final long serialVersionUID = 1L;

	@SuppressWarnings({ "unused", "serial" })
	public ResultView() {
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
		Table table = new Table(null);		
		table.addContainerProperty("Name (Last, First)", String.class, null);
		table.addContainerProperty("SSN",  Integer.class, null);
		table.addContainerProperty("Address",  String.class, null);
		table.setWidth("800px");
		table.setPageLength(table.size());
		table.setColumnWidth("Name (Last, First)", 200);
		table.setColumnWidth("SSN", 100);
		table.setColumnWidth("Address", 459);
		
		table.addItem(new Object[]{"Li Mei",11122333,"Jersey City"}, 2);
		table.addItem(new Object[]{"Han Tian",22233444,"New York"}, 3);
		table.addItem(new Object[]{"Dong Zhe",33344555,"Queen"}, 4);
		
		Label ad1 = new Label("");
		ad1.setWidth(null);
		ad1.setHeight("30px");
		layout.addComponent(ad1);
		layout.addComponent(image);
		
		Label ad2 = new Label("");
		ad2.setWidth(null);
		ad2.setHeight("50px");
		layout.addComponent(ad2);
		/*Label result= new Label("Search Result :");
		layout.addComponent(result);*/
		layout.addComponent(table);
		
		layout.setComponentAlignment(image, Alignment.MIDDLE_CENTER);
		layout.setComponentAlignment(table, Alignment.MIDDLE_CENTER);		

		addComponent(layout);

	};

	@Override
	public void enter(ViewChangeEvent event) {
		// TODO Auto-generated method stub

		Notification.show("Welcome to the Result View");
	}


}
