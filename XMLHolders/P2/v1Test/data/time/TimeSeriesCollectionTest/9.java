@Test
    public void testCloning() throws CloneNotSupportedException {
        TimeSeries s1 = new TimeSeries("Series");
        s1.add(new Year(2009), 1.1);
        TimeSeriesCollection c1 = new TimeSeriesCollection();
        c1.addSeries(s1);
        TimeSeriesCollection c2 = (TimeSeriesCollection) c1.clone();
        assertTrue(c1 != c2);
        assertTrue(c1.getClass() == c2.getClass());
        assertTrue(c1.equals(c2));

        // check independence
        s1.setDescription("XYZ");
        assertFalse(c1.equals(c2));
        c2.getSeries(0).setDescription("XYZ");
        assertTrue(c1.equals(c2));
    }

    