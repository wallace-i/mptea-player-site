package dev.iandw.mpteaplayersite.views.setup;

import com.flowingcode.vaadin.addons.carousel.Carousel;
import com.flowingcode.vaadin.addons.carousel.Slide;
import com.vaadin.flow.component.Unit;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.*;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.NumberField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.theme.lumo.LumoUtility;
import dev.iandw.mpteaplayersite.views.MainLayout;

@PageTitle("Setup")
@Route(value = "setup", layout = MainLayout.class)
public class SetupView extends VerticalLayout {

    public SetupView() {
        H2 h2Setup = new H2("Setting up mpTea Player");
        h2Setup.addClassNames(LumoUtility.Margin.Top.XLARGE, LumoUtility.Margin.Bottom.MEDIUM, LumoUtility.Margin.Left.LARGE);

        ListItem li0 = new ListItem("Open Settings menu option under 'File'.");
        ListItem li1 = new ListItem("Click Music Folder to initialize your music library.");
        ListItem li2 = new ListItem("Click Standard for an organized music folder, or Recursive for unorganized.");
        ListItem li3 = new ListItem("Select the Music Folder you would like to use in the App.");
        ListItem li4 = new ListItem("Wait for the program to initialize your music data.");
        ListItem li5 = new ListItem("Voila! You can now listen to all the music from your Music Folder.");

        OrderedList orderedList = new OrderedList(li0, li1, li2, li3, li4, li5);
        orderedList.addClassNames(LumoUtility.Margin.Bottom.MEDIUM, LumoUtility.Margin.Left.LARGE);

        Button next = new Button(">>");
        Button prev = new Button("<<");
        Button last = new Button(">|");
        Button first = new Button("|<");
        Paragraph pStep = new Paragraph("Step: ");
        NumberField nfStep = new NumberField();
        nfStep.setValue(1.0);
        nfStep.setWidth(40, Unit.PIXELS);
        Carousel carousel = createCarousel(next, prev, last, first, nfStep);
        carousel.getStyle().set("margin-left", "20px");
        HorizontalLayout buttons = new HorizontalLayout(first, prev, pStep, nfStep, next, last);
        buttons.getStyle().set("margin-left", "20px");

        add(h2Setup, orderedList, carousel, buttons);
    }

    private Carousel createCarousel(Button next, Button prev, Button last, Button first, NumberField nfStep) {
        Image setup0 = new Image("images/setup0.png", "setup0");
        Image setup1 = new Image("images/setup1.png", "setup1");
        Image setup2 = new Image("images/setup2.png", "setup2");
        Image setup3 = new Image("images/setup3.png", "setup3");
        Image setup4 = new Image("images/setup4.png", "setup4");
        Image setup5 = new Image("images/setup5.png", "setup5");
        Slide s0 = new Slide(setup0);
        Slide s1 = new Slide(setup1);
        Slide s2 = new Slide(setup2);
        Slide s3 = new Slide(setup3);
        Slide s4 = new Slide(setup4);
        Slide s5 = new Slide(setup5);

        final Carousel carousel = new Carousel(s0, s1, s2, s3, s4, s5).withoutNavigation();
        carousel.setSizeFull();

        next.addClickListener(e -> {
            carousel.moveNext();
            double slideNumber = nfStep.getValue();
            slideNumber = slideNumber >= 6.0 ? 1.0 : (slideNumber += 1.0);
            nfStep.setValue(slideNumber);
        });

        prev.addClickListener(e -> {
            carousel.movePrev();
            double slideNumber = nfStep.getValue();
            slideNumber = slideNumber <= 1.0 ? 6.0 : (slideNumber -= 1.0);
            nfStep.setValue(slideNumber);
        });

        last.addClickListener(e -> carousel.movePos(5));
        first.addClickListener(e -> carousel.movePos(0));

        return carousel;
    }
}
