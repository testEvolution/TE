@Test
    public void testSetMaximumItemCount() {
        TimeSeries s1 = new TimeSeries("S1");
        s1.add(new Year(2000), 13.75);
        s1.add(new Year(2001), 11.90);
        s1.add(new Year(2002), null);
        s1.add(new Year(2005), 19.32);
        s1.add(new Year(2007), 16.89);
        assertTrue(s1.getItemCount() == 5);

        s1.setMaximumItemCount(3);
        assertTrue(s1.getItemCount() == 3);
        TimeSeriesDataItem item = s1.getDataItem(0);
        assertTrue(item.getPeriod().equals(new Year(2002)));
        assertEquals(16.89, s1.getMinY(), EPSILON);
        assertEquals(19.32, s1.getMaxY(), EPSILON);
    }

    