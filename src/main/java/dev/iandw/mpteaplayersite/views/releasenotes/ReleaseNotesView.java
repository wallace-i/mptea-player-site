/**
 * Deprecated
package dev.iandw.mpteaplayersite.views.releasenotes;


import com.vaadin.flow.component.html.Anchor;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import dev.iandw.mpteaplayersite.views.MainLayout;
import org.vaadin.stefan.table.Table;
import org.vaadin.stefan.table.TableCell;
import org.vaadin.stefan.table.TableRow;

@PageTitle("Release Notes")
@Route(value = "release-notes", layout = MainLayout.class)
public class ReleaseNotesView extends VerticalLayout {

    public ReleaseNotesView() {
        H2 h2Release = new H2("mpTea Player Release History");
        Table releaseNotesTable = createReleaseNotesTable();

        add(h2Release, releaseNotesTable);
    }

    private Table createReleaseNotesTable() {
        Anchor aVersion050 = new Anchor("release-notes050", "Version 0.5.0 Demo");
        Anchor aVersion075 = new Anchor("release-notes075", "Version 0.7.5");

        Table releaseNotesTable = new Table();

        TableRow headerRow_0 = releaseNotesTable.addRow();
        headerRow_0.getStyle().set("text-align", "left");
        TableCell cell_0_0 = headerRow_0.addHeaderCell();
        cell_0_0.add("Release Date");
        cell_0_0.getStyle().set("border-left", "0px");
        cell_0_0.getStyle().set("padding", "5px");
        TableCell cell_0_1 = headerRow_0.addHeaderCell();
        cell_0_1.add("Version");
        cell_0_1.getStyle().set("border-left", "0px");
        cell_0_1.getStyle().set("padding", "5px");
        TableCell cell_0_2 = headerRow_0.addHeaderCell();
        cell_0_2.add("Release Notes");
        cell_0_2.getStyle().set("border-left", "0px");
        cell_0_2.getStyle().set("padding", "5px");

        TableRow versionRow_1 = releaseNotesTable.addRow();
        TableCell cell_1_0 = versionRow_1.addDataCell();
        cell_1_0.add("2023-5-5");
        cell_1_0.getStyle().set("background-color", "#f3f5f7");
        cell_1_0.getStyle().set("border-top", "1px solid #ddd");
        cell_1_0.getStyle().set("border-left", "0px");
        cell_1_0.getStyle().set("padding", "5px");
        TableCell cell_1_1 = versionRow_1.addDataCell();
        cell_1_1.add("0.5.0 Demo");
        cell_1_1.getStyle().set("background-color", "#f3f5f7");
        cell_1_1.getStyle().set("border-top", "1px solid #ddd");
        cell_1_1.getStyle().set("border-left", "0px");
        cell_1_1.getStyle().set("padding", "5px");
        TableCell cell_1_2 = versionRow_1.addDataCell();
        cell_1_2.add(aVersion050);
        cell_1_2.getStyle().set("background-color", "#f3f5f7");
        cell_1_2.getStyle().set("border-top", "1px solid #ddd");
        cell_1_2.getStyle().set("border-left", "0px");
        cell_1_2.getStyle().set("padding", "5px");

        TableRow versionRow_2 = releaseNotesTable.addRow();
        TableCell cell_2_0 = versionRow_2.addDataCell();
        cell_2_0.add("2023-5-5");
        cell_2_0.getStyle().set("border-top", "1px solid #ddd");
        cell_2_0.getStyle().set("border-bottom", "1px solid #ddd");
        cell_2_0.getStyle().set("border-left", "0px");
        cell_2_0.getStyle().set("padding", "5px");
        TableCell cell_2_1 = versionRow_2.addDataCell();
        cell_2_1.add("0.5.0 Demo");
        cell_2_1.getStyle().set("border-top", "1px solid #ddd");
        cell_2_1.getStyle().set("border-bottom", "1px solid #ddd");
        cell_2_1.getStyle().set("border-left", "0px");
        cell_2_1.getStyle().set("padding", "5px");
        TableCell cell_2_2 = versionRow_2.addDataCell();
        cell_2_2.add(aVersion075);
        cell_2_2.getStyle().set("border-top", "1px solid #ddd");
        cell_2_2.getStyle().set("border-bottom", "1px solid #ddd");
        cell_2_2.getStyle().set("border-left", "0px");
        cell_2_2.getStyle().set("padding", "5px");

        return releaseNotesTable;
    }
}
**/