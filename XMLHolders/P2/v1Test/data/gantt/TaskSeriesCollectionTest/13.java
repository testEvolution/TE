@Test
    public void testGetEndValue2() {
        TaskSeriesCollection c = createCollection2();
        assertEquals(15L, c.getEndValue("S1", "Task 1", 0));
        assertEquals(20L, c.getEndValue("S1", "Task 1", 1));
        assertEquals(35L, c.getEndValue("S1", "Task 2", 0));
        assertEquals(40L, c.getEndValue("S1", "Task 2", 1));
        assertEquals(55L, c.getEndValue("S2", "Task 3", 0));
        assertEquals(60L, c.getEndValue("S2", "Task 3", 1));

        assertEquals(15L, c.getEndValue(0, 0, 0));
        assertEquals(20L, c.getEndValue(0, 0, 1));
        assertEquals(35L, c.getEndValue(0, 1, 0));
        assertEquals(40L, c.getEndValue(0, 1, 1));
        assertEquals(55L, c.getEndValue(1, 2, 0));
        assertEquals(60L, c.getEndValue(1, 2, 1));

        TaskSeriesCollection c3 = createCollection3();
        assertEquals(111L, c3.getEndValue(0, 0, 0));
        assertEquals(222L, c3.getEndValue(0, 1, 0));
        assertEquals(333L, c3.getEndValue(0, 1, 1));
        assertTrue(c3.getEndValue(1, 0, 0) == null);
        assertEquals(444L, c3.getEndValue(1, 1, 0));
        assertEquals(555L, c3.getEndValue(1, 1, 1));
        assertEquals(666L, c3.getEndValue(1, 1, 2));
    }

    