@Test
    public void testGetRangeLowerBound() {
        DefaultStatisticalCategoryDataset d1
                = new DefaultStatisticalCategoryDataset();
        d1.add(1.0, 2.0, "R1", "C1");
        assertEquals(1.0, d1.getRangeLowerBound(false), EPSILON);
        assertEquals(-1.0, d1.getRangeLowerBound(true), EPSILON);
    }

    