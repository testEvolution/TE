@Test
    public void testAddOrUpdate() {
        TimeSeries s1 = new TimeSeries("S1");
        s1.setMaximumItemCount(2);
        s1.addOrUpdate(new Year(2000), 100.0);
        assertEquals(1, s1.getItemCount());
        s1.addOrUpdate(new Year(2001), 101.0);
        assertEquals(2, s1.getItemCount());
        s1.addOrUpdate(new Year(2001), 102.0);
        assertEquals(2, s1.getItemCount());
        s1.addOrUpdate(new Year(2002), 103.0);
        assertEquals(2, s1.getItemCount());
    }

    