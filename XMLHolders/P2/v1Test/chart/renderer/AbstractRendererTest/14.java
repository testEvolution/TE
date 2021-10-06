@Test
    public void testFillPaintLookup() {
        BarRenderer r = new BarRenderer();
        assertEquals(Color.WHITE, r.getDefaultFillPaint());

        // first check that autoPopulate==false works as expected
        r.setAutoPopulateSeriesFillPaint(false);
        assertEquals(Color.WHITE, r.lookupSeriesFillPaint(0));
        assertNull(r.getSeriesFillPaint(0));

        // now check autoPopulate==true
        r.setAutoPopulateSeriesFillPaint(true);
        /*CategoryPlot plot =*/ new CategoryPlot(null, new CategoryAxis(
                "Category"), new NumberAxis("Value"), r);
        assertEquals(DefaultDrawingSupplier.DEFAULT_FILL_PAINT_SEQUENCE[0],
                r.lookupSeriesFillPaint(0));
        assertNotNull(r.getSeriesFillPaint(0));
    }

    