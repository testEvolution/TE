@Test
    public void testConstructor1() {
        ChartPanel panel = new ChartPanel(null);
        assertEquals(null, panel.getChart());
    }

    