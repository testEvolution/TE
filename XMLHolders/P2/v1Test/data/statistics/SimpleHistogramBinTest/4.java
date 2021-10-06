@Test
    public void testSerialization() {
        SimpleHistogramBin b1 = new SimpleHistogramBin(1.0, 2.0, false, true);
        b1.setItemCount(123);
        SimpleHistogramBin b2 = (SimpleHistogramBin) TestUtils.serialised(b1);
        assertEquals(b1, b2);
    }

}