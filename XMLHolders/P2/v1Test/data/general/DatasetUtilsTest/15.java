@Test
    public void testIterateRangeBounds3_CategoryDataset() {
        Number[][] starts = new Double[2][3];
        Number[][] ends = new Double[2][3];
        starts[0][0] = 1.0;
        starts[0][1] = 2.0;
        starts[0][2] = 3.0;
        starts[1][0] = 11.0;
        starts[1][1] = 12.0;
        starts[1][2] = 13.0;
        ends[0][0] = 4.0;
        ends[0][1] = 5.0;
        ends[0][2] = 6.0;
        ends[1][0] = 16.0;
        ends[1][1] = 15.0;
        ends[1][2] = 14.0;

        DefaultIntervalCategoryDataset d = new DefaultIntervalCategoryDataset(
                starts, ends);
        Range r = DatasetUtils.iterateRangeBounds(d, false);
        assertEquals(4.0, r.getLowerBound(), EPSILON);
        assertEquals(16.0, r.getUpperBound(), EPSILON);
        r = DatasetUtils.iterateRangeBounds(d, true);
        assertEquals(1.0, r.getLowerBound(), EPSILON);
        assertEquals(16.0, r.getUpperBound(), EPSILON);
    }

    