@Test
    public void testSerialization() {
        ScatterRenderer r1 = new ScatterRenderer();
        ScatterRenderer r2 = (ScatterRenderer) TestUtils.serialised(r1);
        assertEquals(r1, r2);
    }

    