@Test
    public void testGetTimePeriod()  {
        TimeTableXYDataset d = new TimeTableXYDataset();
        d.add(new Year(1999), 1.0, "Series 1");
        d.add(new Year(1998), 2.0, "Series 1");
        d.add(new Year(1996), 3.0, "Series 1");
        assertEquals(d.getTimePeriod(0), new Year(1996));
        assertEquals(d.getTimePeriod(1), new Year(1998));
        assertEquals(d.getTimePeriod(2), new Year(1999));
    }

    