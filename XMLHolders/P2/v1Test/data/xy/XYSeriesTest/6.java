@Test
    public void testIndexOf() {
        XYSeries s1 = new XYSeries("Series 1");
        s1.add(1.0, 1.0);
        s1.add(2.0, 2.0);
        s1.add(3.0, 3.0);
        assertEquals(0, s1.indexOf(1.0));
        assertEquals(1, s1.indexOf(2.0));
        assertEquals(2, s1.indexOf(3.0));
        assertEquals(-4, s1.indexOf(99.9));
    }

    