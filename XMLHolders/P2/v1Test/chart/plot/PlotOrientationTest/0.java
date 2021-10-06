@Test
    public void testEquals() {
        assertEquals(PlotOrientation.HORIZONTAL, PlotOrientation.HORIZONTAL);
        assertEquals(PlotOrientation.VERTICAL, PlotOrientation.VERTICAL);
        assertFalse(
            PlotOrientation.HORIZONTAL.equals(PlotOrientation.VERTICAL)
        );
        assertFalse(
            PlotOrientation.VERTICAL.equals(PlotOrientation.HORIZONTAL)
        );
    }

    