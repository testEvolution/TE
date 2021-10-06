@Test
    public void testUpdate_RegularTimePeriod() {
        TimeSeries s1 = new TimeSeries("S1");
        s1.add(new Year(2010), 1.1);
        s1.add(new Year(2011), 2.2);
        s1.add(new Year(2012), 3.3);
        s1.update(new Year(2012), 4.4);
        assertEquals(4.4, s1.getMaxY(), EPSILON);
        s1.update(new Year(2010), 0.5);
        assertEquals(0.5, s1.getMinY(), EPSILON);
        s1.update(new Year(2012), null);
        assertEquals(2.2, s1.getMaxY(), EPSILON);
        s1.update(new Year(2010), null);
        assertEquals(2.2, s1.getMinY(), EPSILON);
    }

    