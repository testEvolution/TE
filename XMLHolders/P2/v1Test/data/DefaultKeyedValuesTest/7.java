@Test
    public void testGetIndex2() {
        DefaultKeyedValues v = new DefaultKeyedValues();
        assertEquals(-1, v.getIndex("K1"));
        v.addValue("K1", 1.0);
        assertEquals(0, v.getIndex("K1"));
        v.removeValue("K1");
        assertEquals(-1, v.getIndex("K1"));
    }
    