@Test
    public void testBug2849731() {
        TestIntervalCategoryDataset d = new TestIntervalCategoryDataset();
        d.addItem(2.5, 2.0, 3.0, "R1", "C1");
        d.addItem(4.0, null, null, "R2", "C1");
        assertEquals(new Range(2.0, 4.0),
                DatasetUtils.iterateRangeBounds(d));
    }

    