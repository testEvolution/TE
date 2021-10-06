@Test
    public void testColumnCount() {
        DefaultKeyedValues2D d = new DefaultKeyedValues2D();
        assertEquals(0, d.getColumnCount());
        d.addValue(1.0, "R1", "C1");
        assertEquals(1, d.getColumnCount());
        d.addValue(2.0, "R1", "C2");
        assertEquals(2, d.getColumnCount());
    }

    