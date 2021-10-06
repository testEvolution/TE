@Test
    public void testSerialization() {
        IntervalMarker m1 = new IntervalMarker(45.0, 50.0);
        IntervalMarker m2 = (IntervalMarker) TestUtils.serialised(m1);
        assertEquals(m1, m2);
    }

    