@Test
    public void testIndexOf2() {
        XIntervalSeries s1 = new XIntervalSeries("Series 1", false, true);
        s1.add(1.0, 1.0, 1.0, 2.0);
        s1.add(3.0, 3.0, 3.0, 3.0);
        s1.add(2.0, 2.0, 2.0, 2.0);
        assertEquals(0, s1.indexOf(1.0));
        assertEquals(1, s1.indexOf(3.0));
        assertEquals(2, s1.indexOf(2.0));
    }

    