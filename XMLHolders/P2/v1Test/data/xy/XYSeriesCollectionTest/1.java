@Test
    public void testEquals() {
        XYSeries s1 = new XYSeries("Series");
        s1.add(1.0, 1.1);
        XYSeriesCollection c1 = new XYSeriesCollection();
        c1.addSeries(s1);
        XYSeries s2 = new XYSeries("Series");
        s2.add(1.0, 1.1);
        XYSeriesCollection c2 = new XYSeriesCollection();
        c2.addSeries(s2);
        assertEquals(c1, c2);
        assertEquals(c2, c1);

        c1.addSeries(new XYSeries("Empty Series"));
        assertFalse(c1.equals(c2));
        c2.addSeries(new XYSeries("Empty Series"));
        assertEquals(c1, c2);

        c1.setIntervalWidth(5.0);
        assertFalse(c1.equals(c2));
        c2.setIntervalWidth(5.0);
        assertEquals(c1, c2);

        c1.setIntervalPositionFactor(0.75);
        assertFalse(c1.equals(c2));
        c2.setIntervalPositionFactor(0.75);
        assertEquals(c1, c2);

        c1.setAutoWidth(true);
        assertFalse(c1.equals(c2));
        c2.setAutoWidth(true);
        assertEquals(c1, c2);

    }

    