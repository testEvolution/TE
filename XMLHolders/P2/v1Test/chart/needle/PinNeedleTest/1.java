@Test
    public void testCloning() throws CloneNotSupportedException {
        PinNeedle n1 = new PinNeedle();
        PinNeedle n2 = (PinNeedle) n1.clone();
        assertTrue(n1 != n2);
        assertTrue(n1.getClass() == n2.getClass());
        assertTrue(n1.equals(n2));
    }

    