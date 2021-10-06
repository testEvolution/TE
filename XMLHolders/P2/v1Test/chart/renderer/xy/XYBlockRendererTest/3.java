@Test
    public void testPublicCloneable() {
        XYBlockRenderer r1 = new XYBlockRenderer();
        assertTrue(r1 instanceof PublicCloneable);
    }

    