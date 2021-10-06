@Test
    public void testFindRangeBounds() {
        DefaultIntervalXYDataset dataset = new DefaultIntervalXYDataset();
        double[] x = {1.0, 2.0, 3.0, 4.0};
        double[] startx = {0.9, 1.8, 2.7, 3.6};
        double[] endx = {1.1, 2.2, 3.3, 4.4};
        double[] y = {1.0, 2.0, 3.0, 4.0};
        double[] starty = {0.9, 1.8, 2.7, 3.6};
        double[] endy = {1.1, 2.2, 3.3, 4.4};
        double[][] data = new double[][] {x, startx, endx, y, starty, endy};
        dataset.addSeries("Series 1", data);
        XYBarRenderer renderer = new XYBarRenderer();
        renderer.setUseYInterval(true);
        Range r = renderer.findRangeBounds(dataset);
        assertEquals(0.9, r.getLowerBound(), EPSILON);
        assertEquals(4.4, r.getUpperBound(), EPSILON);

        renderer.setUseYInterval(false);
        r = renderer.findRangeBounds(dataset);
        assertEquals(1.0, r.getLowerBound(), EPSILON);
        assertEquals(4.0, r.getUpperBound(), EPSILON);
    }

    