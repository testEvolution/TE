@Test
    public void testSortByValueDescending() {

        DefaultKeyedValues data = new DefaultKeyedValues();
        data.addValue("C", 1.0);
        data.addValue("B", null);
        data.addValue("D", 3.0);
        data.addValue("A", 2.0);

        data.sortByValues(SortOrder.DESCENDING);

        // check key order
        assertEquals(data.getKey(0), "D");
        assertEquals(data.getKey(1), "A");
        assertEquals(data.getKey(2), "C");
        assertEquals(data.getKey(3), "B");

        // check retrieve value by key
        assertEquals(data.getValue("A"), 2.0);
        assertEquals(data.getValue("B"), null);
        assertEquals(data.getValue("C"), 1.0);
        assertEquals(data.getValue("D"), 3.0);

        // check retrieve value by index
        assertEquals(data.getValue(0), 3.0);
        assertEquals(data.getValue(1), 2.0);
        assertEquals(data.getValue(2), 1.0);
        assertEquals(data.getValue(3), null);

    }

    