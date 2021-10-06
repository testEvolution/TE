@Test
    public void testSerialization() {
        XYAreaRenderer r1 = new XYAreaRenderer();
        XYAreaRenderer r2 = (XYAreaRenderer) TestUtils.serialised(r1);
        assertEquals(r1, r2);
    }

    