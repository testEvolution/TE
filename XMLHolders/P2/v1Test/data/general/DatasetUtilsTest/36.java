@Test
    public void testFindStackedRangeBoundsForTableXYDataset1() {
        TableXYDataset d2 = createTableXYDataset1();
        Range r = DatasetUtils.findStackedRangeBounds(d2);
        assertEquals(-2.0, r.getLowerBound(), EPSILON);
        assertEquals(2.0, r.getUpperBound(), EPSILON);
    }

    