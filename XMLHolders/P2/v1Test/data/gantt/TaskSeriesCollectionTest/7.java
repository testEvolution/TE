@Test
    public void testGetRowIndex() {
        TaskSeriesCollection c = createCollection1();
        assertEquals(0, c.getRowIndex("S1"));
        assertEquals(1, c.getRowIndex("S2"));
    }

    