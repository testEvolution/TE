@Test
    public void testGetSeriesByKey() {
        XYSeriesCollection c = new XYSeriesCollection();
        XYSeries s1 = new XYSeries("s1");
        c.addSeries(s1);
        assertEquals("s1", c.getSeries("s1").getKey());

        try {
            c.getSeries("s2");
            fail("Should have thrown UnknownKeyException on unknown key");
        }
        catch (UnknownKeyException e) {
            assertEquals("Key not found: s2", e.getMessage());
        }

        try {
            c.getSeries(null);
            fail("Should have thrown IndexOutOfBoundsException on null key");
        }
        catch (IllegalArgumentException e) {
            assertEquals("Null 'key' argument.", e.getMessage());
        }
    }
    
    