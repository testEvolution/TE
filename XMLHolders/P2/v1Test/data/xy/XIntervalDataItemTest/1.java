@Test
    public void testEquals() {
        XIntervalDataItem item1 = new XIntervalDataItem(1.0, 2.0, 3.0, 4.0);
        XIntervalDataItem item2 = new XIntervalDataItem(1.0, 2.0, 3.0, 4.0);
        assertTrue(item1.equals(item2));
        assertTrue(item2.equals(item1));

        // x
        item1 = new XIntervalDataItem(1.1, 2.0, 3.0, 4.0);
        assertFalse(item1.equals(item2));
        item2 = new XIntervalDataItem(1.1, 2.0, 3.0, 4.0);
        assertTrue(item1.equals(item2));

        // xLow
        item1 = new XIntervalDataItem(1.1, 2.2, 3.0, 4.0);
        assertFalse(item1.equals(item2));
        item2 = new XIntervalDataItem(1.1, 2.2, 3.0, 4.0);
        assertTrue(item1.equals(item2));

        // xHigh
        item1 = new XIntervalDataItem(1.1, 2.2, 3.3, 4.0);
        assertFalse(item1.equals(item2));
        item2 = new XIntervalDataItem(1.1, 2.2, 3.3, 4.0);
        assertTrue(item1.equals(item2));

        // y
        item1 = new XIntervalDataItem(1.1, 2.2, 3.3, 4.4);
        assertFalse(item1.equals(item2));
        item2 = new XIntervalDataItem(1.1, 2.2, 3.3, 4.4);
        assertTrue(item1.equals(item2));

    }

    