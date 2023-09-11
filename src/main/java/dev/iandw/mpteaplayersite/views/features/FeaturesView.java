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
        h2Features.addClassNames(LumoUtility.Margin.Top.XLARGE, LumoUtility.Margin.Bottom.MEDIUM, LumoUtility.Margin.Left.LARGE);

        Paragraph pFeature = new Paragraph();
        pFeature.addClassNames(LumoUtility.Margin.Bottom.MEDIUM, LumoUtility.Margin.Left.LARGE);

        pFeature.add("The following are key features of mpTea Player in a nutshell:");

        UnorderedList unorderedList = new UnorderedList();
        unorderedList.addClassNames(LumoUtility.Margin.Bottom.MEDIUM, LumoUtility.Margin.Left.LARGE);

        ListItem item0 = new ListItem("Simple to set up - just initialize your music library and begin listening.");
        ListItem item1 = new ListItem("Easy to understand - minimal GUI interface allows for stream-lined access to your audio files.");
        ListItem item2 = new ListItem("Manage your library by importing more tracks or deleting them.");
        ListItem item3 = new ListItem("Plays a variety of audio file types, such as MP3, MP4, AIFF, and WAV.");
        ListItem item4 = new ListItem("Initialize your library by file structure or recursion- for organized or unorganized libraries.");
        ListItem item5 = new ListItem("Crate playlists to group your favorite tracks together.");
        ListItem item6 = new ListItem("Includes seven different application skins to style the player.");
        ListItem item7 = new ListItem("Snappy search functionality using Java Predicates.");
        ListItem item8 = new ListItem("Console Log available to see what is happening under the hood.");
        ListItem item9 = new ListItem("Edit track and artist information i.e. fix a typo in track title or artist name.");


        unorderedList.add(item0, item1, item2, item3, item4, item5, item6, item7, item8, item9);

        add(h2Features, pFeature, unorderedList);
    }

}
