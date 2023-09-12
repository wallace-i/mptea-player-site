package dev.iandw.mpteaplayersite.views.install;

import com.flowingcode.vaadin.addons.carousel.Carousel;
import com.flowingcode.vaadin.addons.carousel.Slide;
import com.vaadin.flow.component.Unit;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.*;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.NumberField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.theme.lumo.LumoUtility;
import dev.iandw.mpteaplayersite.views.MainLayout;

@PageTitle("Install")
@Route(value = "install", layout = MainLayout.class)
public class InstallView extends VerticalLayout {

    public InstallView() {
        H2 h2Install = new H2("How to install mpTea Player");
        h2Install.addClassNames(LumoUtility.Margin.Top.XLARGE, LumoUtility.Margin.Bottom.MEDIUM, LumoUtility.Margin.Left.LARGE);

        Paragraph paragraph0 = new Paragraph();
        paragraph0.addClassNames(LumoUtility.Margin.Bottom.MEDIUM, LumoUtility.Margin.Left.LARGE);

        Anchor aDownload = new Anchor("download", "downloaded");
        paragraph0.add("To install the application, after the installer is " + aDownload +
                ", there are a few simple steps to installation after launching the installer:");
        paragraph0.addClassNames(LumoUtility.Margin.Bottom.MEDIUM);

        ListItem li0 = new ListItem("Read the license agreement.");
        ListItem li1 = new ListItem("Create a shortcut.");
        ListItem li2 = new ListItem("Click Install.");
        ListItem li3 = new ListItem("Wait a few moments.");
        ListItem li4 = new ListItem("Launch the program!");

        OrderedList orderedList = new OrderedList(li0, li1, li2, li3, li4);
        orderedList.addClassNames(LumoUtility.Margin.Bottom.MEDIUM, LumoUtility.Margin.Left.LARGE);

        // Install image Carousel
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

        add(h2Install, paragraph0, orderedList, carousel, buttons);
    }

    private Carousel createCarousel(Button next, Button prev, Button last, Button first, NumberField nfStep) {
        Image install0 = new Image("images/install0.png", "install0");
        Image install1 = new Image("images/install1.png", "install1");
        Image install2 = new Image("images/install2.png", "install2");
        Image install3 = new Image("images/install3.png", "install3");
        Image install4 = new Image("images/install4.png", "install4");
        Slide s0 = new Slide(install0);
        Slide s1 = new Slide(install1);
        Slide s2 = new Slide(install2);
        Slide s3 = new Slide(install3);
        Slide s4 = new Slide(install4);

        final Carousel carousel = new Carousel(s0, s1, s2, s3, s4).withoutNavigation();
        carousel.setSizeFull();

        next.addClickListener(e -> {
            carousel.moveNext();
            double slideNumber = nfStep.getValue();
            slideNumber = slideNumber >= 5 ? 1 : slideNumber + 1;
            nfStep.setValue(slideNumber);
        });

        prev.addClickListener(e -> {
            carousel.movePrev();
            double slideNumber = nfStep.getValue();
            slideNumber = slideNumber <= 1 ? 5 : slideNumber - 1;
            nfStep.setValue(slideNumber);
        });

        last.addClickListener(e -> {
            carousel.movePos(4);
            nfStep.setValue(5.0);
        });

        first.addClickListener(e -> {
            carousel.movePos(0);
            nfStep.setValue(1.0);
        });

        return carousel;
    }
}
