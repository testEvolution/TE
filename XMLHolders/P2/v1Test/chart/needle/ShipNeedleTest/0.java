@Test
    public void testEquals() {
       ShipNeedle n1 = new ShipNeedle();
       ShipNeedle n2 = new ShipNeedle();
       assertTrue(n1.equals(n2));
       assertTrue(n2.equals(n1));
    }

    