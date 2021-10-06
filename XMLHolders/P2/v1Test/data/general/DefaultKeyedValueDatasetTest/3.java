@Test
    public void testSerialization() {
        DefaultKeyedValueDataset d1
                = new DefaultKeyedValueDataset("Test", 25.3);
        DefaultKeyedValueDataset d2 = (DefaultKeyedValueDataset) 
                TestUtils.serialised(d1);
        assertEquals(d1, d2);
    }

}