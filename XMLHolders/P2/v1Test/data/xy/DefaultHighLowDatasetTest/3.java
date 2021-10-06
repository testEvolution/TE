@Test
    public void testSerialization() {
        DefaultHighLowDataset d1 = new DefaultHighLowDataset("Series 1",
                new Date[] {new Date(123L)}, new double[] {1.2},
                new double[] {3.4}, new double[] {5.6}, new double[] {7.8},
                new double[] {99.9});
        DefaultHighLowDataset d2 = (DefaultHighLowDataset) 
                TestUtils.serialised(d1);
        assertEquals(d1, d2);
    }

}