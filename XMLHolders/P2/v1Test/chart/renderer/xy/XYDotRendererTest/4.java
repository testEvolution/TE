@Test
    public void testSerialization() {
        XYDotRenderer r1 = new XYDotRenderer();
        XYDotRenderer r2 = (XYDotRenderer) TestUtils.serialised(r1);
        assertEquals(r1, r2);
    }

    