@Test
    public void testIndexOf2() {
        VectorSeries s1 = new VectorSeries("Series 1");
        s1.add(1.0, 1.0, 1.0, 2.0);
        s1.add(3.0, 3.0, 3.0, 3.0);
        s1.add(2.0, 2.0, 2.0, 2.0);
        assertEquals(0, s1.indexOf(new XYCoordinate(1.0, 1.0)));
        assertEquals(1, s1.indexOf(new XYCoordinate(3.0, 3.0)));
        assertEquals(2, s1.indexOf(new XYCoordinate(2.0, 2.0)));
    }

    