@Test
    public void testEquals() {
        OHLCDataItem i1 = new OHLCDataItem(new Date(1L), 1.0, 2.0, 3.0, 4.0, 
                5.0);
        OHLCDataItem i2 = new OHLCDataItem(new Date(1L), 1.0, 2.0, 3.0, 4.0, 
                5.0);
        assertTrue(i1.equals(i2));
        assertTrue(i2.equals(i1));
    }

    