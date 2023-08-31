package dev.iandw.mpteaplayersite.views.mpteaplayer;

import com.flowingcode.vaadin.addons.carousel.Carousel;
import com.flowingcode.vaadin.addons.carousel.Slide;
import com.vaadin.flow.component.Unit;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.html.*;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.tabs.Tab;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouteAlias;
import com.vaadin.flow.theme.lumo.LumoUtility;
import dev.iandw.mpteaplayersite.views.MainLayout;
import dev.iandw.mpteaplayersite.views.install.InstallView;
import org.vaadin.stefan.table.Table;
import org.vaadin.stefan.table.TableCell;
import org.vaadin.stefan.table.TableRow;

import java.util.Iterator;
import java.util.List;

@PageTitle("mpTea Player")
@Route(value = "hello", layout = MainLayout.class)
@RouteAlias(value = "", layout = MainLayout.class)
public class MpTeaPlayerView extends VerticalLayout {

    public MpTeaPlayerView() {
        H2 h2Welcome = new H2("Welcome to mpTea Player");
        h2Welcome.addClassNames(LumoUtility.Margin.Top.XLARGE, LumoUtility.Margin.Bottom.MEDIUM, LumoUtility.Margin.Left.LARGE);

        // Welcome
        Paragraph pWelcome = new Paragraph();
        pWelcome.add("mpTea Player is a light-weight music player and personal audio library. Akin to iTunes and Winamp and written in JavaFX, " +
                "mpTea Player provides an easy, bloat-free way to organize and listen to your entire audio library, without the need to pay " +
                "a subscription service or be online.");
        pWelcome.addClassNames(LumoUtility.Margin.Bottom.MEDIUM, LumoUtility.Margin.Left.LARGE);


        // Image Carousel
        Image player0 = new Image("images/player0.png", "player0");
        Image player1 = new Image("images/player1.png", "player1");
        Image player3 = new Image("images/player3.png", "player3");

        Slide s1 = new Slide(player0);
        Slide s2 = new Slide(player1);
        Slide s3 = new Slide(player3);

        final Carousel carousel = new Carousel(s1, s2, s3).withoutNavigation();
        carousel.setSizeFull();
        //carousel.addClassNames(LumoUtility.JustifyContent.CENTER);

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
        buttons.setMaxHeight(400, Unit.PIXELS);

        /**
         *          GET STARTED GRID
         */
        Table welcomeTable = new Table();
        welcomeTable.addClassNames(LumoUtility.Margin.Top.MEDIUM);
        welcomeTable.getStyle().set("margin-left", "20px");
        welcomeTable.getStyle().set("border-collapse", "collapse");

        H3 h3Setup = new H3("Setup");
        H3 h3Use = new H3("Use");
        H3 h3Support = new H3("Support");
        Anchor aDownload = new Anchor("download", "Download");
        Anchor aInstall = new Anchor("install", "Install");
        Anchor aSetup = new Anchor("setup", "Setup");
        Anchor aControls = new Anchor("controls", "Controls");
        Anchor aFeatures = new Anchor("features", "Features");
        Anchor aImport = new Anchor("importing", "Importing");
        Anchor aContact = new Anchor("contact", "Contact");
        Anchor aDonate = new Anchor("donate", "Donate");

        // Row 0 to 1: Setup
        TableRow setupRow_0 = welcomeTable.addRow();
        TableCell cell_0_0  = setupRow_0.addDataCell();
        cell_0_0.add(h3Setup);
        cell_0_0.getStyle().set("background-color", "#f3f5f7");
        cell_0_0.getStyle().set("border-top", "1px solid #ddd");
        cell_0_0.getStyle().set("border-bottom", "0px");
        cell_0_0.getStyle().set("border-left", "0px");
        cell_0_0.getStyle().set("padding", "5px");
        TableCell cell_0_1 = setupRow_0.addDataCell();
        cell_0_1.add(aDownload);
        cell_0_1.add(", ");
        cell_0_1.add(aInstall);
        cell_0_1.add(", ");
        cell_0_1.add(aSetup);
        cell_0_1.getStyle().set("background-color", "#f3f5f7");
        cell_0_1.getStyle().set("border-top", "1px solid #ddd");
        cell_0_1.getStyle().set("padding", "5px");
        cell_0_1.getStyle().set("font-weight", "bold");

        TableRow setupRow_1 = welcomeTable.addRow();
        TableCell cell_1_0 = setupRow_1.addDataCell();
        cell_1_0.getStyle().set("background-color", "#f3f5f7");
        TableCell cell_1_1 = setupRow_1.addDataCell();
        cell_1_1.setText("Information on installing and configuring mpTea Player on your system.");
        cell_1_1.getStyle().set("border-top", "1px solid #ddd");
        cell_1_1.getStyle().set("padding", "5px");

        // Row 2 to 3: Use
        TableRow useRow_2 = welcomeTable.addRow();
        TableCell cell_2_0 = useRow_2.addDataCell();
        cell_2_0.add(h3Use);
        cell_2_0.getStyle().set("background-color", "#f3f5f7");
        cell_2_0.getStyle().set("border-top", "1px solid #ddd");
        cell_2_0.getStyle().set("border-left", "0px");
        cell_2_0.getStyle().set("padding", "5px");

        TableCell cell_2_1 = useRow_2.addDataCell();
        cell_2_1.add(aControls);
        cell_2_1.add(", ");
        cell_2_1.add(aFeatures);
        cell_2_1.add(", ");
        cell_2_1.add(aImport);
        cell_2_1.getStyle().set("background-color", "#f3f5f7");
        cell_2_1.getStyle().set("border-top", "1px solid #ddd");
        cell_2_1.getStyle().set("padding", "5px");
        cell_2_1.getStyle().set("font-weight", "bold");

        TableRow useRow_3 = welcomeTable.addRow();
        TableCell cell_3_0 = useRow_3.addDataCell();
        cell_3_0.getStyle().set("background-color", "#f3f5f7");
        TableCell cell_3_1 = useRow_3.addDataCell();
        cell_3_1.setText("Learn how to use the control bar, make playlists, change application styles, and import new artists, " +
                "albums, or individual tracks into your music library.");
        cell_3_1.getStyle().set("border-top", "1px solid #ddd");
        cell_3_1.getStyle().set("padding", "5px");

        // Row 4 to 5: Support
        TableRow supportRow_4 = welcomeTable.addRow();
        TableCell cell_4_0 = supportRow_4.addDataCell();
        cell_4_0.add(h3Support);
        cell_4_0.getStyle().set("background-color", "#f3f5f7");
        cell_4_0.getStyle().set("border-top", "1px solid #ddd");
        cell_4_0.getStyle().set("border-left", "0px");
        cell_4_0.getStyle().set("padding", "5px");

        TableCell cell_4_1 = supportRow_4.addDataCell();
        cell_4_1.add(aContact);
        cell_4_1.add(", ");
        cell_4_1.add(aDonate);
        cell_4_1.getStyle().set("background-color", "#f3f5f7");
        cell_4_1.getStyle().set("border-top", "1px solid #ddd");
        cell_4_1.getStyle().set("padding", "5px");
        cell_4_1.getStyle().set("font-weight", "bold");

        TableRow supportRow_5 = welcomeTable.addRow();
        TableCell cell_5_0 = supportRow_5.addDataCell();
        cell_5_0.getStyle().set("background-color", "#f3f5f7");
        cell_5_0.getStyle().set("border-bottom", "1px solid #ddd");
        TableCell cell_5_1 = supportRow_5.addDataCell();
        cell_5_1.setText("Information on how to contact and/or support the developer. Please send me your bugs if you find any!");
        cell_5_1.getStyle().set("border-top", "1px solid #ddd");
        cell_5_1.getStyle().set("border-bottom", "1px solid #ddd");
        cell_5_1.getStyle().set("padding", "5px");

        add(h2Welcome, pWelcome, welcomeTable, carousel, buttons);
    }



}
