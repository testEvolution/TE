@Test
    public void testCloning() throws CloneNotSupportedException {
        DefaultHighLowDataset d1 = new DefaultHighLowDataset("Series 1",
                new Date[] {new Date(123L)}, new double[] {1.2},
                new double[] {3.4}, new double[] {5.6}, new double[] {7.8},
                new double[] {99.9});
        DefaultHighLowDataset d2 = (DefaultHighLowDataset) d1.clone();
        assertTrue(d1 != d2);
        assertTrue(d1.getClass() == d2.getClass());
        assertTrue(d1.equals(d2));
    }

    