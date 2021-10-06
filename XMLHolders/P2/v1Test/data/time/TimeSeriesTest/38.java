@Test
    public void testClear() {
        TimeSeries s1 = new TimeSeries("S1");
        s1.add(new Year(2009), 1.1);
        s1.add(new Year(2010), 2.2);

        assertEquals(2, s1.getItemCount());

        s1.clear();
        assertEquals(0, s1.getItemCount());
        assertTrue(Double.isNaN(s1.getMinY()));
        assertTrue(Double.isNaN(s1.getMaxY()));
    }

    