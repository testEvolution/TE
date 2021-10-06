@Test
    public void testCalculateRowTotal() {
        DefaultKeyedValues2D table = new DefaultKeyedValues2D();
        table.addValue(1.0, "R0", "C0");
        table.addValue(2.0, "R0", "C1");
        table.addValue(3.0, "R1", "C0");
        table.addValue(4.0, "R1", "C1");
        assertEquals(3.0, DataUtils.calculateRowTotal(table, 0), EPSILON);
        assertEquals(7.0, DataUtils.calculateRowTotal(table, 1), EPSILON);
        table.setValue(null, "R1", "C1");
        assertEquals(3.0, DataUtils.calculateRowTotal(table, 1), EPSILON);
    }

    