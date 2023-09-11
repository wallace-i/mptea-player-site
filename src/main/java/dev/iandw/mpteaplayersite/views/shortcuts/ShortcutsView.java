package dev.iandw.mpteaplayersite.views.shortcuts;

import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.theme.lumo.LumoUtility;
import dev.iandw.mpteaplayersite.views.MainLayout;

@PageTitle("Shortcuts")
@Route(value = "shortcuts", layout = MainLayout.class)
public class ShortcutsView extends VerticalLayout {

    public ShortcutsView() {
        H2 h2Shortcuts = new H2("Keyboard Shortcuts");
        h2Shortcuts.addClassNames(LumoUtility.Margin.Top.XLARGE, LumoUtility.Margin.Bottom.MEDIUM, LumoUtility.Margin.Left.LARGE);

    }
}
