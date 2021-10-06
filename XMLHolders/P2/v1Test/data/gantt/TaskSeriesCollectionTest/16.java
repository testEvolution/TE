@Test
    public void testGetColumnCount() {
        TaskSeriesCollection c = createCollection1();
        assertEquals(3, c.getColumnCount());
    }

    