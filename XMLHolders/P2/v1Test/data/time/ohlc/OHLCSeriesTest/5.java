@Test
    public void testIndexOf() {
        OHLCSeries s1 = new OHLCSeries("s1");
        s1.add(new Year(2006), 2.0, 4.0, 1.0, 3.0);
        s1.add(new Year(2011), 2.0, 4.0, 1.0, 3.0);
        s1.add(new Year(2010), 2.0, 4.0, 1.0, 3.0);
        assertEquals(0, s1.indexOf(new Year(2006)));
        assertEquals(1, s1.indexOf(new Year(2010)));
        assertEquals(2, s1.indexOf(new Year(2011)));
    }

    