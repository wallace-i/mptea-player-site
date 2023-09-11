package dev.iandw.mpteaplayersite.views.importing;

import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.theme.lumo.LumoUtility;
import dev.iandw.mpteaplayersite.views.MainLayout;

@PageTitle("Importing")
@Route(value = "importing", layout = MainLayout.class)
public class ImportView extends VerticalLayout {

    public ImportView() {
        H2 h2Import = new H2("Importing data to mpTea Player");
        h2Import.addClassNames(LumoUtility.Margin.Top.XLARGE, LumoUtility.Margin.Bottom.MEDIUM, LumoUtility.Margin.Left.LARGE);

        add(h2Import);
    }
}
