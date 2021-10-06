@Test
    public void testFindRangeBounds() {
        XYDataset dataset = createXYDataset1();
        Range r = DatasetUtils.findRangeBounds(dataset);
        assertEquals(100.0, r.getLowerBound(), EPSILON);
        assertEquals(105.0, r.getUpperBound(), EPSILON);
    }

    