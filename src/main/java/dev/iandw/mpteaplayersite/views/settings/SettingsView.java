package dev.iandw.mpteaplayersite.views.settings;

import com.flowingcode.vaadin.addons.carousel.Carousel;
import com.flowingcode.vaadin.addons.carousel.Slide;
import com.vaadin.flow.component.Unit;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.*;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.NumberField;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.theme.lumo.LumoUtility;
import dev.iandw.mpteaplayersite.views.MainLayout;

import java.util.List;

@PageTitle("Settings")
@Route(value = "settings", layout = MainLayout.class)
public class SettingsView extends VerticalLayout {

    public SettingsView() {
        H2 h2Settings = new H2("mpTea Player Settings");
        h2Settings.addClassNames(LumoUtility.Margin.Top.XLARGE, LumoUtility.Margin.Bottom.MEDIUM, LumoUtility.Margin.Left.LARGE);

        HorizontalLayout horizontalLayout = new HorizontalLayout();
        Image imageSettings = new Image("images/mpTeaPlayerSettings.PNG", "Settings");
        imageSettings.addClassNames(LumoUtility.Margin.Bottom.MEDIUM, LumoUtility.Margin.Left.LARGE);
        imageSettings.setSizeFull();

        OrderedList orderedList = new OrderedList();
        orderedList.addClassNames(LumoUtility.Margin.Right.LARGE);

        ListItem li0 = new ListItem("Music Folder: allows you to change which folder acts as the root directory for mpTea Player's " +
                "initialization function.");
        ListItem li1 = new ListItem("Reset Library: allows you to re-initialize your Music Library without having to re-select the same directory. " +
                "Reset will use your previous choice of Standard or Recursive initialization to reset the Music Library. Useful " +
                "for when any edits to track data (such as title) were made in error. This will also reset your playlists.");
        ListItem li2 = new ListItem("Clear Library: Removes all data from mpTea Player's data files. This does not affect your Music Folder " +
                "in any way. All modifications to file data are made within the mpTea Player program files.");
        ListItem li3 = new ListItem("Style Selector: Choose a style for mpTea Player. Requires restart to take effect.");

        orderedList.add(li0, li1, li2, li3);

        horizontalLayout.add(imageSettings, orderedList);

        /**
         *      Appearance Themes
         */
        H3 h3Style = new H3("mpTea Player Style Options");
        h3Style.addClassNames(LumoUtility.Margin.Bottom.MEDIUM, LumoUtility.Margin.Left.LARGE);

        Button next = new Button(">>");
        Button prev = new Button("<<");
        Button last = new Button(">|");
        Button first = new Button("|<");
        Paragraph pStep = new Paragraph("Style: ");
        TextField tfStyle = new TextField();
        tfStyle.setValue("Light");
        tfStyle.setWidth(80, Unit.PIXELS);
        NumberField nfSlide = new NumberField();
        nfSlide.setValue(1.0);
        Carousel carousel = createCarousel(next, prev, last, first, tfStyle, nfSlide);
        carousel.getStyle().set("margin-left", "20px");
        HorizontalLayout buttons = new HorizontalLayout(first, prev, pStep, tfStyle, next, last);
        buttons.getStyle().set("margin-left", "20px");

        add(h2Settings, horizontalLayout, h3Style, carousel, buttons);
    }

    private Carousel createCarousel(Button next, Button prev, Button last, Button first, TextField tfStyle, NumberField nfSlide) {
        Image styleLight = new Image("images/player0.png", "light");
        Image styleDark = new Image("images/player1.png", "dark");
        Image styleConsole = new Image("images/player4.png", "console");
        Image styleBlue = new Image("images/styleBlue.png", "blue");
        Image styleGreen = new Image("images/player3.png", "green");
        Image styleRed = new Image("images/styleRed.png", "red");
        Image stylePink = new Image("images/stylePink.png", "pink");
        Slide s0 = new Slide(styleLight);
        Slide s1 = new Slide(styleDark);
        Slide s2 = new Slide(styleConsole);
        Slide s3 = new Slide(styleBlue);
        Slide s4 = new Slide(styleGreen);
        Slide s5 = new Slide(styleRed);
        Slide s6 = new Slide(stylePink);

        final Carousel carousel = new Carousel(s0, s1, s2, s3, s4, s5, s6).withoutNavigation();
        carousel.setSizeFull();

        next.addClickListener(e -> {
            carousel.moveNext();
            double dSlide = nfSlide.getValue();
            dSlide = dSlide >= 7 ? 1 : dSlide + 1;
            tfStyle.setValue(getSlideText(dSlide, tfStyle.getValue()));
            nfSlide.setValue(dSlide);
        });

        prev.addClickListener(e -> {
            carousel.movePrev();
            double dSlide = nfSlide.getValue();
            dSlide = dSlide <= 1 ? 7 : dSlide - 1;
            tfStyle.setValue(getSlideText(dSlide, tfStyle.getValue()));
            nfSlide.setValue(dSlide);
        });

        last.addClickListener(e -> {
            carousel.movePos(6);
            tfStyle.setValue(getSlideText(7, tfStyle.getValue()));
            nfSlide.setValue(7.0);
        });

        first.addClickListener(e -> {
            carousel.movePos(0);
            tfStyle.setValue(getSlideText(1, tfStyle.getValue()));
            nfSlide.setValue(1.0);
        });

        return carousel;
    }

    private String getSlideText(double slideNumber, String slideText) {
        switch((int) slideNumber) {
            case 1 -> { return "Light"; }
            case 2 -> { return "Dark"; }
            case 3 -> { return "Console"; }
            case 4 -> { return "Blue"; }
            case 5 -> { return "Green"; }
            case 6 -> { return "Red"; }
            case 7 -> { return "Pink"; }
        }

        // default
        return slideText;
    }

}
