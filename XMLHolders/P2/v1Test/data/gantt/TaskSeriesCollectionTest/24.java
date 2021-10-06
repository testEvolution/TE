@Test
    public void testGetSubIntervalCount() {
        TaskSeriesCollection tsc = createCollection3();
        assertEquals(1, tsc.getSubIntervalCount(0, 0));
        assertEquals(2, tsc.getSubIntervalCount(0, 1));
        assertEquals(0, tsc.getSubIntervalCount(1, 0));
        assertEquals(3, tsc.getSubIntervalCount(1, 1));
    }

    