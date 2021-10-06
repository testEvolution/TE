@Test
    public void testSerialization()  {
        XIntervalSeries s1 = new XIntervalSeries("s1");
        s1.add(1.0, 0.5, 1.5, 2.0);
        XIntervalSeries s2 = (XIntervalSeries) TestUtils.serialised(s1);
        assertEquals(s1, s2);
    }

    