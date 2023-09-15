package dev.iandw.mpteaplayersite.views.playlists;

import com.flowingcode.vaadin.addons.carousel.Carousel;
import com.flowingcode.vaadin.addons.carousel.Slide;
import com.vaadin.flow.component.Unit;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.OrderedList;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.NumberField;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.theme.lumo.LumoUtility;
import dev.iandw.mpteaplayersite.views.MainLayout;

@PageTitle("Playlists")
@Route(value = "playlists", layout = MainLayout.class)
public class PlaylistsView extends VerticalLayout {

    public PlaylistsView() {
        H2 h2Playlist = new H2("Creating Playlists");
        h2Playlist.addClassNames(LumoUtility.Margin.Top.XLARGE, LumoUtility.Margin.Bottom.MEDIUM, LumoUtility.Margin.Left.LARGE);

        // Playlist image Carousel
        Button next = new Button(">>");
        Button prev = new Button("<<");
        Button last = new Button(">|");
        Button first = new Button("|<");
        TextField tfSlideText = new TextField();
        tfSlideText.addClassNames(LumoUtility.Margin.Left.LARGE);
        tfSlideText.setValue("Right click on 'Playlists' and select 'Create Playlist'");
        tfSlideText.setWidth(680, Unit.PIXELS);
        NumberField nfSlide = new NumberField();
        nfSlide.setValue(1.0);
        Carousel carousel = createCarousel(next, prev, last, first, tfSlideText, nfSlide);
        carousel.getStyle().set("margin-left", "20px");
        HorizontalLayout buttons = new HorizontalLayout(first, prev, next, last);
        buttons.getStyle().set("margin-left", "20px");

        add(h2Playlist, tfSlideText, carousel, buttons);
    }

    private Carousel createCarousel(Button next, Button prev, Button last, Button first, TextField tfSlideText, NumberField nfSlide) {
        Image playlist0 = new Image("images/playlist0.png", "playlist0");
        Image playlist1 = new Image("images/playlist1.png", "playlist1");
        Image playlist2 = new Image("images/playlist2.png", "playlist2");
        Image playlist3 = new Image("images/playlist3.png", "playlist3");
        Image playlist4 = new Image("images/playlist4.png", "playlist4");
        Image playlist5 = new Image("images/playlist5.png", "playlist5");
        Image playlist6 = new Image("images/playlist6.png", "playlist6");
        Image playlist7 = new Image("images/playlist7.png", "playlist7");

        Slide s0 = new Slide(playlist0);
        Slide s1 = new Slide(playlist1);
        Slide s2 = new Slide(playlist6);
        Slide s3 = new Slide(playlist2);
        Slide s4 = new Slide(playlist3);
        Slide s5 = new Slide(playlist4);
        Slide s6 = new Slide(playlist5);
        Slide s7 = new Slide(playlist7);

        final Carousel carousel = new Carousel(s0, s1, s2, s3, s4, s5, s6, s7).withoutNavigation();
        carousel.setSizeFull();

        next.addClickListener(e -> {
            carousel.moveNext();
            double dSlide = nfSlide.getValue();
            dSlide = dSlide >= 8 ? 1 : dSlide + 1;
            tfSlideText.setValue(getSlideText(dSlide, tfSlideText.getValue()));
            nfSlide.setValue(dSlide);
        });

        prev.addClickListener(e -> {
            carousel.movePrev();
            double dSlide = nfSlide.getValue();
            dSlide = dSlide <= 1 ? 8 : dSlide - 1;
            tfSlideText.setValue(getSlideText(dSlide, tfSlideText.getValue()));
            nfSlide.setValue(dSlide);
        });

        last.addClickListener(e -> {
            carousel.movePos(7);
            tfSlideText.setValue(getSlideText(8, tfSlideText.getValue()));
            nfSlide.setValue(8.0);
        });

        first.addClickListener(e -> {
            carousel.movePos(0);
            tfSlideText.setValue(getSlideText(1, tfSlideText.getValue()));
            nfSlide.setValue(1.0);
        });

        return carousel;
    }

    private String getSlideText(double slideNumber, String slideText) {
        switch((int) slideNumber) {
            case 1 -> { return "Right click on 'Playlists' and select 'Create Playlist'"; }
            case 2 -> { return "or click 'Edit' to select 'Create Playlist'"; }
            case 3 -> { return "Add a playlist title and hit 'OK'"; }
            case 4 -> { return "Right click on the track to add, click 'Add to Playlist', then select the correct playlist."; }
            case 5 -> { return "The track can now be selected from the playlist"; }
            case 6 -> { return "You can remove from playlist by right clicking and selecting 'Remove from playlist'"; }
            case 7 -> { return "The track has been removed"; }
            case 8 -> { return "Playlist can be removed in the same way, or have the title edited"; }
        }

        // default
        return slideText;
    }

}
