@Test
    public void testEquals() {
        LineFunction2D f1 = new LineFunction2D(1.0, 2.0);
        LineFunction2D f2 = new LineFunction2D(1.0, 2.0);
        assertEquals(f1, f2);
        f1 = new LineFunction2D(2.0, 3.0);
        assertNotEquals(f1, f2);
        f2 = new LineFunction2D(2.0, 3.0);
        assertEquals(f1, f2);
    }

    