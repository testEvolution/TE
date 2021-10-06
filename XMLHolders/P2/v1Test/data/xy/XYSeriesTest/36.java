@Test
    public void testSetKey() {
        XYSeries s1 = new XYSeries("S");
        s1.setKey("S1");
        assertEquals("S1", s1.getKey());
        
        XYSeriesCollection c = new XYSeriesCollection();
        c.addSeries(s1);
        XYSeries s2 = new XYSeries("S2");
        c.addSeries(s2);
        
        // now we should be allowed to change s1's key to anything but "S2"
        s1.setKey("OK");
        assertEquals("OK", s1.getKey());
        
        try {
            s1.setKey("S2");
            fail("Expect an exception here.");
        } catch (IllegalArgumentException e) {
            // OK
        }
        
        // after s1 is removed from the collection, we should be able to set
        // the key to anything we want...
        c.removeSeries(s1);
        s1.setKey("S2");
        
        // check that removing by index also works
        s1.setKey("S1");
        c.addSeries(s1);
        c.removeSeries(1);
        s1.setKey("S2");
    }
}