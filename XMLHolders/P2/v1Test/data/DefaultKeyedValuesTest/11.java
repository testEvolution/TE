@Test
    public void testInsertAndRetrieve() {

        DefaultKeyedValues data = new DefaultKeyedValues();
        data.addValue("A", 1.0);
        data.addValue("B", 2.0);
        data.addValue("C", 3.0);
        data.addValue("D", null);

        // check key order
        assertEquals(data.getKey(0), "A");
        assertEquals(data.getKey(1), "B");
        assertEquals(data.getKey(2), "C");
        assertEquals(data.getKey(3), "D");

        // check retrieve value by key
        assertEquals(data.getValue("A"), 1.0);
        assertEquals(data.getValue("B"), 2.0);
        assertEquals(data.getValue("C"), 3.0);
        assertEquals(data.getValue("D"), null);

        // check retrieve value by index
        assertEquals(data.getValue(0), 1.0);
        assertEquals(data.getValue(1), 2.0);
        assertEquals(data.getValue(2), 3.0);
        assertEquals(data.getValue(3), null);
    }

    