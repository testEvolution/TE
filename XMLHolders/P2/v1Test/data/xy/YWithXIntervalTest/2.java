@Test
    public void testSerialization() {
        YWithXInterval i1 = new YWithXInterval(1.0, 0.5, 1.5);
        YWithXInterval i2 = (YWithXInterval) TestUtils.serialised(i1);
        assertEquals(i1, i2);
    }

}