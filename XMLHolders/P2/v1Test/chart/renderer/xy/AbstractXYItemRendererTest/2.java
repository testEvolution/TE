@Test
    public void testFindRangeBounds() {
        AbstractXYItemRenderer renderer = new StandardXYItemRenderer();
        // check that a null dataset returns null bounds
        assertTrue(renderer.findRangeBounds(null) == null);
    }

    