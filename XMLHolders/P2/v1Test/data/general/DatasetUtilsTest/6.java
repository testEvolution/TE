@Test
    public void testFindDomainBounds_NaN() {
        DefaultIntervalXYDataset dataset = new DefaultIntervalXYDataset();
        double[] x1 = new double[] {1.0, 2.0, Double.NaN};
        double[] x1Start = new double[] {0.9, 1.9, Double.NaN};
        double[] x1End = new double[] {1.1, 2.1, Double.NaN};
        double[] y1 = new double[] {4.0, 5.0, 6.0};
        double[] y1Start = new double[] {1.09, 2.09, 3.09};
        double[] y1End = new double[] {1.11, 2.11, 3.11};
        double[][] data1 = new double[][] {x1, x1Start, x1End, y1, y1Start,
                y1End};
        dataset.addSeries("S1", data1);
        Range r = DatasetUtils.findDomainBounds(dataset);
        assertEquals(0.9, r.getLowerBound(), EPSILON);
        assertEquals(2.1, r.getUpperBound(), EPSILON);

        r = DatasetUtils.findDomainBounds(dataset, false);
        assertEquals(1.0, r.getLowerBound(), EPSILON);
        assertEquals(2.0, r.getUpperBound(), EPSILON);
    }

    