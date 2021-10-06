@Test
    public void testSerialization() {
        OHLCDataItem i1 = new OHLCDataItem(new Date(1L), 1.0, 2.0, 3.0, 4.0, 
                5.0);
        OHLCDataItem i2 = (OHLCDataItem) TestUtils.serialised(i1);
        assertEquals(i1, i2);
    }

}