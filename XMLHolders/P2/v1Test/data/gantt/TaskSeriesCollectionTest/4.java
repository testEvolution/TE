@Test
    public void testGetSeriesKey() {
        TaskSeriesCollection c = createCollection1();
        assertEquals("S1", c.getSeriesKey(0));
        assertEquals("S2", c.getSeriesKey(1));
    }

    