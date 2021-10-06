@Test
    public void testIterateRangeBounds_IntervalCategoryDataset() {
        TestIntervalCategoryDataset d = new TestIntervalCategoryDataset();
        d.addItem(1.0, 2.0, 3.0, "R1", "C1");
        assertEquals(new Range(1.0, 3.0),
                DatasetUtils.iterateRangeBounds(d));

        d = new TestIntervalCategoryDataset();
        d.addItem(2.5, 2.0, 3.0, "R1", "C1");
        assertEquals(new Range(2.0, 3.0),
                DatasetUtils.iterateRangeBounds(d));

        d = new TestIntervalCategoryDataset();
        d.addItem(4.0, 2.0, 3.0, "R1", "C1");
        assertEquals(new Range(2.0, 4.0),
                DatasetUtils.iterateRangeBounds(d));

        d = new TestIntervalCategoryDataset();
        d.addItem(null, 2.0, 3.0, "R1", "C1");
        assertEquals(new Range(2.0, 3.0),
                DatasetUtils.iterateRangeBounds(d));

        // try some nulls
        d = new TestIntervalCategoryDataset();
        d.addItem(null, null, null, "R1", "C1");
        assertNull(DatasetUtils.iterateRangeBounds(d));

        d = new TestIntervalCategoryDataset();
        d.addItem(1.0, null, null, "R1", "C1");
        assertEquals(new Range(1.0, 1.0),
                DatasetUtils.iterateRangeBounds(d));

        d = new TestIntervalCategoryDataset();
        d.addItem(null, 1.0, null, "R1", "C1");
        assertEquals(new Range(1.0, 1.0),
                DatasetUtils.iterateRangeBounds(d));

        d = new TestIntervalCategoryDataset();
        d.addItem(null, null, 1.0, "R1", "C1");
        assertEquals(new Range(1.0, 1.0),
                DatasetUtils.iterateRangeBounds(d));
    }

    