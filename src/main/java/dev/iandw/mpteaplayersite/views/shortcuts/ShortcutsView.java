package dev.iandw.mpteaplayersite.views.shortcuts;

import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.H3;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.theme.lumo.LumoUtility;
import dev.iandw.mpteaplayersite.views.MainLayout;
import org.vaadin.stefan.table.Table;
import org.vaadin.stefan.table.TableCell;
import org.vaadin.stefan.table.TableRow;

@PageTitle("Shortcuts")
@Route(value = "shortcuts", layout = MainLayout.class)
public class ShortcutsView extends VerticalLayout {

    public ShortcutsView() {
        H2 h2Shortcuts = new H2("Keyboard Shortcuts");
        h2Shortcuts.addClassNames(LumoUtility.Margin.Top.XLARGE, LumoUtility.Margin.Bottom.MEDIUM, LumoUtility.Margin.Left.LARGE);

        HorizontalLayout horizontalLayout = new HorizontalLayout();

        //H3 h3MusicPlayerControls = new H3("Music Player Controls");
        //h3MusicPlayerControls.addClassNames(LumoUtility.Margin.Bottom.MEDIUM, LumoUtility.Margin.Left.LARGE);

        Table playerTable = createPlayerShortcutsTable();
        playerTable.getStyle().set("margin-left", "20px");
        playerTable.getStyle().set("border-collapse", "collapse");

        //H3 h3MenuBarShortcuts = new H3("Menu Bar Shortcuts");
        //h3MenuBarShortcuts.addClassNames(LumoUtility.Margin.Bottom.MEDIUM, LumoUtility.Margin.Left.LARGE);

        Table menuBarTable = createMenuBarTable();
        menuBarTable.getStyle().set("margin-left", "20px");
        menuBarTable.getStyle().set("border-collapse", "collapse");

        horizontalLayout.add(playerTable, menuBarTable);

        add(h2Shortcuts, horizontalLayout);
    }

    private Table createPlayerShortcutsTable() {
        Table shortcutsTable = new Table();

        TableRow headerRow_0 = shortcutsTable.addRow();
        TableCell cell_0_0  = headerRow_0.addHeaderCell();
        cell_0_0.add();
        cell_0_0.getStyle().set("border-left", "0px");
        cell_0_0.getStyle().set("padding", "5px");
        cell_0_0.getStyle().set("padding-right", "15px");
        TableCell cell_0_1 = headerRow_0.addHeaderCell();
        cell_0_1.add("Music Player Controls");
        cell_0_1.getStyle().set("border-left", "0px");
        cell_0_1.getStyle().set("padding", "5px");

        TableRow row_1 = shortcutsTable.addRow();
        TableCell cell_1_0 = row_1.addDataCell();
        cell_1_0.add("Play/Pause");
        cell_1_0.getStyle().set("background-color", "#f3f5f7");
        cell_1_0.getStyle().set("border-top", "1px solid #ddd");
        cell_1_0.getStyle().set("border-left", "0px");
        cell_1_0.getStyle().set("padding", "5px");
        cell_1_0.getStyle().set("padding-right", "15px");
        TableCell cell_1_1 = row_1.addDataCell();
        cell_1_1.add("Space Bar");
        cell_1_1.getStyle().set("background-color", "#f3f5f7");
        cell_1_1.getStyle().set("border-top", "1px solid #ddd");
        cell_1_1.getStyle().set("border-left", "0px");
        cell_1_1.getStyle().set("padding", "5px");

        TableRow row_2 = shortcutsTable.addRow();
        TableCell cell_2_0 = row_2.addDataCell();
        cell_2_0.add("Stop");
        cell_2_0.getStyle().set("border-top", "1px solid #ddd");
        cell_2_0.getStyle().set("border-left", "0px");
        cell_2_0.getStyle().set("padding", "5px");
        cell_2_0.getStyle().set("padding-right", "15px");
        TableCell cell_2_1 = row_2.addDataCell();
        cell_2_1.add("/");
        cell_2_1.getStyle().set("border-top", "1px solid #ddd");
        cell_2_1.getStyle().set("border-left", "0px");
        cell_2_1.getStyle().set("padding", "5px");

        TableRow row_3 = shortcutsTable.addRow();
        TableCell cell_3_0 = row_3.addDataCell();
        cell_3_0.add("Next Track");
        cell_3_0.getStyle().set("background-color", "#f3f5f7");
        cell_3_0.getStyle().set("border-top", "1px solid #ddd");
        cell_3_0.getStyle().set("border-left", "0px");
        cell_3_0.getStyle().set("padding", "5px");
        cell_3_0.getStyle().set("padding-right", "15px");
        TableCell cell_3_1 = row_3.addDataCell();
        cell_3_1.add(".");
        cell_3_1.getStyle().set("background-color", "#f3f5f7");
        cell_3_1.getStyle().set("border-top", "1px solid #ddd");
        cell_3_1.getStyle().set("border-left", "0px");
        cell_3_1.getStyle().set("padding", "5px");

        TableRow row_4 = shortcutsTable.addRow();
        TableCell cell_4_0 = row_4.addDataCell();
        cell_4_0.add("Previous Track");
        cell_4_0.getStyle().set("border-top", "1px solid #ddd");
        cell_4_0.getStyle().set("border-left", "0px");
        cell_4_0.getStyle().set("padding", "5px");
        cell_4_0.getStyle().set("padding-right", "15px");
        TableCell cell_4_1 = row_4.addDataCell();
        cell_4_1.add(",");
        cell_4_1.getStyle().set("border-top", "1px solid #ddd");
        cell_4_1.getStyle().set("border-left", "0px");
        cell_4_1.getStyle().set("padding", "5px");

        TableRow row_5 = shortcutsTable.addRow();
        TableCell cell_5_0 = row_5.addDataCell();
        cell_5_0.add("Volume Up");
        cell_5_0.getStyle().set("background-color", "#f3f5f7");
        cell_5_0.getStyle().set("border-top", "1px solid #ddd");
        cell_5_0.getStyle().set("border-left", "0px");
        cell_5_0.getStyle().set("padding", "5px");
        cell_5_0.getStyle().set("padding-right", "15px");
        TableCell cell_5_1 = row_5.addDataCell();
        cell_5_1.add("=");
        cell_5_1.getStyle().set("background-color", "#f3f5f7");
        cell_5_1.getStyle().set("border-top", "1px solid #ddd");
        cell_5_1.getStyle().set("border-left", "0px");
        cell_5_1.getStyle().set("padding", "5px");

        TableRow row_6 = shortcutsTable.addRow();
        TableCell cell_6_0 = row_6.addDataCell();
        cell_6_0.add("Volume Down");
        cell_6_0.getStyle().set("border-top", "1px solid #ddd");
        cell_6_0.getStyle().set("border-left", "0px");
        cell_6_0.getStyle().set("padding", "5px");
        cell_6_0.getStyle().set("padding-right", "15px");
        TableCell cell_6_1 = row_6.addDataCell();
        cell_6_1.add("-");
        cell_6_1.getStyle().set("border-top", "1px solid #ddd");
        cell_6_1.getStyle().set("border-left", "0px");
        cell_6_1.getStyle().set("padding", "5px");

        TableRow row_7 = shortcutsTable.addRow();
        TableCell cell_7_0 = row_7.addDataCell();
        cell_7_0.add("Mute");
        cell_7_0.getStyle().set("background-color", "#f3f5f7");
        cell_7_0.getStyle().set("border-top", "1px solid #ddd");
        cell_7_0.getStyle().set("border-left", "0px");
        cell_7_0.getStyle().set("padding", "5px");
        cell_7_0.getStyle().set("padding-right", "15px");
        TableCell cell_7_1 = row_7.addDataCell();
        cell_7_1.add("0");
        cell_7_0.getStyle().set("background-color", "#f3f5f7");
        cell_7_1.getStyle().set("border-top", "1px solid #ddd");
        cell_7_1.getStyle().set("border-left", "0px");
        cell_7_1.getStyle().set("padding", "5px");

        TableRow row_8 = shortcutsTable.addRow();
        TableCell cell_8_0 = row_8.addDataCell();
        cell_8_0.add("Auto Play");
        cell_8_0.getStyle().set("border-top", "1px solid #ddd");
        cell_8_0.getStyle().set("border-left", "0px");
        cell_8_0.getStyle().set("padding", "5px");
        cell_8_0.getStyle().set("padding-right", "15px");
        TableCell cell_8_1 = row_8.addDataCell();
        cell_8_1.add("1");
        cell_8_1.getStyle().set("border-top", "1px solid #ddd");
        cell_8_1.getStyle().set("border-left", "0px");
        cell_8_1.getStyle().set("padding", "5px");

        TableRow row_9 = shortcutsTable.addRow();
        TableCell cell_9_0 = row_9.addDataCell();
        cell_9_0.add("Shuffle");
        cell_9_0.getStyle().set("background-color", "#f3f5f7");
        cell_9_0.getStyle().set("border-top", "1px solid #ddd");
        cell_9_0.getStyle().set("border-left", "0px");
        cell_9_0.getStyle().set("padding", "5px");
        cell_9_0.getStyle().set("padding-right", "15px");
        TableCell cell_9_1 = row_9.addDataCell();
        cell_9_1.add("2");
        cell_9_1.getStyle().set("background-color", "#f3f5f7");
        cell_9_1.getStyle().set("border-top", "1px solid #ddd");
        cell_9_1.getStyle().set("border-left", "0px");
        cell_9_1.getStyle().set("padding", "5px");

        TableRow row_10 = shortcutsTable.addRow();
        TableCell cell_10_0 = row_10.addDataCell();
        cell_10_0.add("Repeat");
        cell_10_0.getStyle().set("border-top", "1px solid #ddd");
        cell_10_0.getStyle().set("border-bottom", "1px solid #ddd");
        cell_10_0.getStyle().set("border-left", "0px");
        cell_10_0.getStyle().set("padding", "5px");
        cell_10_0.getStyle().set("padding-right", "15px");
        TableCell cell_10_1 = row_10.addDataCell();
        cell_10_1.add("3");
        cell_10_1.getStyle().set("border-top", "1px solid #ddd");
        cell_10_1.getStyle().set("border-bottom", "1px solid #ddd");
        cell_10_1.getStyle().set("border-left", "0px");
        cell_10_1.getStyle().set("padding", "5px");

        return shortcutsTable;
    }

    private Table createMenuBarTable() {
        Table menuTable = new Table();

        TableRow headerRow_0 = menuTable.addRow();
        TableCell cell_0_0  = headerRow_0.addHeaderCell();
        cell_0_0.add();
        cell_0_0.getStyle().set("border-left", "0px");
        cell_0_0.getStyle().set("padding", "5px");
        TableCell cell_0_1 = headerRow_0.addHeaderCell();
        cell_0_1.add("Menu Bar Shortcuts");
        cell_0_1.getStyle().set("border-left", "0px");
        cell_0_1.getStyle().set("padding", "5px");

        TableRow row_1 = menuTable.addRow();
        TableCell cell_1_0 = row_1.addDataCell();
        cell_1_0.add("Settings");
        cell_1_0.getStyle().set("background-color", "#f3f5f7");
        cell_1_0.getStyle().set("border-top", "1px solid #ddd");
        cell_1_0.getStyle().set("border-left", "0px");
        cell_1_0.getStyle().set("padding", "5px");
        cell_1_0.getStyle().set("padding-right", "15px");
        TableCell cell_1_1 = row_1.addDataCell();
        cell_1_1.add("Ctrl + S");
        cell_1_1.getStyle().set("background-color", "#f3f5f7");
        cell_1_1.getStyle().set("border-top", "1px solid #ddd");
        cell_1_1.getStyle().set("border-left", "0px");
        cell_1_1.getStyle().set("padding", "5px");

        TableRow row_2 = menuTable.addRow();
        TableCell cell_2_0 = row_2.addDataCell();
        cell_2_0.add("Exit");
        cell_2_0.getStyle().set("border-top", "1px solid #ddd");
        cell_2_0.getStyle().set("border-left", "0px");
        cell_2_0.getStyle().set("padding", "5px");
        cell_2_0.getStyle().set("padding-right", "15px");
        TableCell cell_2_1 = row_2.addDataCell();
        cell_2_1.add("Ctrl + E");
        cell_2_1.getStyle().set("border-top", "1px solid #ddd");
        cell_2_1.getStyle().set("border-left", "0px");
        cell_2_1.getStyle().set("padding", "5px");

        TableRow row_3 = menuTable.addRow();
        TableCell cell_3_0 = row_3.addDataCell();
        cell_3_0.add("Import Artist");
        cell_3_0.getStyle().set("background-color", "#f3f5f7");
        cell_3_0.getStyle().set("border-top", "1px solid #ddd");
        cell_3_0.getStyle().set("border-left", "0px");
        cell_3_0.getStyle().set("padding", "5px");
        cell_3_0.getStyle().set("padding-right", "15px");
        TableCell cell_3_1 = row_3.addDataCell();
        cell_3_1.add("Ctrl + I");
        cell_3_1.getStyle().set("background-color", "#f3f5f7");
        cell_3_1.getStyle().set("border-top", "1px solid #ddd");
        cell_3_1.getStyle().set("border-left", "0px");
        cell_3_1.getStyle().set("padding", "5px");

        TableRow row_4 = menuTable.addRow();
        TableCell cell_4_0 = row_4.addDataCell();
        cell_4_0.add("Import Album");
        cell_4_0.getStyle().set("border-top", "1px solid #ddd");
        cell_4_0.getStyle().set("border-left", "0px");
        cell_4_0.getStyle().set("padding", "5px");
        cell_4_0.getStyle().set("padding-right", "15px");
        TableCell cell_4_1 = row_4.addDataCell();
        cell_4_1.add("Ctrl + L");
        cell_4_1.getStyle().set("border-top", "1px solid #ddd");
        cell_4_1.getStyle().set("border-left", "0px");
        cell_4_1.getStyle().set("padding", "5px");

        TableRow row_5 = menuTable.addRow();
        TableCell cell_5_0 = row_5.addDataCell();
        cell_5_0.add("Import Track");
        cell_5_0.getStyle().set("background-color", "#f3f5f7");
        cell_5_0.getStyle().set("border-top", "1px solid #ddd");
        cell_5_0.getStyle().set("border-left", "0px");
        cell_5_0.getStyle().set("padding", "5px");
        cell_5_0.getStyle().set("padding-right", "15px");
        TableCell cell_5_1 = row_5.addDataCell();
        cell_5_1.add("Ctrl + T");
        cell_5_1.getStyle().set("background-color", "#f3f5f7");
        cell_5_1.getStyle().set("border-top", "1px solid #ddd");
        cell_5_1.getStyle().set("border-left", "0px");
        cell_5_1.getStyle().set("padding", "5px");

        TableRow row_6 = menuTable.addRow();
        TableCell cell_6_0 = row_6.addDataCell();
        cell_6_0.add("Add Artist");
        cell_6_0.getStyle().set("border-top", "1px solid #ddd");
        cell_6_0.getStyle().set("border-left", "0px");
        cell_6_0.getStyle().set("padding", "5px");
        cell_6_0.getStyle().set("padding-right", "15px");
        TableCell cell_6_1 = row_6.addDataCell();
        cell_6_1.add("Ctrl + R");
        cell_6_1.getStyle().set("border-top", "1px solid #ddd");
        cell_6_1.getStyle().set("border-left", "0px");
        cell_6_1.getStyle().set("padding", "5px");

        TableRow row_7 = menuTable.addRow();
        TableCell cell_7_0 = row_7.addDataCell();
        cell_7_0.add("Create Playlist");
        cell_7_0.getStyle().set("background-color", "#f3f5f7");
        cell_7_0.getStyle().set("border-top", "1px solid #ddd");
        cell_7_0.getStyle().set("border-left", "0px");
        cell_7_0.getStyle().set("padding", "5px");
        cell_7_0.getStyle().set("padding-right", "15px");
        TableCell cell_7_1 = row_7.addDataCell();
        cell_7_1.add("Ctrl + P");
        cell_7_0.getStyle().set("background-color", "#f3f5f7");
        cell_7_1.getStyle().set("border-top", "1px solid #ddd");
        cell_7_1.getStyle().set("border-left", "0px");
        cell_7_1.getStyle().set("padding", "5px");

        TableRow row_8 = menuTable.addRow();
        TableCell cell_8_0 = row_8.addDataCell();
        cell_8_0.add("About");
        cell_8_0.getStyle().set("border-top", "1px solid #ddd");
        cell_8_0.getStyle().set("border-left", "0px");
        cell_8_0.getStyle().set("padding", "5px");
        cell_8_0.getStyle().set("padding-right", "15px");
        TableCell cell_8_1 = row_8.addDataCell();
        cell_8_1.add("Ctrl + O");
        cell_8_1.getStyle().set("border-top", "1px solid #ddd");
        cell_8_1.getStyle().set("border-left", "0px");
        cell_8_1.getStyle().set("padding", "5px");

        TableRow row_9 = menuTable.addRow();
        TableCell cell_9_0 = row_9.addDataCell();
        cell_9_0.add("GitHub");
        cell_9_0.getStyle().set("background-color", "#f3f5f7");
        cell_9_0.getStyle().set("border-top", "1px solid #ddd");
        cell_9_0.getStyle().set("border-left", "0px");
        cell_9_0.getStyle().set("padding", "5px");
        cell_9_0.getStyle().set("padding-right", "15px");
        TableCell cell_9_1 = row_9.addDataCell();
        cell_9_1.add("Ctrl + G");
        cell_9_1.getStyle().set("background-color", "#f3f5f7");
        cell_9_1.getStyle().set("border-top", "1px solid #ddd");
        cell_9_1.getStyle().set("border-left", "0px");
        cell_9_1.getStyle().set("padding", "5px");

        TableRow row_10 = menuTable.addRow();
        TableCell cell_10_0 = row_10.addDataCell();
        cell_10_0.add("Console Log");
        cell_10_0.getStyle().set("border-top", "1px solid #ddd");
        cell_10_0.getStyle().set("border-bottom", "1px solid #ddd");
        cell_10_0.getStyle().set("border-left", "0px");
        cell_10_0.getStyle().set("padding", "5px");
        cell_10_0.getStyle().set("padding-right", "15px");
        TableCell cell_10_1 = row_10.addDataCell();
        cell_10_1.add("Ctrl + C");
        cell_10_1.getStyle().set("border-top", "1px solid #ddd");
        cell_10_1.getStyle().set("border-bottom", "1px solid #ddd");
        cell_10_1.getStyle().set("border-left", "0px");
        cell_10_1.getStyle().set("padding", "5px");

        return menuTable;
    }

}
