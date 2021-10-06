@Test
    public void testEquals() {
        ModuloAxis a1 = new ModuloAxis("Test", new Range(0.0, 1.0));
        ModuloAxis a2 = new ModuloAxis("Test", new Range(0.0, 1.0));
        assertTrue(a1.equals(a2));

        a1.setDisplayRange(0.1, 1.1);
        assertFalse(a1.equals(a2));
        a2.setDisplayRange(0.1, 1.1);
        assertTrue(a1.equals(a2));
    }

    