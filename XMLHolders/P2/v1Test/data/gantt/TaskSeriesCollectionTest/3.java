@Test
    public void testGetSeriesCount() {
        TaskSeriesCollection c = createCollection1();
        assertEquals(2, c.getSeriesCount());
    }

    