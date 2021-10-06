@Test
    public void testSerialization() {
        VectorSeries s1 = new VectorSeries("s1");
        s1.add(1.0, 0.5, 1.5, 2.0);
        VectorSeries s2 = (VectorSeries) TestUtils.serialised(s1);
        assertEquals(s1, s2);
    }

    