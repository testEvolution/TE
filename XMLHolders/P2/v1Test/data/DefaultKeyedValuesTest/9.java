@Test
    public void testInsertValue() {
        DefaultKeyedValues v1 = new DefaultKeyedValues();
        v1.insertValue(0, "A", 1.0);
        assertEquals(1.0, v1.getValue(0));
        v1.insertValue(0, "B", 2.0);
        assertEquals(2.0, v1.getValue(0));
        assertEquals(1.0, v1.getValue(1));

        // it's OK to use an index equal to the size of the list
        v1.insertValue(2, "C", 3.0);
        assertEquals(2.0, v1.getValue(0));
        assertEquals(1.0, v1.getValue(1));
        assertEquals(3.0, v1.getValue(2));

        // try replacing an existing value
        v1.insertValue(2, "B", 4.0);
        assertEquals(1.0, v1.getValue(0));
        assertEquals(3.0, v1.getValue(1));
        assertEquals(4.0, v1.getValue(2));
    }

    