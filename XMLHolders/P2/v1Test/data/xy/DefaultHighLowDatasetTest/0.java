@Test
    public void testEquals() {
        DefaultHighLowDataset d1 = new DefaultHighLowDataset("Series 1",
                new Date[0], new double[0], new double[0], new double[0],
                new double[0], new double[0]);
        DefaultHighLowDataset d2 = new DefaultHighLowDataset("Series 1",
                new Date[0], new double[0], new double[0], new double[0],
                new double[0], new double[0]);
        assertTrue(d1.equals(d2));
        assertTrue(d2.equals(d1));

        d1 = new DefaultHighLowDataset("Series 2",
                new Date[0], new double[0], new double[0], new double[0],
                new double[0], new double[0]);
        assertFalse(d1.equals(d2));
        d2 = new DefaultHighLowDataset("Series 2",
                new Date[0], new double[0], new double[0], new double[0],
                new double[0], new double[0]);
        assertTrue(d1.equals(d2));

        d1 = new DefaultHighLowDataset("Series 2",
                new Date[] {new Date(123L)}, new double[1], new double[1],
                new double[1], new double[1], new double[1]);
        assertFalse(d1.equals(d2));
        d2 = new DefaultHighLowDataset("Series 2",
                new Date[] {new Date(123L)}, new double[1], new double[1],
                new double[1], new double[1], new double[1]);
        assertTrue(d1.equals(d2));

        d1 = new DefaultHighLowDataset("Series 2",
                new Date[] {new Date(123L)}, new double[] {1.2}, new double[1],
                new double[1], new double[1], new double[1]);
        assertFalse(d1.equals(d2));
        d2 = new DefaultHighLowDataset("Series 2",
                new Date[] {new Date(123L)}, new double[] {1.2}, new double[1],
                new double[1], new double[1], new double[1]);
        assertTrue(d1.equals(d2));

        d1 = new DefaultHighLowDataset("Series 2",
                new Date[] {new Date(123L)}, new double[] {1.2},
                new double[] {3.4}, new double[1], new double[1],
                new double[1]);
        assertFalse(d1.equals(d2));
        d2 = new DefaultHighLowDataset("Series 2",
                new Date[] {new Date(123L)}, new double[] {1.2},
                new double[] {3.4}, new double[1], new double[1],
                new double[1]);
        assertTrue(d1.equals(d2));

        d1 = new DefaultHighLowDataset("Series 2",
                new Date[] {new Date(123L)}, new double[] {1.2},
                new double[] {3.4}, new double[] {5.6}, new double[1],
                new double[1]);
        assertFalse(d1.equals(d2));
        d2 = new DefaultHighLowDataset("Series 2",
                new Date[] {new Date(123L)}, new double[] {1.2},
                new double[] {3.4}, new double[] {5.6}, new double[1],
                new double[1]);
        assertTrue(d1.equals(d2));

        d1 = new DefaultHighLowDataset("Series 2",
                new Date[] {new Date(123L)}, new double[] {1.2},
                new double[] {3.4}, new double[] {5.6}, new double[] {7.8},
                new double[1]);
        assertFalse(d1.equals(d2));
        d2 = new DefaultHighLowDataset("Series 2",
                new Date[] {new Date(123L)}, new double[] {1.2},
                new double[] {3.4}, new double[] {5.6}, new double[] {7.8},
                new double[1]);
        assertTrue(d1.equals(d2));

        d1 = new DefaultHighLowDataset("Series 2",
                new Date[] {new Date(123L)}, new double[] {1.2},
                new double[] {3.4}, new double[] {5.6}, new double[] {7.8},
                new double[] {99.9});
        assertFalse(d1.equals(d2));
        d2 = new DefaultHighLowDataset("Series 2",
                new Date[] {new Date(123L)}, new double[] {1.2},
                new double[] {3.4}, new double[] {5.6}, new double[] {7.8},
                new double[] {99.9});
        assertTrue(d1.equals(d2));

    }

    