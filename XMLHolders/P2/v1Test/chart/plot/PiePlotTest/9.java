@Test
    public void testGetDefaultSectionPaint() {
        PiePlot plot = new PiePlot();
        assertNotNull(plot.getDefaultSectionPaint());

        boolean pass = false;
        try {
            plot.setDefaultSectionPaint(null);
        }
        catch (IllegalArgumentException e) {
            pass = true;
        }
        assertTrue(pass);
    }

    