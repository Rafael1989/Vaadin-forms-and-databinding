package com.vaadin.training.forms.ex2;

import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.HasSize;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.html.Paragraph;

public class ProductViewer extends Composite<FormLayout> implements HasSize{
    
    private final Paragraph nameText = new Paragraph();
    private final Paragraph priceText = new Paragraph();
    private final Paragraph availableText = new Paragraph();

    public ProductViewer(Product product) {
        final FormLayout layout = getContent();

        layout.addFormItem(nameText, "Name");
        layout.addFormItem(priceText, "Price");
        layout.addFormItem(availableText, "Available");
        
        refresh(product);
    }

    void refresh(Product product){
        nameText.setText(product.getName());
        priceText.setText(new CurrencyConverter().convertToPresentation(product.getPrice(), null));
        availableText.setText(String.valueOf(product.getAvailable()));
    }
}
