@Test
    public void testCalculateColumnTotal2() {
        DefaultKeyedValues2D table = new DefaultKeyedValues2D();
        table.addValue(1.0, "R0", "C0");
        table.addValue(2.0, "R0", "C1");
        table.addValue(3.0, "R1", "C0");
        table.addValue(4.0, "R1", "C1");
        assertEquals(4.0, DataUtils.calculateColumnTotal(table, 0,
                new int[] {0, 1}), EPSILON);
        assertEquals(1.0, DataUtils.calculateColumnTotal(table, 0,
                new int[] {0}), EPSILON);
        assertEquals(3.0, DataUtils.calculateColumnTotal(table, 0,
                new int[] {1}), EPSILON);
        assertEquals(0.0, DataUtils.calculateColumnTotal(table, 0,
                new int[] {}), EPSILON);

        assertEquals(6.0, DataUtils.calculateColumnTotal(table, 1,
                new int[] {0, 1}), EPSILON);
        assertEquals(2.0, DataUtils.calculateColumnTotal(table, 1,
                new int[] {0}), EPSILON);
        assertEquals(4.0, DataUtils.calculateColumnTotal(table, 1,
                new int[] {1}), EPSILON);

        table.setValue(null, "R1", "C1");
        assertEquals(2.0, DataUtils.calculateColumnTotal(table, 1,
                new int[] {0, 1}), EPSILON);
        assertEquals(0.0, DataUtils.calculateColumnTotal(table, 1,
                new int[] {1}), EPSILON);
    }

    