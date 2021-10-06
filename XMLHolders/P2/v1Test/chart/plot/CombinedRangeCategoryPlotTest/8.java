private CombinedRangeCategoryPlot createPlot() {
        CategoryDataset dataset1 = createDataset1();
        CategoryAxis catAxis1 = new CategoryAxis("Category");
        LineAndShapeRenderer renderer1 = new LineAndShapeRenderer();
        renderer1.setDefaultToolTipGenerator(
                new StandardCategoryToolTipGenerator());
        CategoryPlot subplot1 = new CategoryPlot(dataset1, catAxis1, null,
                renderer1);
        subplot1.setDomainGridlinesVisible(true);

        CategoryDataset dataset2 = createDataset2();
        CategoryAxis catAxis2 = new CategoryAxis("Category");
        BarRenderer renderer2 = new BarRenderer();
        renderer2.setDefaultToolTipGenerator(
                new StandardCategoryToolTipGenerator());
        CategoryPlot subplot2 = new CategoryPlot(dataset2, catAxis2, null,
                renderer2);
        subplot2.setDomainGridlinesVisible(true);

        NumberAxis rangeAxis = new NumberAxis("Value");
        CombinedRangeCategoryPlot plot = new CombinedRangeCategoryPlot(
                rangeAxis);
        plot.add(subplot1, 2);
        plot.add(subplot2, 1);
        return plot;
    }

}