@Test
    public void testFindStackedRangeBounds_CategoryDataset2() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        Range r = DatasetUtils.findStackedRangeBounds(dataset);
        assertTrue(r == null);

        dataset.addValue(5.0, "R1", "C1");
        r = DatasetUtils.findStackedRangeBounds(dataset, 3.0);
        assertEquals(3.0, r.getLowerBound(), EPSILON);
        assertEquals(8.0, r.getUpperBound(), EPSILON);

        dataset.addValue(-1.0, "R2", "C1");
        r = DatasetUtils.findStackedRangeBounds(dataset, 3.0);
        assertEquals(2.0, r.getLowerBound(), EPSILON);
        assertEquals(8.0, r.getUpperBound(), EPSILON);

        dataset.addValue(null, "R3", "C1");
        r = DatasetUtils.findStackedRangeBounds(dataset, 3.0);
        assertEquals(2.0, r.getLowerBound(), EPSILON);
        assertEquals(8.0, r.getUpperBound(), EPSILON);

        dataset.addValue(Double.NaN, "R4", "C1");
        r = DatasetUtils.findStackedRangeBounds(dataset, 3.0);
        assertEquals(2.0, r.getLowerBound(), EPSILON);
        assertEquals(8.0, r.getUpperBound(), EPSILON);
    }

    