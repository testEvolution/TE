@Test
    public void testEquals() {
        OHLCItem item1 = new OHLCItem(new Year(2006), 2.0, 4.0, 1.0, 3.0);
        OHLCItem item2 = new OHLCItem(new Year(2006), 2.0, 4.0, 1.0, 3.0);
        assertTrue(item1.equals(item2));
        assertTrue(item2.equals(item1));

        // period
        item1 = new OHLCItem(new Year(2007), 2.0, 4.0, 1.0, 3.0);
        assertFalse(item1.equals(item2));
        item2 = new OHLCItem(new Year(2007), 2.0, 4.0, 1.0, 3.0);
        assertTrue(item1.equals(item2));

        // open
        item1 = new OHLCItem(new Year(2007), 2.2, 4.0, 1.0, 3.0);
        assertFalse(item1.equals(item2));
        item2 = new OHLCItem(new Year(2007), 2.2, 4.0, 1.0, 3.0);
        assertTrue(item1.equals(item2));

        // high
        item1 = new OHLCItem(new Year(2007), 2.2, 4.4, 1.0, 3.0);
        assertFalse(item1.equals(item2));
        item2 = new OHLCItem(new Year(2007), 2.2, 4.4, 1.0, 3.0);
        assertTrue(item1.equals(item2));

        // low
        item1 = new OHLCItem(new Year(2007), 2.2, 4.4, 1.1, 3.0);
        assertFalse(item1.equals(item2));
        item2 = new OHLCItem(new Year(2007), 2.2, 4.4, 1.1, 3.0);
        assertTrue(item1.equals(item2));

        // close
        item1 = new OHLCItem(new Year(2007), 2.2, 4.4, 1.1, 3.3);
        assertFalse(item1.equals(item2));
        item2 = new OHLCItem(new Year(2007), 2.2, 4.4, 1.1, 3.3);
        assertTrue(item1.equals(item2));
    }

    