@Test
    public void testDelete3() {
        TimeSeries s1 = new TimeSeries("S1");
        s1.add(new Year(2011), 1.1);
        s1.add(new Year(2012), 2.2);
        s1.add(new Year(2013), 3.3);
        s1.add(new Year(2014), 4.4);
        s1.add(new Year(2015), 5.5);
        s1.add(new Year(2016), 6.6);
        s1.delete(2, 5);
        assertEquals(2, s1.getItemCount());
        assertEquals(new Year(2011), s1.getTimePeriod(0));
        assertEquals(new Year(2012), s1.getTimePeriod(1));
        assertEquals(1.1, s1.getMinY(), EPSILON);
        assertEquals(2.2, s1.getMaxY(), EPSILON);
    }

    