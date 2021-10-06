@Test
    public void testEquals() {
        XYIntervalSeriesCollection c1 = new XYIntervalSeriesCollection();
        XYIntervalSeriesCollection c2 = new XYIntervalSeriesCollection();
        assertEquals(c1, c2);

        // add a series
        XYIntervalSeries s1 = new XYIntervalSeries("Series");
        s1.add(1.0, 1.1, 1.2, 1.3, 1.4, 1.5);
        c1.addSeries(s1);
        assertFalse(c1.equals(c2));
        XYIntervalSeries s2 = new XYIntervalSeries("Series");
        s2.add(1.0, 1.1, 1.2, 1.3, 1.4, 1.5);
        c2.addSeries(s2);
        assertTrue(c1.equals(c2));

        // add an empty series
        c1.addSeries(new XYIntervalSeries("Empty Series"));
        assertFalse(c1.equals(c2));
        c2.addSeries(new XYIntervalSeries("Empty Series"));
        assertTrue(c1.equals(c2));
    }

    