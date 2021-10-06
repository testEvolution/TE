@Test
    public void testEquals() {
        assertEquals(AreaRendererEndType.LEVEL, AreaRendererEndType.LEVEL);
        assertEquals(AreaRendererEndType.TAPER, AreaRendererEndType.TAPER);
        assertEquals(
            AreaRendererEndType.TRUNCATE, AreaRendererEndType.TRUNCATE
        );
    }

    