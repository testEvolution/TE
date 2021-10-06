@Test
    public void testEquals() {
        TimeSeriesURLGenerator g1 = new TimeSeriesURLGenerator();
        TimeSeriesURLGenerator g2 = new TimeSeriesURLGenerator();
        assertTrue(g1.equals(g2));

        g1 = new TimeSeriesURLGenerator(new SimpleDateFormat("yyyy"), "prefix",
                "series", "item");
        assertFalse(g1.equals(g2));
        g2 = new TimeSeriesURLGenerator(new SimpleDateFormat("yyyy"), "prefix",
                "series", "item");
        assertTrue(g1.equals(g2));

        g1 = new TimeSeriesURLGenerator(new SimpleDateFormat("yy"), "prefix",
                "series", "item");
        assertFalse(g1.equals(g2));
        g2 = new TimeSeriesURLGenerator(new SimpleDateFormat("yy"), "prefix",
                "series", "item");
        assertTrue(g1.equals(g2));

        g1 = new TimeSeriesURLGenerator(new SimpleDateFormat("yy"), "prefix1",
                "series", "item");
        assertFalse(g1.equals(g2));
        g2 = new TimeSeriesURLGenerator(new SimpleDateFormat("yy"), "prefix1",
                "series", "item");
        assertTrue(g1.equals(g2));

        g1 = new TimeSeriesURLGenerator(new SimpleDateFormat("yy"), "prefix1",
                "series1", "item");
        assertFalse(g1.equals(g2));
        g2 = new TimeSeriesURLGenerator(new SimpleDateFormat("yy"), "prefix1",
                "series1", "item");
        assertTrue(g1.equals(g2));

        g1 = new TimeSeriesURLGenerator(new SimpleDateFormat("yy"), "prefix1",
                "series1", "item1");
        assertFalse(g1.equals(g2));
        g2 = new TimeSeriesURLGenerator(new SimpleDateFormat("yy"), "prefix1",
                "series1", "item1");
        assertTrue(g1.equals(g2));
    }

    