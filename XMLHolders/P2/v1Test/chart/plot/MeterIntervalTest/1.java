@Test
    public void testCloning() {
        MeterInterval m1 = new MeterInterval("X", new Range(1.0, 2.0));
        assertFalse(m1 instanceof Cloneable);
    }

   