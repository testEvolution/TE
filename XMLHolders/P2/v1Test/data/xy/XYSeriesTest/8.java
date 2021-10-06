@Test
    public void testIndexOf3() {
        XYSeries s1 = new XYSeries("Series 1");
        s1.add(1.0, 1.0);
        s1.add(2.0, 2.0);
        s1.add(2.0, 3.0);
        assertEquals(0, s1.indexOf(1.0));
        assertEquals(1, s1.indexOf(2.0));
    }

    