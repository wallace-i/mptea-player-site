package dev.iandw.mpteaplayersite.views.download;

import com.vaadin.flow.component.html.*;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.theme.lumo.LumoUtility;
import dev.iandw.mpteaplayersite.views.MainLayout;
import org.vaadin.stefan.table.Table;
import org.vaadin.stefan.table.TableCell;
import org.vaadin.stefan.table.TableRow;

@PageTitle("Download")
@Route(value = "download", layout = MainLayout.class)
public class DownloadView extends VerticalLayout {
    public DownloadView() {
        final String latestRelease = "0.7.5";

        H2 h3Download = new H2("Downloading mpTea Player " + latestRelease);
        h3Download.addClassNames(LumoUtility.Margin.Top.XLARGE, LumoUtility.Margin.Bottom.MEDIUM, LumoUtility.Margin.Left.LARGE);

        Paragraph pDownload = new Paragraph();
        pDownload.addClassNames(LumoUtility.Margin.Bottom.MEDIUM, LumoUtility.Margin.Left.LARGE);

        pDownload.add("mpTea Player " + latestRelease + " is the latest release.");

        /**
         *      Tables
         */
        H3 h3System = new H3("System Requirements");
        h3System.addClassNames(LumoUtility.Margin.Top.XLARGE, LumoUtility.Margin.Bottom.MEDIUM, LumoUtility.Margin.Left.LARGE);

        H3 h3Files = new H3("Files");
        h3System.addClassNames(LumoUtility.Margin.Top.XLARGE, LumoUtility.Margin.Bottom.MEDIUM, LumoUtility.Margin.Left.LARGE);

        h3Files.addClassNames(LumoUtility.Margin.Top.MEDIUM, LumoUtility.Margin.Left.LARGE);

        Table systemTable = createSystemTable();
        Table filesTable = createFilesTable();

        /**
         *      File info list
         */
        UnorderedList unorderedList = new UnorderedList();
        unorderedList.addClassNames(LumoUtility.Margin.Top.MEDIUM, LumoUtility.Margin.Left.LARGE);

        // Git Link
        Anchor aGit = new Anchor("https://github.com/wallace-i/MusicPlayerJavaFxJar2", "Latest source code from repository");
        ListItem listItem1 = new ListItem(aGit);

        // License
        Anchor aLicense = new Anchor("license", "License");
        ListItem listItem2 = new ListItem(aLicense);

        unorderedList.add(listItem1, listItem2);

        add(h3Download, pDownload, h3System, systemTable, h3Files, filesTable, unorderedList);


    }

    private Table createSystemTable() {
        Table systemTable = new Table();
        systemTable.addClassNames(LumoUtility.Margin.Top.MEDIUM);
        systemTable.getStyle().set("margin-left", "20px");
        systemTable.getStyle().set("border-collapse", "collapse");

        TableRow osRow_0 = systemTable.addRow();
        TableCell cell_0_0 = osRow_0.addDataCell();
        cell_0_0.add("Operating System");
        cell_0_0.getStyle().set("background-color", "#f3f5f7");
        cell_0_0.getStyle().set("border-top", "1px solid #ddd");
        cell_0_0.getStyle().set("border-left", "0px");
        cell_0_0.getStyle().set("padding", "5px");
        cell_0_0.getStyle().set("font-weight", "bold");

        TableCell cell_0_1 = osRow_0.addDataCell();
        cell_0_1.add("All Windows OS.");
        cell_0_1.getStyle().set("background-color", "#f3f5f7");
        cell_0_1.getStyle().set("border-top", "1px solid #ddd");
        cell_0_1.getStyle().set("border-left", "0px");
        cell_0_1.getStyle().set("padding", "5px");

        TableRow memRow_1 = systemTable.addRow();
        TableCell cell_1_0 = memRow_1.addDataCell();
        cell_1_0.add("Memory");
        cell_1_0.getStyle().set("border-top", "1px solid #ddd");
        cell_1_0.getStyle().set("border-left", "0px");
        cell_1_0.getStyle().set("padding", "5px");
        cell_1_0.getStyle().set("font-weight", "bold");

        TableCell cell_1_1 = memRow_1.addDataCell();
        cell_1_1.add("No minimum requirement.");
        cell_1_1.getStyle().set("border-top", "1px solid #ddd");
        cell_1_1.getStyle().set("border-left", "0px");
        cell_1_1.getStyle().set("padding", "5px");

        TableRow diskRow_2 = systemTable.addRow();
        TableCell cell_2_0 = diskRow_2.addDataCell();
        cell_2_0.add("Disk");
        cell_2_0.getStyle().set("background-color", "#f3f5f7");
        cell_2_0.getStyle().set("border-top", "1px solid #ddd");
        cell_2_0.getStyle().set("border-bottom", "1px solid #ddd");
        cell_2_0.getStyle().set("border-left", "0px");
        cell_2_0.getStyle().set("padding", "5px");
        cell_2_0.getStyle().set("font-weight", "bold");

        TableCell cell_2_1 = diskRow_2.addDataCell();
        cell_2_1.add("Approximately 200MB for Installer, 400MB for program files.");
        cell_2_1.getStyle().set("background-color", "#f3f5f7");
        cell_2_1.getStyle().set("border-top", "1px solid #ddd");
        cell_2_1.getStyle().set("border-bottom", "1px solid #ddd");
        cell_2_1.getStyle().set("border-left", "0px");
        cell_2_1.getStyle().set("padding", "5px");

        return systemTable;
    }

    private Table createFilesTable() {
        Anchor aDemo050 = new Anchor("https://bucketeer-e731a2f7-3bfd-407d-a7fd-707383238d38.s3.amazonaws.com/public/mpTea_Player_Demo.rar", "mpTeaPlayerDemo.rar");
        Anchor aAlpha075 = new Anchor();
        Anchor aDemoReleaseNotes = new Anchor("release-notes050", "Version 0.5.0 Release Notes");
        Anchor aAlphaReleaseNotes = new Anchor("release-notes075", "Version 0.7.5 Release Notes");
        Table filesTable = new Table();
        filesTable.addClassNames(LumoUtility.Margin.Top.MEDIUM);
        filesTable.getStyle().set("margin-left", "20px");
        filesTable.getStyle().set("border-collapse", "collapse");
        TableRow headerRow_0 = filesTable.addRow();
        headerRow_0.getStyle().set("text-align", "left");
        TableCell cell_3_0 = headerRow_0.addHeaderCell();
        cell_3_0.add("Version");
        cell_3_0.getStyle().set("border-left", "0px");
        cell_3_0.getStyle().set("padding", "5px");
        TableCell cell_3_1 = headerRow_0.addHeaderCell();
        cell_3_1.add("Link");
        cell_3_1.getStyle().set("border-left", "0px");
        cell_3_1.getStyle().set("padding", "5px");
        TableCell cell_3_2 = headerRow_0.addHeaderCell();
        cell_3_2.add("Release Notes");
        cell_3_1.getStyle().set("border-left", "0px");
        cell_3_1.getStyle().set("padding", "5px");

        TableRow alphaRow_1 = filesTable.addRow();
        TableCell cell_4_0 = alphaRow_1.addDataCell();
        cell_4_0.add("0.7.5 Alpha");
        cell_4_0.getStyle().set("background-color", "#f3f5f7");
        cell_4_0.getStyle().set("border-top", "1px solid #ddd");
        cell_4_0.getStyle().set("border-left", "0px");
        cell_4_0.getStyle().set("padding", "5px");
        TableCell cell_4_1 = alphaRow_1.addDataCell();
        cell_4_1.add("anchor link here");
        cell_4_1.getStyle().set("background-color", "#f3f5f7");
        cell_4_1.getStyle().set("border-top", "1px solid #ddd");
        cell_4_1.getStyle().set("border-left", "0px");
        cell_4_1.getStyle().set("padding", "5px");
        TableCell cell_4_2 = alphaRow_1.addDataCell();
        cell_4_2.add(aAlphaReleaseNotes);
        cell_4_2.getStyle().set("background-color", "#f3f5f7");
        cell_4_2.getStyle().set("border-top", "1px solid #ddd");
        cell_4_2.getStyle().set("border-left", "0px");
        cell_4_2.getStyle().set("padding", "5px");

        TableRow demoRow_2 = filesTable.addRow();
        TableCell cell_5_0 = demoRow_2.addDataCell();
        cell_5_0.add("0.5.0 Demo");
        cell_5_0.getStyle().set("border-top", "1px solid #ddd");
        cell_5_0.getStyle().set("border-bottom", "1px solid #ddd");
        cell_5_0.getStyle().set("border-left", "0px");
        cell_5_0.getStyle().set("padding", "5px");
        TableCell cell_5_1 = demoRow_2.addDataCell();
        cell_5_1.add(aDemo050);
        cell_5_1.getStyle().set("border-top", "1px solid #ddd");
        cell_5_1.getStyle().set("border-bottom", "1px solid #ddd");
        cell_5_1.getStyle().set("border-left", "0px");
        cell_5_1.getStyle().set("padding", "5px");
        TableCell cell_5_2 = demoRow_2.addDataCell();
        cell_5_2.add(aDemoReleaseNotes);
        cell_5_2.getStyle().set("border-top", "1px solid #ddd");
        cell_5_2.getStyle().set("border-bottom", "1px solid #ddd");
        cell_5_2.getStyle().set("border-left", "0px");
        cell_5_2.getStyle().set("padding", "5px");

        return filesTable;
    }

}
