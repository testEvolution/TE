@Test
    public void testHashCode() {
        Crosshair c1 = new Crosshair(1.0);
        Crosshair c2 = new Crosshair(1.0);
        assertTrue(c1.equals(c2));
        assertTrue(c1.hashCode() == c2.hashCode());
    }

    