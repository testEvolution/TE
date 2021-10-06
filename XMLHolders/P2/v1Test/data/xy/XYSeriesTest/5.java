@Test
    public void testSerialization() {
        XYSeries s1 = new XYSeries("Series");
        s1.add(1.0, 1.1);
        XYSeries s2 = (XYSeries) TestUtils.serialised(s1);
        assertEquals(s1, s2);
    }

    