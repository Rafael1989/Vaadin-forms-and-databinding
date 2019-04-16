package com.vaadin.training.forms.ex2;

import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.HasComponents;
import com.vaadin.flow.component.HasSize;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.data.binder.Binder;
import com.vaadin.flow.data.binder.ValidationException;

import java.util.function.Consumer;

public class ProductEditor extends Composite<VerticalLayout> implements HasComponents, HasSize{
    public ProductEditor(Product product, Consumer<Product> productConsumer){
        final ProductFormLayout productEditLayout = new ProductFormLayout();
        
        final Binder<Product> binder = new Binder<>(Product.class);
        
        binder.forField(productEditLayout.getPriceField()).withConverter(new CurrencyConverter())
                .bind(Product::getPrice, Product::setPrice);
        
        binder.forField(productEditLayout.getAvailableField()).bind(Product::getAvailable, Product::setAvailable);
        
        binder.bindInstanceFields(productEditLayout);
        
        binder.readBean(product);
        
        final HorizontalLayout footer = new HorizontalLayout();
        
        footer.add(new Button("Save", event -> {
            try{
                binder.writeBean(product);
            
                productConsumer.accept(product);
            }catch(final ValidationException e){
                e.printStackTrace();
            }
        }));
        
        footer.add(new Button("Cancel", event -> binder.readBean(product)));
        footer.getThemeList().set("spacing", true);
        
        add(productEditLayout, footer);
    }
}
