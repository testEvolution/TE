@Test
    public void testReplaceDataset() {

        // create a dataset...
        Number[][] data = new Integer[][] {{-30, -20}, {-10, 10}, {20, 30}};

        CategoryDataset newData = DatasetUtils.createCategoryDataset("S",
                "C", data);

        LocalListener l = new LocalListener();
        this.chart.addChangeListener(l);
        CategoryPlot plot = (CategoryPlot) this.chart.getPlot();
        plot.setDataset(newData);
        assertEquals(true, l.flag);
        ValueAxis axis = plot.getRangeAxis();
        Range range = axis.getRange();
        assertTrue(range.getLowerBound() <= -30,
                "Expecting the lower bound of the range to be around -30: "
                + range.getLowerBound());
        assertTrue(range.getUpperBound() >= 30, 
                "Expecting the upper bound of the range to be around 30: "
                + range.getUpperBound());

    }

    