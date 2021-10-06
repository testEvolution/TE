@Test
    public void testRemoveValue() {
        DefaultKeyedValues2D d = new DefaultKeyedValues2D();
        d.removeValue("R1", "C1");
        d.addValue(1.0, "R1", "C1");
        d.removeValue("R1", "C1");
        assertEquals(0, d.getRowCount());
        assertEquals(0, d.getColumnCount());

        d.addValue(1.0, "R1", "C1");
        d.addValue(2.0, "R2", "C1");
        d.removeValue("R1", "C1");
        assertEquals(2.0, d.getValue(0, 0));
    }

    