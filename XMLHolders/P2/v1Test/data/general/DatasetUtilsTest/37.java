@Test
    public void testFindStackedRangeBoundsForTableXYDataset2() {
        DefaultTableXYDataset d = new DefaultTableXYDataset();
        Range r = DatasetUtils.findStackedRangeBounds(d);
        assertEquals(r, new Range(0.0, 0.0));
    }

    