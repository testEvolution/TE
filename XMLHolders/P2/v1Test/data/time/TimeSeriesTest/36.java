@Test
    public void testGetMaxY() {
        TimeSeries s1 = new TimeSeries("S1");
        assertTrue(Double.isNaN(s1.getMaxY()));

        s1.add(new Year(2008), 1.1);
        assertEquals(1.1, s1.getMaxY(), EPSILON);

        s1.add(new Year(2009), 2.2);
        assertEquals(2.2, s1.getMaxY(), EPSILON);

        s1.add(new Year(2000), 99.9);
        assertEquals(99.9, s1.getMaxY(), EPSILON);

        s1.add(new Year(2002), -1.1);
        assertEquals(99.9, s1.getMaxY(), EPSILON);

        s1.add(new Year(2003), null);
        assertEquals(99.9, s1.getMaxY(), EPSILON);

        s1.addOrUpdate(new Year(2000), null);
        assertEquals(2.2, s1.getMaxY(), EPSILON);
    }

    