@Test
    public void testSerialization() {
        DefaultKeyedValues v1 = new DefaultKeyedValues();
        v1.addValue("Key 1", 23);
        v1.addValue("Key 2", null);
        v1.addValue("Key 3", 42);

        DefaultKeyedValues v2 = (DefaultKeyedValues) 
                TestUtils.serialised(v1);
        assertEquals(v1, v2);
    }

}