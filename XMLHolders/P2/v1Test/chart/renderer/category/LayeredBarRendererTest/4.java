@Test
    public void testSerialization() {
        LayeredBarRenderer r1 = new LayeredBarRenderer();
        LayeredBarRenderer r2 = (LayeredBarRenderer) TestUtils.serialised(r1);
        assertEquals(r1, r2);
    }

    