@Test
    public void testSerialization() {
        DialValueIndicator i1 = new DialValueIndicator(0);
        DialValueIndicator i2 = (DialValueIndicator) 
                TestUtils.serialised(i1);
        assertEquals(i1, i2);
    }

}