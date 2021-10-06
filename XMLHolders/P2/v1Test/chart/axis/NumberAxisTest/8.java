@Test
    public void testAutoRange4() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.setValue(100.0, "Row 1", "Column 1");
        dataset.setValue(200.0, "Row 1", "Column 2");
        JFreeChart chart = ChartFactory.createBarChart("Test", "Categories",
                "Value", dataset, PlotOrientation.VERTICAL, false, false,
                false);
        CategoryPlot plot = (CategoryPlot) chart.getPlot();
        NumberAxis axis = (NumberAxis) plot.getRangeAxis();
        axis.setAutoRangeIncludesZero(false);
        BarRenderer br = (BarRenderer) plot.getRenderer();
        br.setIncludeBaseInRange(false);
        assertEquals(95.0, axis.getLowerBound(), EPSILON);
        assertEquals(205.0, axis.getUpperBound(), EPSILON);

        br.setIncludeBaseInRange(true);
        assertEquals(0.0, axis.getLowerBound(), EPSILON);
        assertEquals(210.0, axis.getUpperBound(), EPSILON);

        axis.setAutoRangeIncludesZero(true);
        assertEquals(0.0, axis.getLowerBound(), EPSILON);
        assertEquals(210.0, axis.getUpperBound(), EPSILON);

        br.setIncludeBaseInRange(true);
        assertEquals(0.0, axis.getLowerBound(), EPSILON);
        assertEquals(210.0, axis.getUpperBound(), EPSILON);

        // now replacing the dataset should update the axis range...
        DefaultCategoryDataset dataset2 = new DefaultCategoryDataset();
        dataset2.setValue(900.0, "Row 1", "Column 1");
        dataset2.setValue(1000.0, "Row 1", "Column 2");
        plot.setDataset(dataset2);
        assertEquals(0.0, axis.getLowerBound(), EPSILON);
        assertEquals(1050.0, axis.getUpperBound(), EPSILON);

        br.setIncludeBaseInRange(false);
        assertEquals(0.0, axis.getLowerBound(), EPSILON);
        assertEquals(1050.0, axis.getUpperBound(), EPSILON);

        axis.setAutoRangeIncludesZero(false);
        assertEquals(895.0, axis.getLowerBound(), EPSILON);
        assertEquals(1005.0, axis.getUpperBound(), EPSILON);
    }

    