@Test
    public void testEquals() {
        AreaRenderer r1 = new AreaRenderer();
        AreaRenderer r2 = new AreaRenderer();
        assertEquals(r1, r2);

        r1.setEndType(AreaRendererEndType.LEVEL);
        assertFalse(r1.equals(r2));
        r2.setEndType(AreaRendererEndType.LEVEL);
        assertTrue(r1.equals(r2));
    }

    