@Test
    public void testIterateDomainBounds() {
        XYDataset dataset = createXYDataset1();
        Range r = DatasetUtils.iterateDomainBounds(dataset);
        assertEquals(1.0, r.getLowerBound(), EPSILON);
        assertEquals(3.0, r.getUpperBound(), EPSILON);
    }

    