private CombinedDomainCategoryPlot createPlot() {

        CategoryDataset dataset1 = createDataset1();
        NumberAxis rangeAxis1 = new NumberAxis("Value");
        rangeAxis1.setStandardTickUnits(NumberAxis.createIntegerTickUnits());
        LineAndShapeRenderer renderer1 = new LineAndShapeRenderer();
        renderer1.setDefaultToolTipGenerator(
            new StandardCategoryToolTipGenerator()
        );
        CategoryPlot subplot1 = new CategoryPlot(
            dataset1, null, rangeAxis1, renderer1
        );
        subplot1.setDomainGridlinesVisible(true);

        CategoryDataset dataset2 = createDataset2();
        NumberAxis rangeAxis2 = new NumberAxis("Value");
        rangeAxis2.setStandardTickUnits(NumberAxis.createIntegerTickUnits());
        BarRenderer renderer2 = new BarRenderer();
        renderer2.setDefaultToolTipGenerator(
            new StandardCategoryToolTipGenerator()
        );
        CategoryPlot subplot2 = new CategoryPlot(
            dataset2, null, rangeAxis2, renderer2
        );
        subplot2.setDomainGridlinesVisible(true);

        CategoryAxis domainAxis = new CategoryAxis("Category");
        CombinedDomainCategoryPlot plot
            = new CombinedDomainCategoryPlot(domainAxis);
        plot.add(subplot1, 2);
        plot.add(subplot2, 1);
        return plot;

    }

}