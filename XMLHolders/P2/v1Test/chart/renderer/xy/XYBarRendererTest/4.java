@Test
    public void testSerialization() {
        XYBarRenderer r1 = new XYBarRenderer();
        XYBarRenderer r2 = (XYBarRenderer) TestUtils.serialised(r1);
        assertEquals(r1, r2);
    }

    