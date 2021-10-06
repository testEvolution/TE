@Test
    public void testPaintLookup() {
        BarRenderer r = new BarRenderer();
        assertEquals(Color.BLUE, r.getDefaultPaint());

        // first check that autoPopulate==false works as expected
        r.setAutoPopulateSeriesPaint(false);
        assertEquals(Color.BLUE, r.lookupSeriesPaint(0));
        assertNull(r.getSeriesPaint(0));

        // now check autoPopulate==true
        r.setAutoPopulateSeriesPaint(true);
        /*CategoryPlot plot =*/ new CategoryPlot(null, new CategoryAxis(
                "Category"), new NumberAxis("Value"), r);
        assertEquals(DefaultDrawingSupplier.DEFAULT_PAINT_SEQUENCE[0],
                r.lookupSeriesPaint(0));
        assertNotNull(r.getSeriesPaint(0));
    }

    