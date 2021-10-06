@Test
    public void testOutlinePaintLookup() {
        BarRenderer r = new BarRenderer();
        assertEquals(Color.GRAY, r.getDefaultOutlinePaint());

        // first check that autoPopulate==false works as expected
        r.setAutoPopulateSeriesOutlinePaint(false);
        assertEquals(Color.GRAY, r.lookupSeriesOutlinePaint(0));
        assertNull(r.getSeriesOutlinePaint(0));

        // now check autoPopulate==true
        r.setAutoPopulateSeriesOutlinePaint(true);
        /*CategoryPlot plot =*/ new CategoryPlot(null, new CategoryAxis(
                "Category"), new NumberAxis("Value"), r);
        assertEquals(DefaultDrawingSupplier.DEFAULT_OUTLINE_PAINT_SEQUENCE[0],
                r.lookupSeriesOutlinePaint(0));
        assertNotNull(r.getSeriesOutlinePaint(0));
    }

}