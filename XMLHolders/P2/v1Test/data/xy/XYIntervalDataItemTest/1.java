@Test
    public void testEquals() {
        XYIntervalDataItem item1 = new XYIntervalDataItem(1.0, 0.5, 1.5, 2.0,
                1.9, 2.1);
        XYIntervalDataItem item2 = new XYIntervalDataItem(1.0, 0.5, 1.5, 2.0,
                1.9, 2.1);
        assertTrue(item1.equals(item2));
        assertTrue(item2.equals(item1));

        // x
        item1 = new XYIntervalDataItem(1.1, 0.5, 1.5, 2.0, 1.9, 2.1);
        assertFalse(item1.equals(item2));
        item2 = new XYIntervalDataItem(1.1, 0.5, 1.5, 2.0, 1.9, 2.1);
        assertTrue(item1.equals(item2));

        // xLow
        item1 = new XYIntervalDataItem(1.1, 0.55, 1.5, 2.0, 1.9, 2.1);
        assertFalse(item1.equals(item2));
        item2 = new XYIntervalDataItem(1.1, 0.55, 1.5, 2.0, 1.9, 2.1);
        assertTrue(item1.equals(item2));

        // xHigh
        item1 = new XYIntervalDataItem(1.1, 0.55, 1.55, 2.0, 1.9, 2.1);
        assertFalse(item1.equals(item2));
        item2 = new XYIntervalDataItem(1.1, 0.55, 1.55, 2.0, 1.9, 2.1);
        assertTrue(item1.equals(item2));

        // y
        item1 = new XYIntervalDataItem(1.1, 0.55, 1.55, 2.2, 1.9, 2.1);
        assertFalse(item1.equals(item2));
        item2 = new XYIntervalDataItem(1.1, 0.55, 1.55, 2.2, 1.9, 2.1);
        assertTrue(item1.equals(item2));

        // yLow
        item1 = new XYIntervalDataItem(1.1, 0.55, 1.55, 2.2, 1.99, 2.1);
        assertFalse(item1.equals(item2));
        item2 = new XYIntervalDataItem(1.1, 0.55, 1.55, 2.2, 1.99, 2.1);
        assertTrue(item1.equals(item2));

        // yHigh
        item1 = new XYIntervalDataItem(1.1, 0.55, 1.55, 2.2, 1.99, 2.11);
        assertFalse(item1.equals(item2));
        item2 = new XYIntervalDataItem(1.1, 0.55, 1.55, 2.2, 1.99, 2.11);
        assertTrue(item1.equals(item2));
    }

    