@Test
    public void testRemoveRangeMarker() {
        XYPlot plot = new XYPlot();
        assertFalse(plot.removeRangeMarker(new ValueMarker(0.5)));
    }

    