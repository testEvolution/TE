@Test
    public void testEquals() {
        PiePlot3D p1 = new PiePlot3D();
        PiePlot3D p2 = new PiePlot3D();
        assertTrue(p1.equals(p2));
        assertTrue(p2.equals(p1));

        p1.setDepthFactor(1.23);
        assertFalse(p1.equals(p2));
        p2.setDepthFactor(1.23);
        assertTrue(p1.equals(p2));

        p1.setDarkerSides(true);
        assertFalse(p1.equals(p2));
        p2.setDarkerSides(true);
        assertTrue(p1.equals(p2));
    }

    