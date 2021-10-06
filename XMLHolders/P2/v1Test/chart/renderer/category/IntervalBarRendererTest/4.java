@Test
    public void testSerialization() {
        IntervalBarRenderer r1 = new IntervalBarRenderer();
        IntervalBarRenderer r2 = (IntervalBarRenderer) TestUtils.serialised(r1);
        assertEquals(r1, r2);
    }

    