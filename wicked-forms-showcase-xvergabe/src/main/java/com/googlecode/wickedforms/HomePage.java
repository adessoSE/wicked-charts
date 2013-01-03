package com.googlecode.wickedforms;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.model.Model;
import org.apache.wicket.request.mapper.parameter.PageParameters;

import com.googlecode.wickedforms.example.Age;
import com.googlecode.wickedforms.example.Gender;
import com.googlecode.wickedforms.example.Person;
import com.googlecode.wickedforms.example.PersonForm;
import com.googlecode.wickedforms.model.FormModel;
import com.googlecode.wickedforms.wicket6.FormPanel;

public class HomePage extends WebPage {

	private static final long serialVersionUID = 1L;

	private final FormModel model;

	public HomePage(final PageParameters parameters) {

		final Person tom = new Person();
		tom.setLastName("Hombergs");
		tom.setGender(Gender.MALE);
		tom.setAge(Age.YOUNG);

		model = new PersonForm(tom);

		add(new FormPanel("dynamicForm", Model.of(model)) {

			@Override
			public void onSubmit(FormModel submittedData) {
				System.out.println(tom);
			}

		});

	}
}
