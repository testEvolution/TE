@Test
    public void testGetStartValue() {
        TaskSeriesCollection c = createCollection1();
        assertEquals(1L, c.getStartValue("S1", "Task 1"));
        assertEquals(3L, c.getStartValue("S1", "Task 2"));
        assertEquals(5L, c.getStartValue("S2", "Task 3"));

        assertEquals(1L, c.getStartValue(0, 0));
        assertEquals(3L, c.getStartValue(0, 1));
        assertEquals(null, c.getStartValue(0, 2));
        assertEquals(null, c.getStartValue(1, 0));
        assertEquals(null, c.getStartValue(1, 1));
        assertEquals(5L, c.getStartValue(1, 2));

        // test collection 3, which doesn't define all tasks in all series
        TaskSeriesCollection c3 = createCollection3();
        assertEquals(100L, c3.getStartValue(0, 0));
        assertEquals(220L, c3.getStartValue(0, 1));
        assertTrue(c3.getStartValue(1, 0) == null);
        assertEquals(2220L, c3.getStartValue(1, 1));
    }

    