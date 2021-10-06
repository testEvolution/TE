@Test
    public void testSerialization() {
        DefaultKeyedValue v1 = new DefaultKeyedValue("Test", 25.3);
        DefaultKeyedValue v2 = (DefaultKeyedValue) TestUtils.serialised(v1);
        assertEquals(v1, v2);
    }

}