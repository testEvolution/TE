@Test
    public void testAddSeries() {
        DefaultXYZDataset d = new DefaultXYZDataset();
        d.addSeries("S1", new double[][] {{1.0}, {2.0}, {3.0}});
        assertEquals(1, d.getSeriesCount());
        assertEquals("S1", d.getSeriesKey(0));

        // check that adding a series will overwrite the old series
        d.addSeries("S1", new double[][] {{11.0}, {12.0}, {13.0}});
        assertEquals(1, d.getSeriesCount());
        assertEquals(12.0, d.getYValue(0, 0), EPSILON);

        // check null key
        boolean pass = false;
        try
        {
          d.addSeries(null, new double[][] {{1.0}, {2.0}, {3.0}});
        }
        catch (IllegalArgumentException e)
        {
          pass = true;
        }
        assertTrue(pass);
    }

    