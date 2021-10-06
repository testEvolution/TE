@Test
    public void test3072674() {
        DefaultStatisticalCategoryDataset dataset
                = new DefaultStatisticalCategoryDataset();
        dataset.add(1.0, Double.NaN, "R1", "C1");
        assertEquals(1.0, dataset.getRangeLowerBound(true), EPSILON);
        assertEquals(1.0, dataset.getRangeUpperBound(true), EPSILON);
        
        Range r = dataset.getRangeBounds(true);
        assertEquals(1.0, r.getLowerBound(), EPSILON);
        assertEquals(1.0, r.getUpperBound(), EPSILON);
    }


}