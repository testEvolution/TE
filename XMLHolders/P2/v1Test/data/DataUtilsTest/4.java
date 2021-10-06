@Test
    public void testCalculateRowTotal2() {
        DefaultKeyedValues2D table = new DefaultKeyedValues2D();
        table.addValue(1.0, "R0", "C0");
        table.addValue(2.0, "R0", "C1");
        table.addValue(3.0, "R1", "C0");
        table.addValue(4.0, "R1", "C1");
        assertEquals(3.0, DataUtils.calculateRowTotal(table, 0,
                new int[] {0, 1}), EPSILON);
        assertEquals(1.0, DataUtils.calculateRowTotal(table, 0,
                new int[] {0}), EPSILON);
        assertEquals(2.0, DataUtils.calculateRowTotal(table, 0,
                new int[] {1}), EPSILON);
        assertEquals(0.0, DataUtils.calculateRowTotal(table, 0,
                new int[] {}), EPSILON);

        assertEquals(7.0, DataUtils.calculateRowTotal(table, 1,
                new int[] {0, 1}), EPSILON);
        assertEquals(3.0, DataUtils.calculateRowTotal(table, 1,
                new int[] {0}), EPSILON);
        assertEquals(4.0, DataUtils.calculateRowTotal(table, 1,
                new int[] {1}), EPSILON);
        assertEquals(0.0, DataUtils.calculateRowTotal(table, 1,
                new int[] {}), EPSILON);
        table.setValue(null, "R1", "C1");
        assertEquals(3.0, DataUtils.calculateRowTotal(table, 1,
                new int[] {0, 1}), EPSILON);
        assertEquals(0.0, DataUtils.calculateRowTotal(table, 1,
                new int[] {1}), EPSILON);
    }

    