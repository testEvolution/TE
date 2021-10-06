@Test
    public void testSerialization() {
        XYBlockRenderer r1 = new XYBlockRenderer();
        XYBlockRenderer r2 = (XYBlockRenderer) TestUtils.serialised(r1);
        assertEquals(r1, r2);
    }

    