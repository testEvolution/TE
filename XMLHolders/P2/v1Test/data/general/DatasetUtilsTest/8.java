@Test
    public void testIterateDomainBounds_NaN() {
        DefaultXYDataset dataset = new DefaultXYDataset();
        double[] x = new double[] {1.0, 2.0, Double.NaN, 3.0};
        double[] y = new double[] {9.0, 8.0, 7.0, 6.0};
        dataset.addSeries("S1", new double[][] {x, y});
        Range r = DatasetUtils.iterateDomainBounds(dataset);
        assertEquals(1.0, r.getLowerBound(), EPSILON);
        assertEquals(3.0, r.getUpperBound(), EPSILON);
    }

    