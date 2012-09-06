package com.github.lalyos.kore;

import java.beans.PropertyEditorSupport;

public class PersonEditor extends PropertyEditorSupport{

    @Override
    public String getAsText() {
        return super.getAsText();
    }

    @Override
    public void setAsText(String textValue) throws IllegalArgumentException {
        String[] strings = textValue.split(",");
        String firstName = strings[0].trim();
        String lastName = strings[1].trim();
        Person value = new Person(firstName, lastName);
        setValue(value);
    }

}
