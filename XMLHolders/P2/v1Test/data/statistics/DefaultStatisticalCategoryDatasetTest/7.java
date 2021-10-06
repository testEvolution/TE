@Test
    public void testGetRangeUpperBound() {
        DefaultStatisticalCategoryDataset d1
                = new DefaultStatisticalCategoryDataset();
        d1.add(1.0, 2.0, "R1", "C1");
        assertEquals(1.0, d1.getRangeUpperBound(false), EPSILON);
        assertEquals(3.0, d1.getRangeUpperBound(true), EPSILON);
    }

    