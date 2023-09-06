package dev.iandw.mpteaplayersite.views.license;

import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.theme.lumo.LumoUtility.Margin;
import dev.iandw.mpteaplayersite.views.MainLayout;

@PageTitle("License")
@Route(value = "license", layout = MainLayout.class)
public class LicenseView extends VerticalLayout {

    public LicenseView() {

        H2 h2License = new H2("MIT License");
        Paragraph pLicense = new Paragraph();
        pLicense.add("Copyright 2023, Spectral Lines Music LLC\n" +
                "Contact: iandw@spectrallines.dev\n" +
                "\n" +
                "Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the “Software”), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:\n" +
                "\n" +
                "The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.\n" +
                "\n" +
                "THE SOFTWARE IS PROVIDED “AS IS”, WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.\n");

        add(h2License, pLicense);
    }

}
