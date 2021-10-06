@Test
    public void testEquals() {
        LevelRenderer r1 = new LevelRenderer();
        LevelRenderer r2 = new LevelRenderer();
        assertTrue(r1.equals(r2));
        assertTrue(r2.equals(r1));

        r1.setItemMargin(0.123);
        assertFalse(r1.equals(r2));
        r2.setItemMargin(0.123);
        assertTrue(r1.equals(r2));

        r1.setMaximumItemWidth(0.234);
        assertFalse(r1.equals(r2));
        r2.setMaximumItemWidth(0.234);
        assertTrue(r1.equals(r2));

    }

    