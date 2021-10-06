@Test
    public void testGetSeries() {
        XYSeriesCollection c = new XYSeriesCollection();
        XYSeries s1 = new XYSeries("s1");
        c.addSeries(s1);
        assertEquals("s1", c.getSeries(0).getKey());

        try {
            c.getSeries(-1);
            fail("Should have thrown IndexOutOfBoundsException on negative key");
        }
        catch (IllegalArgumentException e) {
            assertEquals("Series index out of bounds", e.getMessage());
        }

        try {
            c.getSeries(1);
            fail("Should have thrown IndexOutOfBoundsException on key out of range");
        }
        catch (IllegalArgumentException e) {
            assertEquals("Series index out of bounds", e.getMessage());
        }
    }

    