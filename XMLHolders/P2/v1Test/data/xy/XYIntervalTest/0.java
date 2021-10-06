@Test
    public void testEquals() {
        XYInterval i1 = new XYInterval(1.0, 2.0, 3.0, 2.5, 3.5);
        XYInterval i2 = new XYInterval(1.0, 2.0, 3.0, 2.5, 3.5);
        assertEquals(i1, i2);

        i1 = new XYInterval(1.1, 2.0, 3.0, 2.5, 3.5);
        assertFalse(i1.equals(i2));
        i2 = new XYInterval(1.1, 2.0, 3.0, 2.5, 3.5);
        assertTrue(i1.equals(i2));

        i1 = new XYInterval(1.1, 2.2, 3.0, 2.5, 3.5);
        assertFalse(i1.equals(i2));
        i2 = new XYInterval(1.1, 2.2, 3.0, 2.5, 3.5);
        assertTrue(i1.equals(i2));

        i1 = new XYInterval(1.1, 2.2, 3.3, 2.5, 3.5);
        assertFalse(i1.equals(i2));
        i2 = new XYInterval(1.1, 2.2, 3.3, 2.5, 3.5);
        assertTrue(i1.equals(i2));

        i1 = new XYInterval(1.1, 2.2, 3.3, 2.6, 3.5);
        assertFalse(i1.equals(i2));
        i2 = new XYInterval(1.1, 2.2, 3.3, 2.6, 3.5);
        assertTrue(i1.equals(i2));

        i1 = new XYInterval(1.1, 2.2, 3.3, 2.6, 3.6);
        assertFalse(i1.equals(i2));
        i2 = new XYInterval(1.1, 2.2, 3.3, 2.6, 3.6);
        assertTrue(i1.equals(i2));
    }

    