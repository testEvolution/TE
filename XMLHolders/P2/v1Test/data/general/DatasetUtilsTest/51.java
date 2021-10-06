@Test
    public void testIterateToFindRangeBounds_IntervalXYDataset() {
        DefaultIntervalXYDataset dataset = new DefaultIntervalXYDataset();
        double[] x1 = new double[] {0.8, 3.2, 3.0};
        double[] x1Start = new double[] {0.9, 1.9, 2.9};
        double[] x1End = new double[] {1.1, 2.1, 3.1};
        double[] y1 = new double[] {4.0, -5.0, 6.0};
        double[] y1Start = new double[] {1.09, 2.09, 3.09};
        double[] y1End = new double[] {1.11, 2.11, 3.11};
        double[][] data1 = new double[][] {x1, x1Start, x1End, y1, y1Start,
                y1End};
        dataset.addSeries("S1", data1);
        Range r = DatasetUtils.iterateToFindRangeBounds(dataset,
                Arrays.asList("S1"), new Range(0.0, 4.0), true);
        assertEquals(-5.0, r.getLowerBound(), EPSILON);
        assertEquals(6.0, r.getUpperBound(), EPSILON);
    }

    