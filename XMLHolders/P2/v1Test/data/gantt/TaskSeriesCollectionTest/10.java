@Test
    public void testGetStartValue2() {
        TaskSeriesCollection c = createCollection2();
        assertEquals(10L, c.getStartValue("S1", "Task 1", 0));
        assertEquals(16L, c.getStartValue("S1", "Task 1", 1));
        assertEquals(30L, c.getStartValue("S1", "Task 2", 0));
        assertEquals(36L, c.getStartValue("S1", "Task 2", 1));
        assertEquals(50L, c.getStartValue("S2", "Task 3", 0));
        assertEquals(56L, c.getStartValue("S2", "Task 3", 1));

        assertEquals(10L, c.getStartValue(0, 0, 0));
        assertEquals(16L, c.getStartValue(0, 0, 1));
        assertEquals(30L, c.getStartValue(0, 1, 0));
        assertEquals(36L, c.getStartValue(0, 1, 1));
        assertEquals(50L, c.getStartValue(1, 2, 0));
        assertEquals(56L, c.getStartValue(1, 2, 1));

        TaskSeriesCollection c3 = createCollection3();
        assertEquals(11L, c3.getStartValue(0, 0, 0));
        assertEquals(22L, c3.getStartValue(0, 1, 0));
        assertEquals(33L, c3.getStartValue(0, 1, 1));
        assertTrue(c3.getStartValue(1, 0, 0) == null);
        assertEquals(44L, c3.getStartValue(1, 1, 0));
        assertEquals(55L, c3.getStartValue(1, 1, 1));
        assertEquals(66L, c3.getStartValue(1, 1, 2));
    }

    