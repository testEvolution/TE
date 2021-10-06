@Test
    public void testGetEndValue() {
        TaskSeriesCollection c = createCollection1();
        assertEquals(2L, c.getEndValue("S1", "Task 1"));
        assertEquals(4L, c.getEndValue("S1", "Task 2"));
        assertEquals(6L, c.getEndValue("S2", "Task 3"));

        assertEquals(2L, c.getEndValue(0, 0));
        assertEquals(4L, c.getEndValue(0, 1));
        assertEquals(null, c.getEndValue(0, 2));
        assertEquals(null, c.getEndValue(1, 0));
        assertEquals(null, c.getEndValue(1, 1));
        assertEquals(6L, c.getEndValue(1, 2));

        // test collection 3, which doesn't define all tasks in all series
        TaskSeriesCollection c3 = createCollection3();
        assertEquals(200L, c3.getEndValue(0, 0));
        assertEquals(350L, c3.getEndValue(0, 1));
        assertTrue(c3.getEndValue(1, 0) == null);
        assertEquals(3350L, c3.getEndValue(1, 1));
    }

    