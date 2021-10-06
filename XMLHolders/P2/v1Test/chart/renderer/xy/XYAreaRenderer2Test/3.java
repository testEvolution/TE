@Test
    public void testPublicCloneable() {
        XYAreaRenderer2 r1 = new XYAreaRenderer2();
        assertTrue(r1 instanceof PublicCloneable);
    }

    