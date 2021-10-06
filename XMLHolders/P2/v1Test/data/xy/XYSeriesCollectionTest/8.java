@Test
    public void testAddSeries() {
        XYSeriesCollection c = new XYSeriesCollection();
        XYSeries s1 = new XYSeries("s1");
        c.addSeries(s1);

        // the dataset should prevent the addition of a series with the
        // same name as an existing series in the dataset
        XYSeries s2 = new XYSeries("s1");
        try {
            c.addSeries(s2);
            fail("Should have thrown IllegalArgumentException on duplicate key");
        } catch (IllegalArgumentException e) {
            assertEquals("This dataset already contains a series with the key s1", e.getMessage());
        }
        assertEquals(1, c.getSeriesCount());
    }

    