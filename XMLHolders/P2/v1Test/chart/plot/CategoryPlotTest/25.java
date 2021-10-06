@Test
    public void testRemoveRangeMarker() {
        CategoryPlot plot = new CategoryPlot();
        assertFalse(plot.removeRangeMarker(new ValueMarker(0.5)));
    }

    