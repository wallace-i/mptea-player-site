package dev.iandw.mpteaplayersite.views.mpteaplayer;

import com.vaadin.flow.component.Unit;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouteAlias;
import com.vaadin.flow.server.StreamResource;
import com.vaadin.flow.theme.lumo.LumoUtility;
import dev.iandw.mpteaplayersite.views.MainLayout;

@PageTitle("mpTea Player")
@Route(value = "hello", layout = MainLayout.class)
@RouteAlias(value = "", layout = MainLayout.class)
public class MpTeaPlayerView extends VerticalLayout {

    public MpTeaPlayerView() {
        H2 welcome = new H2("Welcome to mpTea Player");
        welcome.addClassNames(LumoUtility.Margin.Top.XLARGE, LumoUtility.Margin.Bottom.MEDIUM, LumoUtility.Margin.Left.LARGE);

        Paragraph pWelcome = new Paragraph();
        pWelcome.add("mpTea Player is a light-weight music player and personal audio library. Akin to iTunes and Winamp and written in JavaFX," +
                "mpTea Player provides an easy, bloat-free way to organize and listen to your entire audio library, without the need to pay" +
                "a subscription service or be online.");
        pWelcome.addClassNames(LumoUtility.Margin.Bottom.MEDIUM, LumoUtility.Margin.Left.LARGE);

        Image player0 = new Image("images/player0.png", "player-screenshot-0");
//        player0.getStyle()
//        player0.
        add(welcome, pWelcome, player0);


    }

}
