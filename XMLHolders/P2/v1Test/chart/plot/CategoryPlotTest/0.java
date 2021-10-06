@Test
    public void testConstructor() {
        CategoryPlot plot = new CategoryPlot();
        assertEquals(RectangleInsets.ZERO_INSETS, plot.getAxisOffset());
    }

    