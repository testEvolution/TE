@Test
    public void testGetRowCount() {
        TaskSeriesCollection c = createCollection1();
        assertEquals(2, c.getRowCount());
    }

    