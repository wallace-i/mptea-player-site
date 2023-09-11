package dev.iandw.mpteaplayersite.views.userinterface.trackcontrols;

import com.vaadin.flow.component.html.*;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.theme.lumo.LumoUtility;
import dev.iandw.mpteaplayersite.views.MainLayout;

import java.util.List;

@PageTitle("Track Controls")
@Route(value = "track-controls", layout = MainLayout.class)
public class ControlsView extends VerticalLayout {

    public ControlsView() {
        H2 h2Controls = new H2("Music Player Controls");
        h2Controls.addClassNames(LumoUtility.Margin.Top.XLARGE, LumoUtility.Margin.Bottom.MEDIUM, LumoUtility.Margin.Left.LARGE);

        HorizontalLayout horizontalLayout = new HorizontalLayout();
        horizontalLayout.addClassNames(LumoUtility.Margin.Bottom.MEDIUM, LumoUtility.Margin.Left.LARGE);

        ListItem listItem1 = new ListItem("Mute checkbox");
        ListItem listItem2 = new ListItem("Volume indicator (0-100)");
        ListItem listItem3 = new ListItem("Track time seeker");
        ListItem listItem4 = new ListItem("Volume slider");
        ListItem listItem5 = new ListItem("Select previous track played");
        ListItem listItem6 = new ListItem("Play or Pause currently selected track");
        ListItem listItem7 = new ListItem("Stop/unselect current track");
        ListItem listItem8 = new ListItem("Select next track");
        ListItem listItem9 = new ListItem("Auto Play next track");
        ListItem listItem10 = new ListItem("Shuffle the next track selected");
        ListItem listItem11 = new ListItem("Repeat currently selected track");
        Image mpTeaPlayerControls = new Image("images/mpTeaPlayerControls.png", "controls");

        OrderedList orderedList0 = new OrderedList(listItem1, listItem2, listItem3, listItem4, listItem5,
            listItem6, listItem7, listItem8, listItem9, listItem10, listItem11);

        horizontalLayout.add(orderedList0, mpTeaPlayerControls);

        add(h2Controls, horizontalLayout);
    }
}
