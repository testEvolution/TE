@Test
    public void testSetStartValue() {
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
        d1.setStartValue(0, "Category 2", 99.9);
        assertEquals(99.9, d1.getStartValue("Series 1", "Category 2"));

        boolean pass = false;
        try {
            d1.setStartValue(-1, "Category 2", 99.9);
        }
        catch (IllegalArgumentException e) {
            pass = true;
        }
        assertTrue(pass);

        pass = false;
        try {
            d1.setStartValue(2, "Category 2", 99.9);
        }
        catch (IllegalArgumentException e) {
            pass = true;
        }
        assertTrue(pass);
    }

    