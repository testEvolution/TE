@Test
    public void testSerialization1() {
        StrokeMap m1 = new StrokeMap();
        StrokeMap m2 = (StrokeMap) TestUtils.serialised(m1);
        assertEquals(m1, m2);
    }

    