@Test
    public void testRemoveSeries() {
        XYSeriesCollection c = new XYSeriesCollection();
        XYSeries s1 = new XYSeries("s1");
        c.addSeries(s1);
        c.removeSeries(0);
        assertEquals(0, c.getSeriesCount());
        c.addSeries(s1);

        try {
            c.removeSeries(-1);
            fail("Should have thrown IndexOutOfBoundsException on negative key");
        }
        catch (IllegalArgumentException e) {
            assertEquals("Series index out of bounds.", e.getMessage());
        }

        try {
            c.removeSeries(1);
            fail("Should have thrown IndexOutOfBoundsException on key out of range");
        }
        catch (IllegalArgumentException e) {
            assertEquals("Series index out of bounds.", e.getMessage());
        }
    }

    