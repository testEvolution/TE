@Test
    public void testCloning() throws CloneNotSupportedException {
        PointerNeedle n1 = new PointerNeedle();
        PointerNeedle n2 = (PointerNeedle) n1.clone();
        assertTrue(n1 != n2);
        assertTrue(n1.getClass() == n2.getClass());
        assertTrue(n1.equals(n2));
    }

    