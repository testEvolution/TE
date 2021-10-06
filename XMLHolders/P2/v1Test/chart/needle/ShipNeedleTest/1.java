@Test
    public void testCloning() throws CloneNotSupportedException {
        ShipNeedle n1 = new ShipNeedle();
        ShipNeedle n2 = (ShipNeedle) n1.clone();
        assertTrue(n1 != n2);
        assertTrue(n1.getClass() == n2.getClass());
        assertTrue(n1.equals(n2));
    }

    