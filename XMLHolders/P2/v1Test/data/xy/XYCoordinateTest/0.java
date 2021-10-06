@Test
    public void testEquals() {
        // default instances
        XYCoordinate v1 = new XYCoordinate(1.0, 2.0);
        XYCoordinate v2 = new XYCoordinate(1.0, 2.0);
        assertTrue(v1.equals(v2));
        assertTrue(v2.equals(v1));

        v1 = new XYCoordinate(1.1, 2.0);
        assertFalse(v1.equals(v2));
        v2 = new XYCoordinate(1.1, 2.0);
        assertTrue(v1.equals(v2));

        v1 = new XYCoordinate(1.1, 2.2);
        assertFalse(v1.equals(v2));
        v2 = new XYCoordinate(1.1, 2.2);
        assertTrue(v1.equals(v2));
    }

    