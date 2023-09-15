package dev.iandw.mpteaplayersite.views.importing;

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

@PageTitle("Importing")
@Route(value = "importing", layout = MainLayout.class)
public class ImportView extends VerticalLayout {

    public ImportView() {
        H2 h2Import = new H2("Importing Music to mpTea Player");
        h2Import.addClassNames(LumoUtility.Margin.Top.XLARGE, LumoUtility.Margin.Bottom.MEDIUM, LumoUtility.Margin.Left.LARGE);

        H3 h3Importing = new H3("How Importing Works");
        h3Importing.addClassNames(LumoUtility.Margin.Bottom.MEDIUM, LumoUtility.Margin.Left.LARGE);
        Paragraph p0 = new Paragraph();
        p0.addClassNames(LumoUtility.Margin.Bottom.MEDIUM, LumoUtility.Margin.Left.LARGE);
        p0.add("Once the mpTea Player is initialized with the audio data from the Music Folder, " +
                "it is possible to add additional music with the import function. Importing audio files will " +
                "copy the content to the Music Folder selected. For example, a file imported from the Download folder will " +
                "be copied into the Music Folder, and from this location mpTea Player will access the audio file.");

        H3 h3How = new H3("How to Import");
        h3How.addClassNames(LumoUtility.Margin.Bottom.MEDIUM, LumoUtility.Margin.Left.LARGE);
        Paragraph p1 = new Paragraph();
        p1.addClassNames(LumoUtility.Margin.Left.LARGE);
        p1.add("To import new audio files, click 'File' in the Menu Bar, and then 'Import'. There are three " +
                "options:");
        UnorderedList unorderedList = new UnorderedList();
        unorderedList.addClassNames(LumoUtility.Margin.Left.LARGE);
        ListItem liArtist = new ListItem("Artist - folder which contains either album folders containing audio files or " +
                "the audio files themselves.");
        ListItem liAlbum = new ListItem("Album - folder which contains only audio files from the album.");
        ListItem liTrack = new ListItem("Track - single audio files containing one song/track.");
        unorderedList.add(liArtist, liAlbum, liTrack);

        Anchor aContact = new Anchor("contact", "contact");
        Paragraph p2 = new Paragraph();
        p2.addClassNames(LumoUtility.Margin.Bottom.MEDIUM, LumoUtility.Margin.Left.LARGE);
        p2.add("Below are a few examples of properly importing audio files. If there are any problems " +
                "try checking the console log for more information or ");
        p2.add(aContact);
        p2.add(" the developer.");

        // Import image Carousel
        Button next = new Button(">>");
        Button prev = new Button("<<");
        Button last = new Button(">|");
        Button first = new Button("|<");
        TextField tfSlideText = new TextField();
        tfSlideText.addClassNames(LumoUtility.Margin.Left.LARGE);
        tfSlideText.setValue("File -> Import -> Arist, Album, or Track");
        tfSlideText.setWidth(325, Unit.PIXELS);
        NumberField nfSlide = new NumberField();
        nfSlide.setValue(1.0);
        Carousel carousel = createCarousel(next, prev, last, first, tfSlideText, nfSlide);
        carousel.getStyle().set("margin-left", "20px");
        HorizontalLayout buttons = new HorizontalLayout(first, prev, next, last, tfSlideText);
        buttons.getStyle().set("margin-left", "20px");

        add(h2Import, h3Importing, p0, h3How, p1, unorderedList, p2, carousel, buttons);
    }

    private Carousel createCarousel(Button next, Button prev, Button last, Button first, TextField tfSlideText, NumberField nfSlide) {
        Image import0 = new Image("images/import0.png", "import0");
        Image import1 = new Image("images/import1.png", "import1");
        Image import1_1 = new Image("images/import1-2.png", "import1_1");
        Image import2 = new Image("images/import2.png", "import2");
        Image import2_2 = new Image("images/import2-2.png", "import2_2");
        Image import3 = new Image("images/import3.png", "import3");
        Image import3_3 = new Image("images/import3-2.png", "import3_3");
        Image import4 = new Image("images/import4.png", "import4");
        Slide s0 = new Slide(import0);
        Slide s1 = new Slide(import1);
        Slide s2 = new Slide(import1_1);
        Slide s3 = new Slide(import2);
        Slide s4 = new Slide(import2_2);
        Slide s5 = new Slide(import3);
        Slide s6 = new Slide(import3_3);
        Slide s7 = new Slide(import4);

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
            tfSlideText.setValue(getSlideText(7, tfSlideText.getValue()));
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
            case 1 -> { return "File -> Import -> Arist, Album, or Track"; }
            case 2 -> { return "Choosing an Artist Folder"; }
            case 3 -> { return "The Artist and every Album/Track are added"; }
            case 4 -> { return "Choosing an Album Folder"; }
            case 5 -> { return "The Artist and the Album selected are added"; }
            case 6 -> { return "Choosing a Track File"; }
            case 7 -> { return "The Artist and Track selected are added"; }
            case 8 -> { return "A warning is displayed if the import fails"; }
        }

        // default
        return slideText;
    }
}
