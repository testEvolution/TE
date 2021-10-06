@Test
    public void testGetPercentComplete() {
        TaskSeriesCollection c = createCollection2();
        assertEquals(0.10, c.getPercentComplete("S1", "Task 1"));
        assertEquals(0.20, c.getPercentComplete("S1", "Task 2"));
        assertEquals(0.30, c.getPercentComplete("S2", "Task 3"));

        assertEquals(0.10, c.getPercentComplete(0, 0));
        assertEquals(0.20, c.getPercentComplete(0, 1));
        assertEquals(null, c.getPercentComplete(0, 2));
        assertEquals(null, c.getPercentComplete(1, 0));
        assertEquals(null, c.getPercentComplete(1, 1));
        assertEquals(0.30, c.getPercentComplete(1, 2));

        // test collection 3, which doesn't define all tasks in all series
        TaskSeriesCollection c3 = createCollection3();
        assertEquals(0.1, c3.getPercentComplete(0, 0));
        assertEquals(0.2, c3.getPercentComplete(0, 1));
        assertTrue(c3.getPercentComplete(1, 0) == null);
        assertEquals(0.3, c3.getPercentComplete(1, 1));

        assertEquals(0.111, c3.getPercentComplete(0, 0, 0));

        assertEquals(0.222, c3.getPercentComplete(0, 1, 0));
        assertEquals(0.333, c3.getPercentComplete(0, 1, 1));

        assertEquals(0.444, c3.getPercentComplete(1, 1, 0));
        assertEquals(0.555, c3.getPercentComplete(1, 1, 1));
        assertEquals(0.666, c3.getPercentComplete(1, 1, 2));
    }

    