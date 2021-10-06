@Test
    public void testEquals() {
        PowerFunction2D f1 = new PowerFunction2D(1.0, 2.0);
        PowerFunction2D f2 = new PowerFunction2D(1.0, 2.0);
        assertTrue(f1.equals(f2));
        f1 = new PowerFunction2D(2.0, 3.0);
        assertFalse(f1.equals(f2));
        f2 = new PowerFunction2D(2.0, 3.0);
        assertTrue(f1.equals(f2));
    }

    