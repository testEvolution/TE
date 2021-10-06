@Test
    public void testSerialization() {
        AreaRenderer r1 = new AreaRenderer();
        AreaRenderer r2 = (AreaRenderer) TestUtils.serialised(r1);
        assertEquals(r1, r2);
    }

    