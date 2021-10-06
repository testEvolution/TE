@Test
    public void testRowCount() {
        DefaultKeyedValues2D d = new DefaultKeyedValues2D();
        assertEquals(0, d.getRowCount());
        d.addValue(1.0, "R1", "C1");
        assertEquals(1, d.getRowCount());
        d.addValue(2.0, "R2", "C1");
        assertEquals(2, d.getRowCount());
    }

    