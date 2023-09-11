package dev.iandw.mpteaplayersite.views.releasenotes.version075;

import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.theme.lumo.LumoUtility;
import dev.iandw.mpteaplayersite.views.MainLayout;


@PageTitle("Version 0.7.5")
@Route(value = "release-notes075", layout = MainLayout.class)
public class Version075View extends VerticalLayout {

    public Version075View() {
        H2 h2Release = new H2("Release Notes - mpTea Player 0.7.5");
        h2Release.addClassNames(LumoUtility.Margin.Top.XLARGE, LumoUtility.Margin.Bottom.MEDIUM, LumoUtility.Margin.Left.LARGE);

        Paragraph p0 = new Paragraph();
        p0.addClassNames(LumoUtility.Margin.Bottom.MEDIUM, LumoUtility.Margin.Left.LARGE);

        p0.add("Version 0.7.5is the first runnable executable of the mpTea Player program.");

        add(h2Release, p0);
    }
}
