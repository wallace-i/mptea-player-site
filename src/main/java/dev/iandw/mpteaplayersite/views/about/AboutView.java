package dev.iandw.mpteaplayersite.views.about;

import com.vaadin.flow.component.html.*;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.theme.lumo.LumoUtility;
import dev.iandw.mpteaplayersite.views.MainLayout;

@PageTitle("About")
@Route(value = "about", layout = MainLayout.class)
public class AboutView extends VerticalLayout {

    public AboutView() {

        H2 h2Introduction = new H2("Introduction");
        h2Introduction.addClassNames(LumoUtility.Margin.Top.XLARGE, LumoUtility.Margin.Bottom.MEDIUM, LumoUtility.Margin.Left.LARGE);

        Paragraph pIntro = new Paragraph();
        pIntro.addClassNames(LumoUtility.Margin.Bottom.MEDIUM, LumoUtility.Margin.Left.LARGE);
        pIntro.add("mpTea player began as a small mp3 player project based on a coding project in " +
                "my Java textbook. With the addition of features such as saving music library data and " +
                "playlist creation, it ballooned into a full-fledged media player. Personally, I use spotify " +
                "for most of my music streaming, however I have a large collection of digital media I have " +
                "accumulated over the years and I wanted to have an extremely light weight, easy to use " +
                "player so I can go back and listen to my old music. iTunes, while the standard, is also a storefront " +
                "and WinAmp, while highly customizable, has gone through many versions and I wanted to make my own, " +
                "simpler to use version of a music organizer and player.");

        H2 h2Objectives = new H2("mpTea Player's Objectives");
        h2Objectives.addClassNames(LumoUtility.Margin.Top.XLARGE, LumoUtility.Margin.Bottom.MEDIUM, LumoUtility.Margin.Left.LARGE);

        Paragraph pObjectives = new Paragraph();
        pObjectives.addClassNames(LumoUtility.Margin.Bottom.MEDIUM, LumoUtility.Margin.Left.LARGE);

        Anchor aReference = new Anchor("https://docs.oracle.com/javafx/2/api/javafx/scene/media/package-summary.html", "Package javafx.scene.media");

        pObjectives.add("mpTea Player aims to serve the simple need of playing a variety of audio files located " +
                "on the user's system. mpTea Player uses the JavaFX Media object and supports a variety of audio containers " +
                "such as AIFF, MP3, MP4, and WAV files. Refer to ");
        pObjectives.add(aReference);
        pObjectives.add(" for further information on the JavaFX Media object.");

        H3 h3Easy = new H3("Making listening to your music easy");
        h3Easy.addClassNames(LumoUtility.Margin.Top.XLARGE, LumoUtility.Margin.Bottom.MEDIUM, LumoUtility.Margin.Left.LARGE);

        Paragraph pEasy = new Paragraph();
        pEasy.addClassNames(LumoUtility.Margin.Bottom.MEDIUM, LumoUtility.Margin.Left.LARGE);

        pEasy.add("All the information you need to access a music library of any size is located in " +
                "two areas: one for artists and the other for their tracks. This offers a straight forward " +
                "approach to accessing your music library without sifting through file trees or a plethora of GUI modules.");

        add(h2Introduction, pIntro, h2Objectives, pObjectives, h3Easy, pEasy);
    }

}
