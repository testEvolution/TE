@Test
    public void testSerialization() {
        MeanAndStandardDeviation m1 = new MeanAndStandardDeviation(1.2, 3.4);
        MeanAndStandardDeviation m2 = (MeanAndStandardDeviation) 
                TestUtils.serialised(m1);
        assertEquals(m1, m2);
    }
}