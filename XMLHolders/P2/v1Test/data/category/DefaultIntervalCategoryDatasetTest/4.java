@Test
    public void testCloning() throws CloneNotSupportedException {
        double[] starts_S1 = new double[] {0.1, 0.2, 0.3};
        double[] starts_S2 = new double[] {0.3, 0.4, 0.5};
        double[] ends_S1 = new double[] {0.5, 0.6, 0.7};
        double[] ends_S2 = new double[] {0.7, 0.8, 0.9};
        double[][] starts = new double[][] {starts_S1, starts_S2};
        double[][] ends = new double[][] {ends_S1, ends_S2};
        DefaultIntervalCategoryDataset d1 = new DefaultIntervalCategoryDataset(
                new Comparable[] {"Series 1", "Series 2"},
                new Comparable[] {"Category 1", "Category 2", "Category 3"},
                DataUtils.createNumberArray2D(starts),
                DataUtils.createNumberArray2D(ends));
        DefaultIntervalCategoryDataset d2 = 
                (DefaultIntervalCategoryDataset) d1.clone();
        assertTrue(d1 != d2);
        assertTrue(d1.getClass() == d2.getClass());
        assertTrue(d1.equals(d2));

        // check that the clone doesn't share the same underlying arrays.
        d1.setStartValue(0, "Category 1", 0.99);
        assertFalse(d1.equals(d2));
        d2.setStartValue(0, "Category 1", 0.99);
        assertTrue(d1.equals(d2));
    }

    