@Test
    public void testGetValue() {
        TaskSeriesCollection c = createCollection1();
        assertEquals(1L, c.getValue("S1", "Task 1"));
        assertEquals(3L, c.getValue("S1", "Task 2"));
        assertEquals(5L, c.getValue("S2", "Task 3"));

        assertEquals(1L, c.getValue(0, 0));
        assertEquals(3L, c.getValue(0, 1));
        assertEquals(null, c.getValue(0, 2));
        assertEquals(null, c.getValue(1, 0));
        assertEquals(null, c.getValue(1, 1));
        assertEquals(5L, c.getValue(1, 2));
    }

    