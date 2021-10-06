@Test
    public void testCloning() throws CloneNotSupportedException {
        XYIntervalSeriesCollection c1 = new XYIntervalSeriesCollection();
        XYIntervalSeries s1 = new XYIntervalSeries("Series");
        s1.add(1.0, 1.1, 1.2, 1.3, 1.4, 1.5);
        XYIntervalSeriesCollection c2 = (XYIntervalSeriesCollection) c1.clone();
        assertTrue(c1 != c2);
        assertTrue(c1.getClass() == c2.getClass());
        assertTrue(c1.equals(c2));

        // check independence
        c1.addSeries(new XYIntervalSeries("Empty"));
        assertFalse(c1.equals(c2));
        c2.addSeries(new XYIntervalSeries("Empty"));
        assertTrue(c1.equals(c2));
    }

    