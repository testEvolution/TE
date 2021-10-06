@Test
    public void testSerialization() {
        BarRenderer r1 = new BarRenderer();
        BarRenderer r2 = (BarRenderer) TestUtils.serialised(r1);
        assertEquals(r1, r2);
    }

    