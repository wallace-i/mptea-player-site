package dev.iandw.mpteaplayersite.views.userinterface.appinterface;

import com.vaadin.flow.component.html.*;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.theme.lumo.LumoUtility;
import dev.iandw.mpteaplayersite.views.MainLayout;

@PageTitle("Application Interface")
@Route(value = "app-interface", layout = MainLayout.class)
public class AppInterfaceView extends VerticalLayout {

    public AppInterfaceView() {
        H2 h2Controls = new H2("Navigating mpTea Player");
        h2Controls.addClassNames(LumoUtility.Margin.Top.XLARGE, LumoUtility.Margin.Bottom.MEDIUM, LumoUtility.Margin.Left.LARGE);
        Anchor aTrackControls = new Anchor("track-controls", "Track Controls");

        HorizontalLayout horizontalLayout = new HorizontalLayout();
        horizontalLayout.addClassNames(LumoUtility.Margin.Bottom.MEDIUM, LumoUtility.Margin.Left.LARGE);

        ListItem listItem1 = new ListItem("File Menu: access Import, Settings, or Exit the program");
        ListItem listItem2 = new ListItem("Edit Menu: Create or edit any user created playlists");
        ListItem listItem3 = new ListItem("Help Menu: View README.md file, console log, or code repository");
        ListItem listItem4 = new ListItem("Track Title");
        ListItem listItem5 = new ListItem("Album Title");
        ListItem listItem6 = new ListItem("Artist Name");
        ListItem listItem7 = new ListItem("Search function");
        ListItem listItem8 = new ListItem("Artist List");
        ListItem listItem9 = new ListItem("Playlist List");
        ListItem listItem10 = new ListItem("Track List - this panel will change based on Artist or Playlist selected");
        ListItem listItem11 = new ListItem(aTrackControls);
        Image mpTeaPlayerControls = new Image("images/mpTeaPlayerInterface.PNG", "interface");

        OrderedList orderedList0 = new OrderedList(listItem1, listItem2, listItem3, listItem4, listItem5,
                listItem6, listItem7, listItem8, listItem9, listItem10, listItem11);

        horizontalLayout.add(orderedList0, mpTeaPlayerControls);

        add(h2Controls, horizontalLayout);
    }
}
