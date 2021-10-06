@Test
    public void testSetNullRenderer() {
        boolean failed = false;
        try {
            XYPlot plot = new XYPlot(null, new NumberAxis("X"),
                    new NumberAxis("Y"), null);
            plot.setRenderer(null);
        }
        catch (Exception e) {
            failed = true;
        }
        assertTrue(!failed);
    }

    