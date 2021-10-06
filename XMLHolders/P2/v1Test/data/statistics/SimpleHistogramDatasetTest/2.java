@Test
    public void testSerialization() {
        SimpleHistogramDataset d1 = new SimpleHistogramDataset("D1");
        SimpleHistogramDataset d2 = (SimpleHistogramDataset) 
                TestUtils.serialised(d1);
        assertEquals(d1, d2);
    }

    