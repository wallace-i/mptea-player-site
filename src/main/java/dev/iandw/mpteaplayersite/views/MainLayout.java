package dev.iandw.mpteaplayersite.views;

import com.vaadin.flow.component.applayout.AppLayout;
import com.vaadin.flow.component.applayout.DrawerToggle;
import com.vaadin.flow.component.html.Footer;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.Header;
import com.vaadin.flow.component.orderedlayout.Scroller;
import com.vaadin.flow.component.sidenav.SideNav;
import com.vaadin.flow.component.sidenav.SideNavItem;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.theme.lumo.LumoUtility;
import dev.iandw.mpteaplayersite.views.about.AboutView;
import dev.iandw.mpteaplayersite.views.contact.ContactView;
import dev.iandw.mpteaplayersite.views.controls.ControlsView;
import dev.iandw.mpteaplayersite.views.donate.DonateView;
import dev.iandw.mpteaplayersite.views.download.DownloadView;
import dev.iandw.mpteaplayersite.views.features.FeaturesView;
import dev.iandw.mpteaplayersite.views.importing.ImportView;
import dev.iandw.mpteaplayersite.views.install.InstallView;
import dev.iandw.mpteaplayersite.views.license.LicenseView;
import dev.iandw.mpteaplayersite.views.mpteaplayer.MpTeaPlayerView;
import dev.iandw.mpteaplayersite.views.playlists.PlaylistsView;
import dev.iandw.mpteaplayersite.views.setup.SetupView;
import dev.iandw.mpteaplayersite.views.shortcuts.ShortcutsView;
import org.vaadin.lineawesome.LineAwesomeIcon;

/**
 * The main view is a top-level placeholder for other views.
 */
public class MainLayout extends AppLayout {

    private H2 viewTitle;

    public MainLayout() {
        setPrimarySection(Section.DRAWER);
        addDrawerContent();
        addHeaderContent();
    }

    private void addHeaderContent() {
        DrawerToggle toggle = new DrawerToggle();
        toggle.setAriaLabel("Menu toggle");

        viewTitle = new H2();
        viewTitle.addClassNames(LumoUtility.FontSize.LARGE, LumoUtility.Margin.NONE);

        addToNavbar(true, toggle, viewTitle);
    }

    private void addDrawerContent() {
        H1 appName = new H1("mpTea Player");
        appName.addClassNames(LumoUtility.FontSize.LARGE, LumoUtility.Margin.NONE);
        Header header = new Header(appName);

        Scroller scroller = new Scroller(createNav());
        addToDrawer(header, scroller, createFooter());
    }

    private SideNav createNav() {
        SideNav nav = new SideNav();

        nav.addItem(new SideNavItem("Welcome", MpTeaPlayerView.class, LineAwesomeIcon.GLOBE_SOLID.create()));

        SideNavItem aboutNav = new SideNavItem("About");
        aboutNav.addItem(new SideNavItem("What is mpTea Player?", AboutView.class, LineAwesomeIcon.FILE.create()));
        aboutNav.addItem(new SideNavItem("Features", FeaturesView.class, LineAwesomeIcon.FILE.create()));
        aboutNav.addItem(new SideNavItem("Download", DownloadView.class, LineAwesomeIcon.FILE.create()));
        aboutNav.addItem(new SideNavItem("License", LicenseView.class, LineAwesomeIcon.FILE.create()));

        SideNavItem useNav = new SideNavItem("Use");
        useNav.addItem(new SideNavItem("Install", InstallView.class, LineAwesomeIcon.FILE.create()));
        useNav.addItem(new SideNavItem("Setup/Settings", SetupView.class, LineAwesomeIcon.FILE.create()));
        useNav.addItem(new SideNavItem("Importing", ImportView.class, LineAwesomeIcon.FILE.create()));
        useNav.addItem(new SideNavItem("User Controls", ControlsView.class, LineAwesomeIcon.FILE.create()));
        useNav.addItem(new SideNavItem("Create Playlists", PlaylistsView.class, LineAwesomeIcon.FILE.create()));
        useNav.addItem(new SideNavItem("Keyboard Shortcuts", ShortcutsView.class, LineAwesomeIcon.FILE.create()));

        SideNavItem supportNav = new SideNavItem("Support");
        supportNav.addItem(new SideNavItem("Contact", ContactView.class, LineAwesomeIcon.FILE.create()));
        supportNav.addItem(new SideNavItem("Donate", DonateView.class, LineAwesomeIcon.FILE.create()));

        nav.addItem(aboutNav, useNav, supportNav);
        nav.setExpanded(true);

        return nav;
    }


    private Footer createFooter() {
        Footer layout = new Footer();

        return layout;
    }

    @Override
    protected void afterNavigation() {
        super.afterNavigation();
        viewTitle.setText(getCurrentPageTitle());
    }

    private String getCurrentPageTitle() {
        PageTitle title = getContent().getClass().getAnnotation(PageTitle.class);
        return title == null ? "" : title.value();
    }
}
