@Test
    public void testGetLegendItem() {
        DefaultBoxAndWhiskerCategoryDataset dataset
                = new DefaultBoxAndWhiskerCategoryDataset();
        List<Double> values = new ArrayList<>();
        values.add(1.10);
        values.add(1.45);
        values.add(1.33);
        values.add(1.23);
        dataset.add(values, "R1", "C1");
        BoxAndWhiskerRenderer r = new BoxAndWhiskerRenderer();
        CategoryPlot plot = new CategoryPlot(dataset, new CategoryAxis("x"),
                new NumberAxis("y"), r);
        /*JFreeChart chart =*/ new JFreeChart(plot);
        LegendItem li = r.getLegendItem(0, 0);
        assertNotNull(li);
        r.setSeriesVisibleInLegend(0, Boolean.FALSE);
        li = r.getLegendItem(0, 0);
        assertNull(li);
    }

    