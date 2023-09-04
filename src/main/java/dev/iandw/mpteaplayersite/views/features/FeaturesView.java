package dev.iandw.mpteaplayersite.views.features;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.charts.model.Items;
import com.vaadin.flow.component.html.*;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.theme.lumo.LumoUtility;
import com.vaadin.flow.theme.lumo.LumoUtility.Margin;
import dev.iandw.mpteaplayersite.views.MainLayout;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@PageTitle("Features")
@Route(value = "features", layout = MainLayout.class)
public class FeaturesView extends VerticalLayout {

    public FeaturesView() {

        H2 h2Features = new H2("Feature Summary");
        Paragraph pFeature = new Paragraph();
        pFeature.add("The following are key features of mpTea Player in a nutshell:");

        UnorderedList unorderedList = new UnorderedList();
        ListItem item0 = new ListItem("Simple to set up - just initialize your Music library and begin listening.");
        ListItem item1 = new ListItem("Easy to understand - minimal GUI interface allows for stream-lined access to your library.");
        ListItem item2 = new ListItem("Manage your library by importing more tracks or deleting them.");

        unorderedList.add(item0, item1, item2);

        add(h2Features, pFeature, unorderedList);
    }

}
