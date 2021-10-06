@Test
    public void testClone2() throws CloneNotSupportedException {
        TimeSeries s1 = new TimeSeries("S1");
        s1.add(new Year(2007), 100.0);
        s1.add(new Year(2008), null);
        s1.add(new Year(2009), 200.0);
        TimeSeries s2 = (TimeSeries) s1.clone();
        assertTrue(s1.equals(s2));

        // check independence
        s2.addOrUpdate(new Year(2009), 300.0);
        assertFalse(s1.equals(s2));
        s1.addOrUpdate(new Year(2009), 300.0);
        assertTrue(s1.equals(s2));
    }

    