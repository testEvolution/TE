@Test
    public void testGetRowKey() {
        TaskSeriesCollection c = createCollection1();
        assertEquals("S1", c.getRowKey(0));
        assertEquals("S2", c.getRowKey(1));
    }

    