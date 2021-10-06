@Test
    public void testFindDomainBounds() {
        XYDataset dataset = createXYDataset1();
        Range r = DatasetUtils.findDomainBounds(dataset);
        assertEquals(1.0, r.getLowerBound(), EPSILON);
        assertEquals(3.0, r.getUpperBound(), EPSILON);
    }

    