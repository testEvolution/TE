@Test
    public void testGetColumnIndex() {
        TaskSeriesCollection c = createCollection1();
        assertEquals(0, c.getColumnIndex("Task 1"));
        assertEquals(1, c.getColumnIndex("Task 2"));
        assertEquals(2, c.getColumnIndex("Task 3"));
    }

    