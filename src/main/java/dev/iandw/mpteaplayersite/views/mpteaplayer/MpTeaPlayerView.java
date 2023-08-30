package dev.iandw.mpteaplayersite.views.mpteaplayer;

import com.flowingcode.vaadin.addons.carousel.Carousel;
import com.flowingcode.vaadin.addons.carousel.Slide;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouteAlias;
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

        Image player0 = new Image("images/player0.png", "player0");
        Image player1 = new Image("images/player1.png", "player1");
        Image player3 = new Image("images/player3.png", "player3");

        Slide s1 = new Slide(player0);
        Slide s2 = new Slide(player1);
        Slide s3 = new Slide(player3);

        final Carousel carousel = new Carousel(s1, s2, s3).withoutNavigation();
        carousel.setSizeFull();

        Button next = new Button(">>");
        Button prev = new Button("<<");
        Button last = new Button(">|");
        Button first = new Button("|<");

        next.addClickListener(e -> carousel.moveNext());
        prev.addClickListener(e -> carousel.movePrev());
        last.addClickListener(e -> carousel.movePos(2));
        first.addClickListener(e -> carousel.movePos(0));

        HorizontalLayout buttons = new HorizontalLayout(first, prev, next, last);
        buttons.setAlignItems(Alignment.CENTER);
        buttons.setJustifyContentMode(JustifyContentMode.START);
        buttons.setWidthFull();

        add(welcome, pWelcome, carousel, buttons);


    }



}
