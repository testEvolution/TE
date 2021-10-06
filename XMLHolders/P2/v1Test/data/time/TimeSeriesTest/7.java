@Test
    public void testDelete2() {
        TimeSeries s1 = new TimeSeries("Series");
        s1.add(new Year(2000), 13.75);
        s1.add(new Year(2001), 11.90);
        s1.add(new Year(2002), null);
        s1.addChangeListener(this);
        this.gotSeriesChangeEvent = false;
        s1.delete(new Year(2001));
        assertTrue(this.gotSeriesChangeEvent);
        assertEquals(2, s1.getItemCount());
        assertEquals(null, s1.getValue(new Year(2001)));

        // try deleting a time period that doesn't exist...
        this.gotSeriesChangeEvent = false;
        s1.delete(new Year(2006));
        assertFalse(this.gotSeriesChangeEvent);

        // try deleting null
        try {
            s1.delete(null);
            fail("Expected IllegalArgumentException.");
        }
        catch (IllegalArgumentException e) {
            // expected
        }
    }

    