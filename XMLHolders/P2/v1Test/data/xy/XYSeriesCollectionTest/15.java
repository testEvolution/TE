@Test
    public void testRenameSeries() {
        XYSeries s1 = new XYSeries("S1");
        XYSeries s2 = new XYSeries("S2");
        XYSeriesCollection dataset = new XYSeriesCollection();
        dataset.addSeries(s1);
        dataset.addSeries(s2);

        try {
            s2.setKey("S1");
            fail("Should have thrown IllegalArgumentException on negative key");
        }
        catch (IllegalArgumentException e) {
           assertEquals("Duplicate key2", e.getMessage());
        }
    }

    