@Test
    public void testCloning() {
        NumberTickUnit t1 = new NumberTickUnit(1.23, new DecimalFormat("0.00"));
        assertFalse(t1 instanceof Cloneable);
    }

    