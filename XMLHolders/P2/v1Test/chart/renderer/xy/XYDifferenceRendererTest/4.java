@Test
    public void testSerialization() {
        XYDifferenceRenderer r1 = new XYDifferenceRenderer(Color.RED,
                Color.BLUE, false);
        XYDifferenceRenderer r2 = (XYDifferenceRenderer) 
                TestUtils.serialised(r1);
        assertEquals(r1, r2);
    }

    