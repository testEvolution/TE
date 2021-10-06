@Test
    public void testSerialization() {
        YIntervalSeries s1 = new YIntervalSeries("s1");
        s1.add(1.0, 0.5, 1.5, 2.0);
        YIntervalSeries s2 = (YIntervalSeries) TestUtils.serialised(s1);
        assertEquals(s1, s2);
    }

    