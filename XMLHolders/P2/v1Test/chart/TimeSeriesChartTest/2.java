@Test
    public void testReplaceDataset() {

        // create a dataset...
        XYSeries series1 = new XYSeries("Series 1");
        series1.add(10.0, 10.0);
        series1.add(20.0, 20.0);
        series1.add(30.0, 30.0);
        XYDataset dataset = new XYSeriesCollection(series1);

        LocalListener l = new LocalListener();
        this.chart.addChangeListener(l);
        XYPlot plot = (XYPlot) this.chart.getPlot();
        plot.setDataset(dataset);
        assertEquals(true, l.flag);
        ValueAxis axis = plot.getRangeAxis();
        Range range = axis.getRange();
        assertTrue(range.getLowerBound() <= 10, 
                "Expecting the lower bound of the range to be around 10: "
                + range.getLowerBound());
        assertTrue(range.getUpperBound() >= 30, "Expecting the upper bound of the range to be around 30: "
                + range.getUpperBound());

    }

    