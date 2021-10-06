@Test
    public void testAddSeries() {
        DefaultIntervalXYDataset d = new DefaultIntervalXYDataset();
        d.addSeries("S1", new double[][] {{1.0}, {0.5}, {1.5}, {2.0}, {2.5},
                {1.5}});
        assertEquals(1, d.getSeriesCount());
        assertEquals("S1", d.getSeriesKey(0));

        // check that adding a series will overwrite the old series
        d.addSeries("S1", new double[][] {{1.1}, {0.6}, {1.6}, {2.1}, {2.6},
                {1.6}});
        assertEquals(1, d.getSeriesCount());
        assertEquals(2.1, d.getYValue(0, 0), EPSILON);

        // check null key
        boolean pass = false;
        try
        {
          d.addSeries(null, new double[][] {{1.1}, {0.6}, {1.6}, {2.1}, {2.6},
                  {1.6}});
        }
        catch (IllegalArgumentException e)
        {
          pass = true;
        }
        assertTrue(pass);
    }

    