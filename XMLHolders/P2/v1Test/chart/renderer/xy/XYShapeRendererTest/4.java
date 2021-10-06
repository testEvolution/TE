@Test
    public void test3026341() {
        XYShapeRenderer renderer = new XYShapeRenderer();
        assertNull(renderer.findRangeBounds(null));

        XYSeriesCollection dataset = new XYSeriesCollection();
        XYSeries series = new XYSeries("S1");
        series.add(1.0, null);
        dataset.addSeries(series);
        Range r = renderer.findRangeBounds(dataset);
        assertNull(r);

        // test findDomainBounds as well
        r = renderer.findDomainBounds(dataset);
        assertEquals(r.getLowerBound(), 1.0, EPSILON);
        assertEquals(r.getUpperBound(), 1.0, EPSILON);

        dataset.removeAllSeries();
        r = renderer.findDomainBounds(dataset);
        assertNull(r);
    }

}