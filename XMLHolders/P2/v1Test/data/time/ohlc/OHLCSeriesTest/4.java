@Test
    public void testSerialization() {
        OHLCSeries s1 = new OHLCSeries("s1");
        s1.add(new Year(2006), 2.0, 4.0, 1.0, 3.0);
        OHLCSeries s2 = (OHLCSeries) TestUtils.serialised(s1);
        assertEquals(s1, s2);
    }

    