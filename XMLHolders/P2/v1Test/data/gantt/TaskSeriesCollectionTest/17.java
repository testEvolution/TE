@Test
    public void testGetColumnKey() {
        TaskSeriesCollection c = createCollection1();
        assertEquals("Task 1", c.getColumnKey(0));
        assertEquals("Task 2", c.getColumnKey(1));
        assertEquals("Task 3", c.getColumnKey(2));
    }

    