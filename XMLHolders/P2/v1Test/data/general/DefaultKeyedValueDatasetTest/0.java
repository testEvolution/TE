@Test
    public void testEquals() {

        DefaultKeyedValueDataset d1
                = new DefaultKeyedValueDataset("Test", 45.5);
        DefaultKeyedValueDataset d2
                = new DefaultKeyedValueDataset("Test", 45.5);
        assertTrue(d1.equals(d2));
        assertTrue(d2.equals(d1));

        d1 = new DefaultKeyedValueDataset("Test 1", 45.5);
        d2 = new DefaultKeyedValueDataset("Test 2", 45.5);
        assertFalse(d1.equals(d2));

        d1 = new DefaultKeyedValueDataset("Test", 45.5);
        d2 = new DefaultKeyedValueDataset("Test", 45.6);
        assertFalse(d1.equals(d2));

    }

    