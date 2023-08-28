package dev.iandw.mpteaplayersite.views.mpteaplayer;

import com.vaadin.flow.component.Key;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.H3;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouteAlias;
import com.vaadin.flow.theme.lumo.LumoUtility;
import dev.iandw.mpteaplayersite.views.MainLayout;

@PageTitle("mpTea Player")
@Route(value = "hello", layout = MainLayout.class)
@RouteAlias(value = "", layout = MainLayout.class)
public class MpTeaPlayerView extends HorizontalLayout {

    private TextField name;
    private Button sayHello;

    public MpTeaPlayerView() {
//        name = new TextField("Your name");
//        sayHello = new Button("Say hello");
//        sayHello.addClickListener(e -> {
//            Notification.show("Hello " + name.getValue());
//        });
//        sayHello.addClickShortcut(Key.ENTER);
//
//        setMargin(true);
//        setVerticalComponentAlignment(Alignment.END, name, sayHello);
//
//        add(name, sayHello);

        H2 welcome = new H2("Welcome to mpTea Player");
        welcome.addClassNames(LumoUtility.Margin.Top.XLARGE, LumoUtility.Margin.Bottom.MEDIUM, LumoUtility.Margin.Left.LARGE);
        add(welcome);

        Paragraph pWelcome = new Paragraph();
        pWelcome.add("mpTea Player is a light-weight music player and personal audio library. Akin to iTunes and Winamp and written in JavaFX," +
                "mpTea Player provides an easy, bloat-free way to organize and listen to your entire audio library, without the need to pay" +
                "a subscription service or be online.");
        pWelcome.addClassNames(LumoUtility.Margin.Bottom.MEDIUM, LumoUtility.Margin.Left.LARGE);
        add(pWelcome);






    }

}
